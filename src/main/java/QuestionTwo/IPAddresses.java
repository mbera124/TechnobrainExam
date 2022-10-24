package QuestionTwo;


import java.util.*;
import java.util.stream.Collectors;

public class IPAddresses {
//    Map<String, Long> occurrences =
//            ipAddress.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
public static void main(String[] args) {


    List<String> ipAddress=Arrays.asList("156.34.23.65","123.43.54.165","132.98.43.1","156.34.23.65","123.43.54.165","156.34.23.65");
    Map<String,Integer> count = new HashMap<>() ;

    for (String word : ipAddress) {
        // Counts the quantity of each ip
        if (! count.containsKey(word)) {
            count.put(word, 1 ) ;
        }

        else {
            int value = count.get(word) ;
            value++ ;

            count.put(word, value) ;
        }
    }

    List <String> mostCommonIp = new ArrayList<>() ; // Max elements

    for ( Map.Entry<String,Integer> e : count.entrySet() ) {

        if (Objects.equals(e.getValue(), Collections.max(count.values()))){
            mostCommonIp.add(e.getKey()) ;
        }
    }

    System.out.println("Most commin Acess Ip adress\n"+mostCommonIp);

}


}
