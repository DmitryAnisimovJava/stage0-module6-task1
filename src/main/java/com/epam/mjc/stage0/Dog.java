package com.epam.mjc.stage0;

public class Dog extends Animal{

	public Dog() {
		super("brown", 4, true);
	}
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Bird myBird = new Bird();
		System.out.println(myDog.getDescription());
		System.out.println(myBird.getDescription());
	}
}
