

import java.util.List;
import java.util.Map;
import org.patriques.AlphaVantageConnector;
import org.patriques.TimeSeries;
import org.patriques.input.timeseries.Interval;
import org.patriques.input.timeseries.OutputSize;
import org.patriques.output.AlphaVantageException;
import org.patriques.output.timeseries.IntraDay;
import org.patriques.output.timeseries.data.StockData;



public class main106 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello");
        String apiKey = "71F0P2GUBAVS3SQE";
    int timeout = 3000;
    AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
    
    TimeSeries stockTimeSeries = new TimeSeries(apiConnector);
    
    try {   
      System.out.println("done0");
      IntraDay response = stockTimeSeries.intraDay("MSFT", Interval.SIXTY_MIN, OutputSize.COMPACT);
     
      Map<String, String> metaData = response.getMetaData();
      System.out.println("Information: " + metaData.get("1. Information"));
      System.out.println("Stock: " + metaData.get("2. Symbol"));
      
      List<StockData> Lday = response.getStockData();
      Lday.forEach(stock -> {
        System.out.println("date:   " + stock.getDateTime());
        System.out.println("open:   " + stock.getOpen());
        System.out.println("high:   " + stock.getHigh());
        System.out.println("low:    " + stock.getLow());
        System.out.println("close:  " + stock.getClose());
        System.out.println("volume: " + stock.getVolume());
        
      });
      StockHourlyGraph.run(Lday,Lday.get(0).getDateTime().toString());
    } catch (AlphaVantageException e) {
      System.out.println("something went wrong");
    }
        
    
  }
}

