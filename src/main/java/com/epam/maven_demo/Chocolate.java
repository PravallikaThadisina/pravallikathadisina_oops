package com.epam.maven_demo;

public class Chocolate extends Gift implements Comparable<Chocolate>{
	String name;
	Chocolate(String taste,String color,int weight,String name){
		super(taste,color,weight);
		this.name=name;
	}
	public int getWeight() {
		return weight;
	}
	public int compareTo(Chocolate o) {
		int cw=((Chocolate) o).getWeight();
		return this.weight-cw;
	}

}
