package edu.neu.coe.info6205.sort.counting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class toUni {
    // TODO Auto-generated method stub
    public static void main(String[] args) throws IOException{

    String value = "క్స్"; //input string in telugu
    String value1 =    "కాకి";
    //char leen = value1.charAt(0);
        String test = value1.substring(0,2);
        String value2= "కి";
    int len = value.length();
		  System.out.println(len);
    String uni = toHex(value); // utf-16 val of string
        String uni1 = toHex(value1);
        String uni2 = toHex(value2);
        //int ttt = Integer.parseInt(uni);
		  System.out.println(uni);
        //System.out.println(ttt);
    // test starts
    char str = '\u0C00'; // put output here with backslash u
        int x=str;


    //byte[] charset = str.getBytes("UTF-16");
    //String result = new String(charset, "UTF-16");
	      System.out.println(x);
    //test ends
}
    //method to convert to hex
    static String toHex(String b) {
        String s = "";
        for (int i = 0; i < b.length(); ++i)
            s += String.format("%04X", b.charAt(i) & 0xffff);
        return s;
    }
}


