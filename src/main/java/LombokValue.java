import java.util.ArrayList;

import lombok.Value;
import lombok.val;

public class LombokValue {

    String name;
    String surname;
    int age;

    public String other() {
        val example = new ArrayList<String>();
        example.add("ahoj");
        return example.get(0);
    }
}
