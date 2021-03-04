import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HashMap<String, Integer>  scoreMap = new HashMap<String, Integer>();
        scoreMap.put("xiaoming", 98);
        scoreMap.put("meimei", 102);
        System.out.println(scoreMap.get("xiaoming"));

    }
}
