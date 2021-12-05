package nev__30;

import nev19.nev__30;

public class nev__30
{

   // constant to represent heads
   private static int HEADS = 1;

   // current value of the coin
   private int value = 1;
  
	


   // method to randomly set the value of the coin to heads or tails
   public void flip()
   {
      if (Math.random() < 0.5)
      {
          value = 0;
      }
      else
      {
         value = 1;
      }
   }

   // return true if the value is heads or false otherwise
   public boolean isHeads()
   {
      return value == HEADS;
   }
   public boolean isTails() {
	   return value!=HEADS;
	  
	   
	  
   }

   // convert the value to a string
   public String toString()
   {
      if (value == HEADS) return "Heads";
      else return "Tails";
   }

   // test the class
   public static void main(String[] args)
   {

	   nev__30 myCoin = new nev__30();
      for (int i = 0; i < 10; i++)
      {
         myCoin.flip();
         System.out.println(myCoin);
         System.out.println(myCoin.isHeads());
         System.out.println(myCoin.isTails());
      }
   }
}
