package edu.neu.coe.info6205.sort.counting;

import edu.neu.coe.info6205.sort.linearithmic.TimSort;
import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Benchmark_Timer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static String[] tempList;
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



        int[] size = {250000, 500000, 1000000};
        for(int i =0;i<size.length;i++){


            sortType = "MSDStringSort on " + size[i] +" words";
            int finalI = i;
            Benchmark<Object> benchmarkMSD = new Benchmark_Timer<>(sortType, a -> {
                Collections.shuffle(input);
                String[] arrinput = input.toArray(new String[0]);
                tempList = Arrays.copyOf(arrinput, size[finalI]);
              //  System.arraycopy(arrinput,0,tempList,size[i]);
                return null;
            }
                    , a -> new MSDStringSort().sort(tempList));
            time = benchmarkMSD.run(1, 5);
            System.out.println(time);

            sortType = "LSDStringSort on " + size[i] + " words";
            Benchmark<Object> benchmarkLSD = new Benchmark_Timer<>(sortType, a -> {
                Collections.shuffle(input);
                String[] arrinput = input.toArray(new String[0]);
                tempList = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
                    , a -> new LSDStringSort().sort(tempList));
            time = benchmarkLSD.run(1, 5);
            System.out.println(time);

            sortType = "DualPivotQuickSort on" + size[i] + " words";
            Benchmark<Object> benchmarkDualPivotQuickSort = new Benchmark_Timer<>(sortType, a -> {
                Collections.shuffle(input);
                String[] arrinput = input.toArray(new String[0]);
                tempList = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
                    , a -> new QuickSortDualPivot().sort(tempList));
            time = benchmarkDualPivotQuickSort.run(1, 5);
            System.out.println(time);

            sortType = "TimSort on" + size[i] + " words";
            Benchmark<Object> benchmarkTimSort = new Benchmark_Timer<>(sortType, a -> {
                Collections.shuffle(input);
                String[] arrinput = input.toArray(new String[0]);
                tempList = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
                    , a -> {
                try {
                    new TimSort<>().sorting(tempList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            time = benchmarkTimSort.run(1, 5);
            System.out.println(time);

            sortType = "HuskySort on" + size[i] + " words";
            Benchmark<Object> benchmarkHuskySort = new Benchmark_Timer<>(sortType, a -> {
                Collections.shuffle(input);
                String[] arrinput = input.toArray(new String[0]);
                tempList = Arrays.copyOf(arrinput, size[finalI]);
                return null;
            }
                    , a -> new edu.neu.coe.huskySort.sort.huskySort.PureHuskySort<>(edu.neu.coe.huskySort.sort.huskySortUtils.HuskyCoderFactory.asciiCoder, false, false).sort(tempList));
            time = benchmarkHuskySort.run(1, 5);
            System.out.println(time);

        }



    }
}
