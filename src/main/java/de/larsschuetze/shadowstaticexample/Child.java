package de.larsschuetze.shadowstaticexample;

public class Child extends Parent {

	public static void StaticMethod() {
		System.out.println("Static method from Child");
	}
	
	@Override
	public void method() {
		System.out.println("Normal method from Child");
	}
}
