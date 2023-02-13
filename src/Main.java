import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        try {
            arrayList.add(new Student("Mariya", 25));
            arrayList.add(new Student("Dasha", 0));
            arrayList.add(new Student("Alina", -25));
            arrayList.add(null);
            System.out.println(arrayList);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("the end");
        }


















//        ArrayList<Integer>arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(8);
//        arrayList.add(4);
//        System.out.println(arrayList);
//
//        Iterator<Integer>iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.hasNext());
//        }
    }
}