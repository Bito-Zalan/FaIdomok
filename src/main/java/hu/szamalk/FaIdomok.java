package hu.szamalk;

import hu.szamalk.idomok.FaIdom;
import hu.szamalk.idomok.Gomb;
import hu.szamalk.idomok.Hasab;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;

    public FaIdomok(){
        idomok = new ArrayList<>();
        idomok.add(new Gomb(1));
        idomok.add(new Hasab(1,1,1));
    }

    public void run(){
        System.out.println("A programban használt idomok:");
        for (FaIdom idom : idomok){
            System.out.println(idom);
        }
        System.out.println("idomok összes súlya:" + osszSuly());
        System.out.println("gömbök összes súlya:" + osszGombSuly());
        System.out.println("\t" + minV());
        System.out.println("Legnagyobb térfogatú idom: "+maxV().terfogat());
        System.out.println("\t" + maxV());
    }

    public double osszSuly(){
        //összegzés tétele
        double ossz = 0;
        for (FaIdom idom : idomok){
            ossz += idom.suly();
        }
        return ossz;
    }
    public double osszGombSuly(){
        return 0.0;
    }
    public FaIdom minV(){
        return new FaIdom() {
            @Override
            public double terfogat() {
                return 0;
            }
        };
    }
    public FaIdom maxV(){
       return new FaIdom() {
           @Override
           public double terfogat() {
               return 0;
           }
       };
    }


}
