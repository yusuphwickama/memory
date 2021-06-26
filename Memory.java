
/*
 * Created by: Yusuph Wickama
 * Date: 18/09/2020
 */

import java.util.HashMap;

@SuppressWarnings("all")
public class Memory {

    private final static HashMap<String, Object> address = new HashMap<>();

    public static void save(String key, Object object) {
        address.put(key, object);
    }

    public static void delete(String key) {
        if (has(key)) address.remove(key);
    }

    public static <T> T get(String key) {
        return get(key, null);
    }

    public static <T> T get(String key, T defaultValue) {
        if (address.containsKey(key)) return (T) address.get(key);
        return defaultValue;
    }

    public static boolean has(String key) {
        return address.containsKey(key);
    }

    public static void clear() {
        address.clear();
    }

}