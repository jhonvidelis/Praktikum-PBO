//Operasi.java
package soal6b;

public class Operasi{
      public static void main (String args[]){
             int a =11;
             int b = 2;
			 System.out.print("" + a + "x" + b + "=" + kali(a,b)+"\n");
			 System.out.print("" + a + "/" + b + "=" + bagi(a,b)+"\n");
			 System.out.print("" + a + "+" + b + "=" + tambah(a,b)+"\n");
			 System.out.print("" + a + "-" + b + "=" + kurang(a,b)+"\n");
      }
      static int kali (int a, int b){
             return a * b;
      }
      static int bagi (int a, int b){
           return a / b;
      }
	  static int tambah (int a,int b){
           return a + b;
      }
	  static int kurang (int a,int b){
           return a - b;
      }
}