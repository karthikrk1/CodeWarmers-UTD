/*
ID: karthik1807		
PROG: cowfind
LANG: JAVA
*/
import java.util.*;
import java.io.*;

class cowfind {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("cowfind.in"));
		PrintWriter output = new PrintWriter("cowfind.out");
		  	
        String s = input.nextLine();
        int answer = 0, backLegCount=0;
        char[] x = s.toCharArray();
        for(int i=1;i<x.length;i++){
        	if(x[i-1]==')'&&x[i]==')')
        		answer+=backLegCount;
        	else if(x[i-1]=='('&&x[i]=='(')
        		backLegCount++;
        }
        output.write(answer+"\n");
		output.close();
	}
}
