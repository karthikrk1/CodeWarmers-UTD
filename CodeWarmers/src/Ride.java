/*
ID: karthik70	
PROG: ride
LANG: JAVA
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
class ride {
	public static void main(String args[]) throws Exception{
		final int CONST = 47;
		Scanner in = new Scanner(new File("ride.in"));
		PrintWriter output = new PrintWriter("ride.out");
		String cometName = in.nextLine();
		String grpName = in.nextLine();
		int cometProd = calProd(cometName);
		int grpProd = calProd(grpName);
		if((cometProd%CONST)==(grpProd%CONST)){
			output.write("GO\n");
		}
		else{
			output.write("STAY\n");
		}
		in.close();
		output.close();
	}
	
	public static int calProd(String a){
		char[] charArr = a.toCharArray();
		int prod = 1;
		for(char x: charArr){
			prod*=(int) x%64;
		}
		//System.out.println(prod);
		return prod;
	}
}
