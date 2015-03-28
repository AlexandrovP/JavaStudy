import java.util.Stack;
//import java.util.EmptyStackException;

//Created by Pavel A. on 07.03.15.

public class Div implements Cmd {

    @Override
    public Object exec(Stack<Integer> st, String[] parts) {
        return st.push(st.pop() / st.pop());
    }
}