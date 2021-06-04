package me.test;

public class Main {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Invalid number of arguments. Expected: <file> <prefix> <suffix> <start> <end> <char/line>");
            return;
        }
        Scala scala = new Scala();
        scala.main(args[0], args[1], args[2], args[3], args[4], args[5]);
    }
}
