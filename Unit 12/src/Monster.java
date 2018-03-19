//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		setWeight(0);
		setHeight(0);
		setAge(0);
	}
	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		setHeight(ht);
		setWeight(0);
		setAge(0);
		
	}
	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		setHeight(ht);
		setWeight(wt);
		setAge(0);
		
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}
	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht){
		myHeight = ht;
	}
	
	public void setWeight(int wt){
		myWeight = wt;
	}
	
	public void setAge(int age){
		myAge = age;
	}
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	public int getWeight(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
		Monster m = (Monster)obj;
		return (this.myHeight == m.myHeight) && (this.myWeight == m.myWeight) && (this.myAge == m.myAge);
	}

	public int compareTo( Object obj )
	{
		Monster m = (Monster)obj;
		if (getHeight() > m.getHeight()){
			return 1;
		}
		else if (getHeight()<m.getHeight()){
			return -1;
		}
		else if (getWeight()> m.getWeight()){
			return 1;
		}
		else if (getWeight()<m.getWeight()){
			return -1;
		}
		else if (getAge()>m.getAge()){
			return 1;
		}
		else if (getAge()<m.getAge()){
			return -1;
		}
		return -1;
	}

	//write a toString() method
	public String toString(){
		String output = "";
		output += getHeight() + " " + getWeight() + " " + getAge();
		return output;
	}
	
}