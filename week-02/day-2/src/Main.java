import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args ){
        /*
        String s1 = "Strings are awesome";
        String s2 = "Methods are cool";
        System.out.println("Example for length: " + s1.length());
        System.out.println("Example for substring: " + s1.substring(8));
        System.out.println("Example for substring: " + s1.substring(beginIndex: 8, endIndex 12));
        System.out.println("Example for replace: " + s1.replace (target "are", replacement "is"));
        System.out.println("Example for charAt: " + s1.charAt(0));
        System.out.println("Example for equals : " + s1.equals(s2));
        System.out.println("Example for compare : " + s1.compareTo(s2));
        System.out.println("Example for toLowerCase : " + s2.toLowerCase());
        System.out.println("Example for contains" + s1.contains("are"));
        System.out.println("Example for endsWith : " + s1.endsWith("e"));
        System.out.println("Example for startsWith : " + s1.startsWith("s"));
        System.out.println("Example for indexOf: " + s1.indexOf("S"));
        System.out.println("Example for lastIndex: " + s1.lastIndex(str:"are"));

        String email= "Csigacsabi@exaple.com";
        String[] data;
        data = email.split (regex "@");
        System.out.println(Arrays.toString(data));


        ArrayList<String> arrayList = new ArrayList<>();
        String[] copyOfList = new String[arrayList.size()];
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(index: 1, element: "B");
        //arrayList.set(0,"Alex");
        //arrayList.remove(index:0);
        //arrayList.remove(0:"C");
        arrayList.addAll(Arrays.asList("D", "E", "F"));
        //arrayList.addAll(index: 2, Arrays.asList ("X", "X"));
        System.out.println("Size of the array: " + arrayList.size());
        //arrayList.clear();
        System.out.println("Example for isEmpty: " + arrayList.isEmpty());
        System.out.println("Example for contains: " + arrayList.contains("A"));
        System.out.println("Example for containsAll: " + arrayList.containsAll(Arrays.asList("A", "D")));


        System.out.println(arrayList);

        copyOfList = arrayList.toArray(copyOfList);
        System.out.println(Array.toString(copyOfList));
        System.out.println(copyOfList.length);

        ArrayList<Integer> intArray = new ArrayList<>();
        fillArray(intArray);
        System.out.println(intArray);
    }

    public static void fillArray(ArrayList<Integer> list) {
        for(int i = 1; i <= 10; i++){
            list.add(i);

        }*/

        Map<String, Integer> map = new HashMap<>();
        int[] intArray = {1,5,3};
        map.put("Age",22);
        map.put("Height", 178);
        map.put("Weight", 75);

        System.out.println("Example for get: " + map.get("Height"));

        //for(int i : intArray){
          //  System.out.println(i);

        //iterate through keys
        for(String s : map.keySet()){
            System.out.println(s + " ");
        }

        //iterate through values
        for(Integer i : map.values()){
            System.out.print(i + " ");
        }

        //iterate through keys + values
        for(Map.Entry<String,Integer> m : map.entrySet()) {
            System.out.println(m);
        }
    }
}
