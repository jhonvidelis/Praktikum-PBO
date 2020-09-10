//HelloPerson.java
package soal2b;
import java.util.Scanner;
public class HelloPerson{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		String nama = sc.next (); 
		System.out.print("Hello" + nama +"!");
	}
}