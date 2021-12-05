package edu.neu.coe.info6205.sort.counting;

import edu.neu.coe.info6205.sort.elementary.InsertionSort;
import edu.neu.coe.info6205.sort.counting.MSDStringSort;
import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Timer;
import edu.neu.coe.info6205.sort.linearithmic.QuickSort_DualPivot;
import edu.neu.coe.info6205.sort.linearithmic.TimSort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test {
    public static void main(String[] args) throws IOException {
    //    String[] inou = {"గ్రేటర్","సిద్ధంగా", "గటర" , "కొంతకాలంగా" ,"అ", "ప్రపంచవ్యాప్తంగా", "కాకి" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "పేరు", "మార్మోగుతోంది" ,  "బొగ్గు", "గత" , "కొంతకాలంగా" ,"అ",  "ప్రపంచవ్యాప్తంగా" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "మార్మోగుతోంది" ,  "బొగ్గు"};
    //    String[] inou1 = {"గ్రేటర్","సిద్ధంగా", "గటర" , "కొంతకాలంగా" ,"అ", "ప్రపంచవ్యాప్తంగా", "కాకి" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "పేరు", "మార్మోగుతోంది" ,  "బొగ్గు", "గత" , "కొంతకాలంగా" ,"అ",  "ప్రపంచవ్యాప్తంగా" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "మార్మోగుతోంది" ,  "బొగ్గు"};
        //String[] inou = {"TEST", "NEW" , "OLD","TET"};
        List<String> new1 = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Abhishikth Daniel M\\Desktop\\test\\INFO6205_FinalProject_Fall2021\\input.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
              //  System.out.println(str);
                new1.add(str);
            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }
    //    String[] newinp = new1.toArray(new String[0]);
      //  String[] newinp = new1.toArray(new String[]);
        String[] arr = new String[100];
        arr = new1.toArray(new String[0]);
   //     MSDStringSort.sort(newinp);
        //Collections.sort(new1);
     //   Collections.sort(new1, Collections.reverseOrder());


//       // System.out.println(MSDStringSort.sort(inou));
//        Timer timer = new Timer();
//        final double time = timer.repeat(5, () -> 2, t -> {
//     //       MSDStringSort.sort(newinp);
//            return null;
//        });
//        MSDStringSort.sort(inou);
//        LSDStringSort lsdStringSort = new LSDStringSort();
//          lsdStringSort.sort(inou);
//        long start = System.currentTimeMillis();
//    //    MSDStringSort.sort(newinp);
//        long end = System.currentTimeMillis();
//        long total = end-start;
    TimSort timSort = new TimSort();
    //timSort.sort(inou,0, inou.length);
        long total=0;
        long total1=0;
        for(int i =0;i<5;i++) {
//            Collections.sort(new1);
//      //      String[] newinp = new1.toArray(new String[0]);
//            long start = System.currentTimeMillis();
//            MSDStringSort.sort(newinp);
//            long end = System.currentTimeMillis();
//            total = total+(end - start);
//            long start1 = System.currentTimeMillis();
//            timSort.sort(newinp,0, newinp.length);
//            long end1 = System.currentTimeMillis();
//            total1 = total1+(end1 - start1);


        }
        System.out.println((total)/5 + "MSD");
        System.out.println((total1)/5 + "TIM" );
//        System.out.println("Time to sort "+ newinp.length + " words is " + total);
    int a = 10;

    }


}
