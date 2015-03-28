import java.util.Stack;

//Created by Pavel A. on 07.03.15.

public interface Cmd {
    public Object exec(Stack<Integer> st, String[] parts);
}