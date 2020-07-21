package com.epam.maven_demo;
import java.util.Arrays;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int totalgifts=sc.nextInt();
	int sweetCount=0;
	int chocolateCount=0;
	int totalweight=0;
	System.out.println("Enter the gift");
	while(totalgifts-->0) {
		String s=sc.next();
		if(s.equals("Sweet")) {
			sweetCount++;
		}
		else {
			chocolateCount++;
		}
	}
	Sweet sweet[]=new Sweet[sweetCount];
	Chocolate choco[]=new Chocolate[chocolateCount];
	for(int i=0;i<chocolateCount;i++) {
		int chocoweight=sc.nextInt();
		String choconame=sc.next();
		String chococolor=sc.next();
		String chocotaste=sc.next();
	    totalweight=totalweight+chocoweight;
	    choco[i]=new Chocolate(chocotaste,chococolor,chocoweight,choconame);
	}
	Arrays.sort(choco);
    System.out.println( "Weight of the chocolates in sorted order is:" );
    for(Chocolate temp:choco) {
    	System.out.print(temp.getWeight()+" ");
    }
    System.out.println();
    System.out.println("Enter the range of the range");
    int least=sc.nextInt();
    int high=sc.nextInt();
    for(Chocolate tp:choco) {
    	int x=tp.getWeight();
    	if(x>=least && x<=high)
    		System.out.print(tp.getWeight()+" ");
    	}

      System.out.println();
for(int j=0;j<sweetCount;j++) {
	int sweetweight=sc.nextInt();
	String sweetname=sc.next();
	String sweetcolor=sc.next();
	String sweettaste=sc.next();
	String sweetshape=sc.next();
	totalweight=totalweight+sweetweight;
	sweet[j]=new Sweet(sweettaste,sweetcolor,sweetweight,sweetname,sweetshape);
	
}
System.out.println("Printing weights of all the gifts");
System.out.println();
}

}
