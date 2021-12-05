package edu.neu.coe.info6205.sort.counting;

import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Benchmark_Timer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
    public static String[] teluguStringListForSort;
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Abhishikth Daniel M\\Desktop\\test\\INFO6205_FinalProject_Fall2021\\input.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                //  System.out.println(str);
                input.add(str);
            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }
        String sortType;
        double time;
        int iteration = 5;
        String[] arrinput = input.toArray(new String[0]);

        //teluguStringList = new String[i];

        int[] size = {250000, 500000, 1000000};
        for(int i =0;i<size.length;i++){
            sortType = "MSDStringSort:" + size[i] +" elements";
            int finalI = i;
            Benchmark<Object> benchmarkMSD = new Benchmark_Timer<>(sortType, a -> {
                teluguStringListForSort = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
                    , a -> new MSDStringSort().sort(teluguStringListForSort));
            time = benchmarkMSD.run(1, 5);
            System.out.println(time);

            sortType = "LSDStringSort: " + size[i] + " elements";
            Benchmark<Object> benchmarkLSD = new Benchmark_Timer<>(sortType, a -> {
                teluguStringListForSort = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
                    , a -> new LSDStringSort().sort(teluguStringListForSort));
            time = benchmarkLSD.run(1, 5);
            System.out.println(time);

            sortType = "DualPivotQuickSort: " + size[i] + " elements";
            Benchmark<Object> benchmarkDualPivotQuickSort = new Benchmark_Timer<>(sortType, a -> {
                teluguStringListForSort = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
                    , a -> new QuickSortDualPivot().sort(teluguStringListForSort));
            time = benchmarkDualPivotQuickSort.run(1, 5);
            System.out.println(time);

            sortType = "HuskySort: " + size[i] + " elements";
            Benchmark<Object> benchmarkHuskySort = new Benchmark_Timer<>(sortType, a -> {
                teluguStringListForSort = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
//                    , a -> new PureHuskySort<>(HuskyCoderFactory.asciiCoder, false, false).sort(teluguStringListForSort));
//            mean = benchmarkHuskySort.run(1, iteration, true);
//            System.out.println(mean);

        }



    }
}
