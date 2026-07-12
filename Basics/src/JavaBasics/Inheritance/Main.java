package JavaBasics.Inheritance;

import JavaBasics.Inheritance.refSuperClass.refSuperclass;

public class Main {

    public static void main(String[] args) {

        Dog labrador = new Dog();
        // access field of superclass

        labrador.name = "Rohu";
        labrador.display();

        // call method of superclass
        // using object of subclass

        labrador.eat();


        // For supper Class why it is needed if implicity it gets called

        refSuperclass legs = new refSuperclass();
        legs.hasLegs();

    }

    // Output :

    // My name is Rohu
    // I can eat

    // Output for super Class code

//    My name is Rohu
//    I can eat
//    Getting called through Super Class
//    I can eat
//    I'm a super class & have 4 legs
}
