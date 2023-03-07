import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Utf {


    public static void main(String[] args){
        List <String> list = new ArrayList<>();
        list.add("5");
        list.add("5");
        list.add("8");
        list.add("5");
        list.add("5");
        list.add("2");
        list.add("2");
Map <Integer, Integer> result = new HashMap<>();
        list.stream().flatMap(x -> Stream.of(x.split("[\\p{Punct}\\s]+")))
                 .map (Integer::valueOf)
                 .forEach(x -> {
             if (result.containsKey(x)){
                 result.put( x, result.get(x)+1);
             } else {
                 result.put( x, 1);
             }
         });
        System.out.println(result);
        int max = result.values().stream().reduce(Integer::max).get();

        System.out.println(max);
    }
}




