package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Rozrzutny implements IZachowanieWSklepie{
    public double kupuj(double kwotaDoWydania, ArrayList<Towar> towary){
      double wydano =0;
      for(Towar towar : towary)
      {
          if(towar.cena <= kwotaDoWydania)
          {
              wydano += towar.cena;
              kwotaDoWydania -= towar.cena;
              System.out.println(towar.nazwa + " ");
          }
      }
        System.out.println();
      return wydano;
    }

}
