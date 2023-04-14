package com.mazylol.intToWords;

import java.util.ArrayList;

public class Solution {
    public String numberToWords(int num) {
        String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] suffix = {"Hundred", "Thousand", "Million", "Billion", "Trillion"};

        ArrayList<Integer> numArray = new ArrayList<Integer>();
        do {
            numArray.add(0, num % 10);
            num /= 10;
        } while (num > 0);

        StringBuilder res = new StringBuilder();

        while (!numArray.isEmpty()) {
            if (numArray.size() == 1) {
                res.append(ones[numArray.get(0)]);
                numArray.remove(0);
            } else if (numArray.size() == 2) {
                if (Integer.parseInt((numArray.get(0).toString() + numArray.get(1).toString())) < 20) {

                } else {
                    res.append(tens[numArray.get(0) - 1]);
                    res.append(ones[numArray.get(0)]);
                }
            }
        }

        return res.toString();
    }
}