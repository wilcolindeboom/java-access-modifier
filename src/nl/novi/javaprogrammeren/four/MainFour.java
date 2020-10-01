package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {

        PrisonCell cell = new PrisonCell("C5");
        cell.inMate("Henk");
        System.out.println(cell.toString());
    }
}
