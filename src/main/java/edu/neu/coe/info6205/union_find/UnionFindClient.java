package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UnionFindClient {
    static int cCount =0;
    public static  int RandomCount(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    public static void main(String[] args) {
        int[] exp= {1000,2000,4000,8000,16000,32000, 64000};
        for(int i=0;i<exp.length;i++)
        {
            int n = exp[i];

            cCount =0;
            UF_HWQUPC uf_hwqupc = new UF_HWQUPC(n);
            while(uf_hwqupc.components() != 1)
            {

                int p= RandomCount(n);
                int q= RandomCount(n);
                count();
                if(p==q)
                    continue;
                if(uf_hwqupc.connected(p, q)) continue;
                else {
                    uf_hwqupc.union(p, q);


                }

            }
            System.out.println("Sites= " + n +" Connection Count= "+ cCount);
        }
    }
    public static int count()
    {
        return cCount++;
    }

}
