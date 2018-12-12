/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybignumber;
import static java.lang.Double.max;
import java.util.Scanner;
/**
 *
 * @author TrumAsia
 */
public class MyBigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nhap();
        // TODO code application logic here
    }
    static String dao(String s){
		String s1 = "";
		for(int i = 0; i< s.length();i++)
			s1+= s.charAt(s.length()-1-i);
		return s1;
	}
    	static String add(String s1, String s2){
		String s = "";
		int nho = 0;
		int max = (int) max(s1.length(), s2.length());
		s1 = dao(s1);
		s2 = dao(s2);
		for(int i = max; i>s1.length(); i--) s1+= "0";
		for(int i = max; i>s2.length(); i--) s2+= "0";
		for(int i = 0; i< max; i++){
			int x = s1.charAt(i) - '0' + s2.charAt(i) - '0' + nho;
			s+= x%10;
			nho = x/10;
		}
		if(nho > 0) s+= 1;
		s = dao(s);
		return s;
	}
        static void nhap(){
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap hai so nguyen : ");
		s1 = sc.next();
		s2 = sc.next();
		String s = add(s1,s2);
		System.out.print("tong hai so: "+s);
	}
    
}
