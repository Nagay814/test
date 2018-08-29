 
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class CarProcessing
{
    public static void main(String[] args)
    {
 
        try
        {
        	//"{\"make\":\"Audi\",\"model\":\"A7\",\"vin\":\"90\",\"price\":\"140\"}";
        	 String json = "Car\" : [ {\"make\": \"Audi\",\"model\": \"A7\",\"vin\": \"09AGHY64352JITEG98K\",\"metadata\":{\"Color\" : \"Black\",\"Notes\" : \"Scratches on the front side of the car\"},"
        	 		+ "\"perdayrent\":{\"Price\" : 140,\"Discount\" : 15},\"metrics\" : {\"yoymaintenancecost\" : 2190.76,\"depreciation\": 2256.43,\"rentalcount\" : {\"lastweek\" : 4,\"yeartodate\" : 221}}}]";
             
             ObjectMapper mapper = new ObjectMapper();
                 List<Car> cars = (List)mapper.readValue(json, Car.class);
                 for(Car car : cars) {
                  if("Blue".equalsIgnoreCase(car.getMetadata().getColor()) && "Teslas".equalsIgnoreCase(car.getMake())) {
                	  System.out.println(car);
                  }
                 }
                 Double leastPrice = cars.get(0).getPerdayrent().getPrice();
                 Double leastDiscPrice = cars.get(0).getPerdayrent().getPrice() - cars.get(0).getPerdayrent().getDiscount();
                 int leastIndex = 0;
                 int leastDiscIndex = 0;
                 Double carExpence = cars.get(0).getMetrics().getYoymaintenancecost()+cars.get(0).getMetrics().getDepreciation();
                 int leastCarMaintenance = 0;
                 for(int i=0;i<cars.size();i++) {
                	 Car c = cars.get(i);
                	 if(c.getPerdayrent().getPrice()<leastPrice) {
                		 leastPrice = c.getPerdayrent().getPrice();
                		 leastIndex = i;
                	 }
                	 if((c.getPerdayrent().getPrice() - cars.get(i).getPerdayrent().getDiscount()) < leastDiscPrice) {
                		 leastDiscPrice = c.getPerdayrent().getPrice() - cars.get(i).getPerdayrent().getDiscount();
                		 leastDiscIndex = i;
                	 }
                	 if((cars.get(i).getMetrics().getYoymaintenancecost()+cars.get(i).getMetrics().getDepreciation()) < carExpence) {
                		 carExpence = cars.get(i).getMetrics().getYoymaintenancecost()+cars.get(i).getMetrics().getDepreciation();
                		 leastCarMaintenance = i;
                	 }
                 }
                 System.out.println("Least Per day Rent Car details are :"+cars.get(leastIndex)+" : price is :"+leastPrice);
                 System.out.println("Least Per day Rent after Discount Car details are :"+cars.get(leastDiscIndex)+" : price is :"+leastDiscPrice);
                 System.out.println("Profitable Car details are :"+cars.get(leastCarMaintenance)+" : Annual maintenance cost is :"+carExpence);
                 
                 
                 
        } catch (org.codehaus.jackson.JsonGenerationException e) {
            e.printStackTrace();
        } catch (org.codehaus.jackson.map.JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}