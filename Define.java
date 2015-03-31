import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

//Created by Pavel A. on 07.03.15.

public class Define implements Cmd {
    Map<String, String> def = new HashMap<String, String>();

    //@Override
    public Object exec(Stack<Double> st, String[] parts) {
        return def.put(parts[1], parts[2]);
        for (Map.Entry<String, String> entry : def.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        }
    }
}