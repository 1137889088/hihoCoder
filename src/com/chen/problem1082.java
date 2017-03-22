package com.chen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by chen on 2017/3/14.
 */
public class problem1082 {
    public static void main(String[] args) {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String lineString;
        try {
            while((lineString = bufr.readLine()) != null){
                String fjxmlhx = Pattern.compile("(m|M)(a|A)(r|R)(s|S)(h|H)(t|T)(o|O)(m|M)(p|P)").matcher(lineString).replaceAll("fjxmlhx");
                System.out.println(fjxmlhx);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
