import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    ArrayList <Integer> output=new ArrayList<Integer>();
     //List output = new ArrayList();
    // je loopt elke keer en zoekt hoeveel keer het in de array staat
    for(int i =0;i<100;i++){
        output.add(Collections.frequency(arr, i));
    }
    return output;


   /* int n=arr.size();
    ArrayList <Integer> index=new ArrayList<Integer>();
    Collections.sort(arr);
   
   
    for(int i=0;i<100;i++){
        int count=0;
        for(int j=0;j<arr.size();j++){
            count=0;
            if(i==arr.get(j)){
                count++;
            }
            index.add(count);
        }
    }
       return index; */
    }
   
    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}