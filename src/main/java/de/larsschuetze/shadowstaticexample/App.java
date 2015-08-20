package de.larsschuetze.shadowstaticexample;

public class App 
{
    public static void main( String[] args )
    {
    	Parent parent = new Parent();
    	Child child1 = new Child();
    	Parent child2 = new Child();
    	
    	parent.StaticMethod();
    	parent.method();
    	child1.StaticMethod();
    	child1.method();
    	child2.StaticMethod();
    	child2.method();
    }
}
