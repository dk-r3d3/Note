package homework5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneBook{

    private static Map<String, List<Integer>> map = new HashMap<>();
    public static void main(String[] args) {
        putNamesNumbers("name1", "123456789");
        putNamesNumbers("name2", "987654321");
        putNamesNumbers("name4", "123123123");
        putNamesNumbers("name1", "123123123");
        putNamesNumbers("name3", "121212121");
        putNamesNumbers("name1", "123123123");
        putNamesNumbers("name4", "123123123");

        List<String> list = new ArrayList<>(map.keySet()); // create list with keyses

        bubbleSort(list);
        for (String string : list) {
            System.out.println(getNamesNumbers(string));
        }
    }

    static void putNamesNumbers(String name, String number){ // add dictionary
        List<Integer> numbers = map.get(name); // get key
        if (map.containsKey(name) == false) {
            numbers = new ArrayList<Integer>(); 
            numbers.add(Integer.parseInt(number)); // make int from str and add in list
            map.put(name, numbers);
        }
        else{
            numbers.add(Integer.parseInt(number));
        }
    }

    static String getNamesNumbers(String name){ // return contacts
        return name + " : " + map.get(name);
    }

    static void bubbleSort(List<String> list){
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (map.get(list.get(i)).size() > map.get(list.get(j)).size()) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}