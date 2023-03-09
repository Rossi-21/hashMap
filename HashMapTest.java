import java.util.Set;
import java.util.HashMap;
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("She loves you", "Yeah, Yeah, Yeah");
        trackList.put("Michelle", "My Belle");
        trackList.put("Happiness is a warm gun", "She's well aquanted with the touch of a velevet hand" );
        trackList.put("Yellow Submarine", "In the town where I was born");
        String trackOne = trackList.get("She loves you");
        System.out.println(trackOne);
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(String.format("%s : %s", key,trackList.get(key)));
            //System.out.println(trackList.get(key));
        }
    }
}