package JavaBasics.Inheritance.refSuperClass;

import JavaBasics.Inheritance.Animal;

public class refSuperclass extends Animal {

    public void hasLegs(){
        System.out.println("Getting called through Super Class " );
        super.eat();
        System.out.println("I'm a super class & have 4 legs");
    }
}
