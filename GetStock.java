
import java.util.List;
import java.util.Map;
import org.patriques.AlphaVantageConnector;
import org.patriques.TimeSeries;
import org.patriques.input.timeseries.Interval;
import org.patriques.input.timeseries.OutputSize;
import org.patriques.output.AlphaVantageException;
import org.patriques.output.timeseries.Daily;
import org.patriques.output.timeseries.IntraDay;
import org.patriques.output.timeseries.Monthly;
import org.patriques.output.timeseries.data.StockData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhang
 */
public class GetStock {
    
    public  static List<StockData> getEveryHour(String arc){
                String apiKey = "98JSUNDTZL2206OO";
    int timeout = 3000;
    AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
     List<StockData> LEveryHour = null;
    
    TimeSeries stockTimeSeries = new TimeSeries(apiConnector);
    boolean done = false;
    while(!done){
    try {   
      System.out.println("done0");
      IntraDay response = stockTimeSeries.intraDay(arc, Interval.SIXTY_MIN, OutputSize.COMPACT);
     
      Map<String, String> metaData = response.getMetaData();
      System.out.println("Information: " + metaData.get("1. Information"));
      System.out.println("Stock: " + metaData.get("2. Symbol"));
      
      LEveryHour = response.getStockData();
      LEveryHour.forEach(stock -> {
        System.out.println("date:   " + stock.getDateTime());
        System.out.println("open:   " + stock.getOpen());
        System.out.println("high:   " + stock.getHigh());
        System.out.println("low:    " + stock.getLow());
        System.out.println("close:  " + stock.getClose());
        System.out.println("volume: " + stock.getVolume());
      });


      StockDailyGraph.run(LEveryHour,LEveryHour.get(0).getDateTime().toString());
      done =true;
    } catch (AlphaVantageException e) {
      System.out.println("something went wrong");
    }
    }
       
    return LEveryHour;
    }
    public  static List<StockData> getEveryDay(String arc){
    String apiKey = "98JSUNDTZL2206OO";
    int timeout = 3000;
    AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
     List<StockData> LEveryDay = null;
    
    TimeSeries stockTimeSeries = new TimeSeries(apiConnector);
    boolean done = false;
    while(!done){
    try {   
      System.out.println("done0");
      Daily response = stockTimeSeries.daily(arc);
     
      Map<String, String> metaData = response.getMetaData();
      System.out.println("Information: " + metaData.get("1. Information"));
      System.out.println("Stock: " + metaData.get("2. Symbol"));
      
      LEveryDay = response.getStockData();
      LEveryDay.forEach(stock -> {
        System.out.println("date:   " + stock.getDateTime());
        System.out.println("open:   " + stock.getOpen());
        System.out.println("high:   " + stock.getHigh());
        System.out.println("low:    " + stock.getLow());
        System.out.println("close:  " + stock.getClose());
        System.out.println("volume: " + stock.getVolume());
      });


      StockDailyGraph.run(LEveryDay,LEveryDay.get(0).getDateTime().toString());
      done =true;
    } catch (AlphaVantageException e) {
      System.out.println("something went wrong");
    }
    }
       
    return LEveryDay;
    }
public  static List<StockData> getEveryMonth(String arc){
    String apiKey = "98JSUNDTZL2206OO";
    int timeout = 3000;
    AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
     List<StockData> LEveryMonth = null;
    
    TimeSeries stockTimeSeries = new TimeSeries(apiConnector);
    boolean done = false;
    while(!done){
    try {   
      System.out.println("done0");
      Monthly response = stockTimeSeries.monthly(arc);
     
      Map<String, String> metaData = response.getMetaData();
      System.out.println("Information: " + metaData.get("1. Information"));
      System.out.println("Stock: " + metaData.get("2. Symbol"));
      
      LEveryMonth = response.getStockData();
      LEveryMonth.forEach(stock -> {
        System.out.println("date:   " + stock.getDateTime());
        System.out.println("open:   " + stock.getOpen());
        System.out.println("high:   " + stock.getHigh());
        System.out.println("low:    " + stock.getLow());
        System.out.println("close:  " + stock.getClose());
        System.out.println("volume: " + stock.getVolume());
      });


      StockDailyGraph.run(LEveryMonth,LEveryMonth.get(0).getDateTime().toString());
      done =true;
    } catch (AlphaVantageException e) {
      System.out.println("something went wrong");
    }
    }
       
    return LEveryMonth;
    }
    
    
    
    
}
