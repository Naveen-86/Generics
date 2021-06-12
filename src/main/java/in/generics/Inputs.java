package in.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {
    public static void main(String args[]) {
        System.out.println("Maxium of Integer" + MaximumNumber.getMax(5, 3, 1));
        System.out.println("Maxium of Floats" + MaximumNumber.getMax(5.8f, 3.2f, 1.4f));
        System.out.println("Maxium of Strings" + MaximumNumber.getMax("Peach", "Banana", "Apple"));

        System.out.println(MaximumNumber.max(new Comparable[]{2, 4, 5, 8, 1, 3}));
        System.out.println(MaximumNumber.max(new Comparable[]{2f, 4f, 23f, 5f, 8f}));
        System.out.println(MaximumNumber.max(new Comparable[]{"Naveen", "Noneoftheabove", "noanswer", "5f", "8fasd"}));

    }
}
