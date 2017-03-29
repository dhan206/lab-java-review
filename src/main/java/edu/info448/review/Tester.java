package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		//dog.pullSled();
		
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		// Dog.bark();

		Husky dubs = new Husky("Dubs");
		dubs.bark();
		dubs.pullSled();

		TeddyBear bear = new TeddyBear();
		bear.hug();

		Dog v1 = new Husky("other dubs");
		// Husky v2 = new Dog();
		Huggable v3 = new Husky("other other dubs");
		Huggable v4 = new TeddyBear();
		// Husky v5 = new TeddyBear();

		ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		hugList.add(new Husky("dubs v4")); //a Husky is Huggable
		hugList.add(new TeddyBear()); //so are Teddybears!

		//enhanced for loop ("foreach" loop)
		//read: "for each Huggable in the hugList"
		for(Huggable thing : hugList) {
			thing.hug();
		}

		// Animal test = new Animal();
		GiftBox<Husky> giftBoxOfHuskies = new GiftBox<Husky>(new Husky("Dubs v5"));
	}
}