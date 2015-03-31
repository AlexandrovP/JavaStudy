import java.util.Stack;
//import java.util.EmptyStackException;

//Created by Pavel A. on 07.03.15.

public class Mul implements Cmd {

    @Override
    public Object exec(Stack<Double> st, String[] parts) {
        return st.push(st.pop() * st.pop());
    }
}