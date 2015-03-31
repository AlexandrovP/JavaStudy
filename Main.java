import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Map.Entry;
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
        Define de = new Define();
        Scanner console = new Scanner(System.in);
        Stack st = new Stack<Integer>();
        Map<String, Cmd> command = new HashMap<String, Cmd>();
        command.put("PUSH", p);
        command.put("PRINT", pr);
        command.put("POP", pp);
        command.put("ADD", ad);
        command.put("MUL", mul);
        command.put("DIV", di);
        command.put("DEF", de);

        while (true) {
            String com = console.nextLine();
            String parts[] = com.split(" ");
            for (int i = 0; i < parts.length; i++)
                if (parts.length == 2) {
                    if (parts[1].equals(de.entry.getKey())) {
                        parts[1] = de.entry.getValue;
                        p.x = new Double(parts[1]);
                        command.get(parts[0]).exec(st, parts);
                    } else {
                        p.x = new Double(parts[1]);
                        System.out.println("parts[" + i + "]: " + parts[i]);
                    }
                }
            if (parts.length == 3) {
                command.get(parts[0]).exec(st, parts);
            }

            if (com.equals("QUIT")) {
                return;
            }

            if (command.containsKey(parts[0])) {
                System.out.println(command.get(parts[0]).exec(st, parts));
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}