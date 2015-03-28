import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
//import java.util.EmptyStackException;

//Created by Pavel A. on 07.03.15.

public class Main {

    public static void main(String args[]) {

        Push p = new Push();
        Print pr = new Print();
        Pop pp = new Pop();
        Add ad = new Add();
        Mul mul = new Mul();
        Div di = new Div();
        Scanner console = new Scanner(System.in);
        Stack st = new Stack<Integer>();
        Map<String, Cmd> command = new HashMap<String, Cmd>();
        command.put("PUSH", p);
        command.put("PRINT", pr);
        command.put("POP", pp);
        command.put("ADD", ad);
        command.put("MUL", mul);
        command.put("DIV", di);

        while (true) {
            String com = console.nextLine();
            String parts[] = com.split(" ");
            for (int i = 0; i < parts.length; i++)
                if (parts.length > 1) {
                    p.x = new Integer(parts[1]);

                    System.out.println("parts[" + i + "]: " + parts[i]);
                }
            if (com.equals("QUIT")) {
                return;
            }
            System.out.println(command.get(parts[0]).exec(st, parts));

            /*if (com.equals("PUSH")) {
                System.out.println(p.exec(st, parts));
                System.out.println("stack: " + st);
            } else if (com.equals("POP")) {
                System.out.println(pp.exec(st, parts));
            } else if (com.equals("PRINT")) {
                System.out.println(pr.exec(st, parts));
            } else if (com.equals("ADD")) {
                System.out.println(ad.exec(st, parts));
            } else if (com.equals("MUL")) {
                System.out.println(mul.exec(st, parts));
            } else if (com.equals("DIV")) {
                System.out.println(di.exec(st, parts));
            } else {
                System.out.println("Unknown command");
            }*/
        }
    }
}