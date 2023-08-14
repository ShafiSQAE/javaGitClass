package listdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Object> map=new HashMap<>();

        map.put("Auhter", "Denis Rithcie");
        map.put("edition", "First");
        map.put("Language", "C");
        map.put("id",444);

        System.out.println(map);
    }
}
