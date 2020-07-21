package com.epam.maven_demo;

public class Sweet extends Gift{
	String name;
	String shape;
	Sweet(String taste,String color,int weight,String name,String shape){
		super(taste,color,weight);
		this.name=name;
		this.shape=shape;
	}
	public int getWeight() {
		return weight;
	}

}
