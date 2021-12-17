import java.util.Scanner;

import Factory.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShapeFactory sf = new ShapeFactory();
        String shape = sc.nextLine();
        sf.getShape(shape);
        sc.close();
    }
}

// next int closes scanner ?