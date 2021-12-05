package edu.neu.coe.info6205.sort.counting;

import java.io.*;
import java.util.*;

public class MSDSort {
    public static List<String> msd(List<String> inputs){
        return recmsd(inputs,0);
    }

    private static List<String> recmsd(List<String> inputs, int index){
        if(index>= inputs.get(0).length() || inputs.size()<=1){
            return  inputs;
        }
        List<String> aux = new ArrayList<>();
        int start=0;
        int b=0;
        sort(inputs, index);
        for(int end=1; end<=inputs.size();end++){
            int a = charAt(inputs.get(start), index);
             if (end<inputs.size())  b = charAt(inputs.get(end), index);
            if(end==inputs.size() || a != b){
                List<String> sub = inputs.subList(start, end);
                aux.addAll(recmsd(sub, index+1));
                start= end;
            }
        }
        return aux;
    }

    private static void sort(List<String> inputs, int index){
        inputs.sort(Comparator.comparingInt(o->o.charAt(index)));
    }

    private static int charAt(String s, int d) {
        if (d < s.length()){
            int test = (s.charAt(d)-3070);
            return (s.charAt(d)-3070);
//            return s.charAt(d);
        }
        else return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[] inou = {"అకి" , "కొంతకాలంగా", "ఆగా", "అకిక","ప్రపంచవ్యాప్తంగా", "అకా",  "గ్లోబల్‌" ,"ఆకా",  "వార్మింగ్‌", "మార్మోగుతోంది" ,  "బొగ్గు"};
        String[] inou1 = {"hello", "apple", "heave","f", "fx","fe","feet", "human", "c", "ice", "enter", "eagle", "sport"};
        String[] inou2 = { "గత" , "కొంతకాలంగా" ,"అ", "ప్రపంచవ్యాప్తంగా", "కాకి" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "పేరు", "మార్మోగుతోంది" ,  "బొగ్గు", "గత" , "కొంతకాలంగా" ,"అ", "ప్రపంచవ్యాప్తంగా", "కాకి" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "పేరు", "మార్మోగుతోంది" ,  "బొగ్గు"};
                List<String> new1 = new ArrayList<>();

//        new1.add("గ్లోబల్");
//        new1.add("కాకి");
//        new1.add("కి");
//        new1.add("బొగ్గు");
//        new1.add("పేరు");
//        new1.add("గత");
//        new1.add("క్స్");
//        new1.add("క్స్");
//        new1.add("అ");
//        new1.addAll(Arrays.asList(inou));
//        int len = new1.get(0).length();
//        String tee = new1.get(1);
//        int nnn = tee.length();
//        System.out.println(msd(new1));
//        File file = new File("C:\\Users\\Abhishikth Daniel M\\Desktop\\6205\\Assigments\\INFO6205-Assignments\\test.txt");
//        Scanner sc = new Scanner(file);
//
//        // we just need to use \\Z as delimiter
//        sc.useDelimiter(",");
//
//        System.out.println(sc.next());

        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Abhishikth Daniel M\\Desktop\\6205\\Assigments\\INFO6205-Assignments\\test.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
                new1.add(str);
            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }
        System.out.println(Arrays.deepToString(new1.toArray()));

    }
}
