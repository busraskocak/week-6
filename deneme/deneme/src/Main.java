import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here


        HashSet<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < t; i++) {


            String pairRepresentation = pair_left[i].compareTo(pair_right[i]) < 0 ?
                    pair_left[i] + " " + pair_right[i] : pair_right[i] + " " + pair_left[i];

            uniquePairs.add(pairRepresentation);

            System.out.println(uniquePairs.size());

        }

    }
}