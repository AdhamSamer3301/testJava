import java.util.Scanner;


// import Factory.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //#region Encapsulation
        Encapsulation E = new Encapsulation();
        String name = sc.nextLine();
        E.setName(name);
        System.out.println(E.getName());
        //#endregion

        //#region Abstract
        // AbstractTest t = new AbstractTest();   
        // ☝️ will produce error in instantiation, Use the inherited class 👇 to access the abstract class
        Test1 t = new Test1();
        t.test();
        //#endregion



        sc.close();
    }
}

// ShapeFactory sf = new ShapeFactory();
// String shape = sc.nextLine();
// sf.getShape(shape);
// next int closes scanner ?

// class1 tt =  new class2();
// class1 parent and class2 child 