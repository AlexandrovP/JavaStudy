import java.util.Stack;

//Created by Pavel A. on 12.03.15.

public class Print implements Cmd {

    @Override
    public Object exec(Stack<Integer> st, String[] parts) {
        return "stack: " + st;
    }
}
