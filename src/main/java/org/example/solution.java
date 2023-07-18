package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(String[] E) {
        int maxNumber = 0;

        List<Integer> counts = new ArrayList<>();
        int count1 =0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count0 = 0;


        for(int i=0; i<E.length; i++) {
            if((E[i]).contains("0")){
                count0++;
            }
            if(E[i].contains("1")){
                count1++;
            }
            if(E[i].contains("2")){
                count2++;
            }
            if(E[i].contains("3")){
                count3++;
            }
            if(E[i].contains("4")){
                count4++;
            }
            if(E[i].contains("5")) {
                count5++;
            }
            if(E[i].contains("6")){
                count6++;
            }
            if(E[i].contains("7")){
                count7++;
            }
            if (E[i].contains("8")){
                count8++;
            }
            if (E[i].contains("9")){
            count9++;
            }
            if(E[i].contains("0")){
                count0++;
            }
            counts.addAll(Arrays.asList(count0,count1,count2,count3,count4,count5,count6,count7,count8,count9));
        }

        maxNumber = Collections.max(counts);

        return maxNumber;
    }
}



class Solution2 {
    public int solution(String[] E) {
        int maxNumber = 0;
        List<Integer> counts = new ArrayList<>(Collections.nCopies(10, 0));

        for (String str : E) {
            for (int i = 0; i <= 9; i++) {
                if (str.contains(String.valueOf(i))) {
                    counts.set(i, counts.get(i) + 1);
                }
            }
        }
        maxNumber = Collections.max(counts);
        return maxNumber;
    }
}

class Solution3 {

    public int solution(String[] E){
        int maxOcorenza = 0;
        String [] days = {"0","1","2","3","4","5","6","7","8","9"};
        for(String day : days) {
            int occorenza = ricercaLineareOccorrenze(E, day);
            if (occorenza >= maxOcorenza) {
                maxOcorenza = occorenza;
            }
        }
        return maxOcorenza;
    }



    public static int ricercaLineareOccorrenze(String[] arr, String chiave)
    {
        int occorrenze = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i].contains(chiave))
                occorrenze++;
        return occorrenze;
    }
}

