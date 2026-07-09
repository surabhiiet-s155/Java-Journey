import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Surabhi");
        students.put(102, "Vedha");
        students.put(103, "Ananya");

        System.out.println(students);

        System.out.println("Student 101: " + students.get(101));
    }
}
