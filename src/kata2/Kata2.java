
package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1,1,2,3,4,1,2,2,3,4,5,1,5,9,8,7,6};
        Map<Integer,Integer> histograms = new Histogram(data).getHistogram();
        
        
        for (Object key : histograms.keySet()) {
            System.out.println(key + "==>" + histograms.get(key));
        }
    }
    
}

