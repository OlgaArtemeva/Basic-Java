public class Main {
    public static void main(String[] args) {


        int flask1 = 100;
        int flask2 = 200;

        if (flask1 > flask2) {
            System.out.println("flask1 is hot");
        } else {
            System.out.println("flask2 is hot");
        }

        String lang = "ch";

        if (lang == "ru") {
            System.out.print("Привет" + " lang is \"" + lang + "\"");
        } else {
            if (lang == "de") {
                System.out.print("Hallo" + " lang is \"" + lang + "\"");

            }
            if (lang!="ru" && lang!="de") {
                System.out.print("Hello" + " lang is \"" + lang + "\"");
            }

        }
        System.out.println("Finish");
        //-----------------------------
        if (lang == "ru") {
            System.out.println("Finish");
        }
    }
}