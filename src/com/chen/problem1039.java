package com.chen;

import java.util.Scanner;

public class problem1039 {
    public static int count = 0;

    public static byte[] eliminate(byte[] bytes, int insertPos, byte insert) {
        count = 0;
        int countTemp = 0;
        byte prv = 0;
        int prvPos = 0;
        for (int i = 0; i < bytes.length; i++) {
            if (i < insertPos) {
                if (bytes[i] != 0) {
                    if (bytes[i] == prv) {
                        if (countTemp == 0) {
                            bytes[i - 1] = 0;
                            countTemp++;
                        }
                        countTemp++;
                        bytes[prvPos] = 0;
                    } else {
                        prv = bytes[i];
                        prvPos = i;
                        count = count + countTemp;
                        countTemp = 0;
                    }
                }
            }
        }
        count = count + countTemp;
        return bytes;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        byte[] insert = new byte[]{'a', 'b', 'c'};
        for (int i = 0; i < sum; i++) {
            int max = 0;
            Scanner ss = new Scanner(System.in);
            String s = ss.nextLine();
            for (int j = 1; j < s.length(); j++) {
                for (byte current : insert) {
                    byte[] bytes = s.getBytes();
                    int totalCount = 0;
                    do {
                        bytes = problem1039.eliminate(bytes, i, current);
                        totalCount = totalCount + count;
                    }
                    while (count != 0);
                    if (max < totalCount) {
                        max = totalCount;
                    }
                }
                System.out.println(max);
            }
        }
    }
}
