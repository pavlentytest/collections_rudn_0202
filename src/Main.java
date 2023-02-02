import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String str = scanner.nextLine(); // "1 2 3 4 5"
        String[] strs = str.split(" "); // "1" "2".....
        ArrayList<String> arrL = new ArrayList<>();
        Collections.addAll(arrL, strs);



        Iterable iterable;
        Collection collection;
        // Collections - класс

        // List-ы (интерфейс)
        // Реализации (Классы):
        // ArrayList, LinkedList, Stack, Queue

        // Vector vector = new Vector();  - лучше ArrayList

        // Set-ы (множества)
        // Реализации (Классы) : TreeSet, HashSet

        // Mаp-ы (пары - ключ-значение)
        // Не коллекция!
        // Реализации: Hashtable, HashMap, LinkedHashMap, TreeMap

        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(new Object());
        arrayList.add("233333");

       // int a = (int)arrayList.get(1);
        class Car {

        }

        ArrayList<Car> arrayList1 = new ArrayList<>();
        List<String> arraylist2 = new ArrayList<>();
        Collection<String> arrayList3 = new ArrayList<>();

        int[] b = {3425,2,3,3,3};
        //Arrays.sort();
        //Arrays.binarySearch();

        // Stack
        // LIFO - Last In First Out

        // Queue
        // FIFO - First In First Out

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s);
            queue.offer(s);
        }
        System.out.println("Stack:");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("Queue:");
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println(queue);

        ArrayList<Integer> arrayLst = new ArrayList<>();
        LinkedList<Integer> linkedLst = new LinkedList<>();

        long start = System.nanoTime();
        for(int i = 0;i < 100000;i++) {
            arrayLst.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add to the begin: "+(end-start));

        start = System.nanoTime();
        for(int i = 0;i < 100000;i++) {
            linkedLst.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the begin: "+(end-start));


        start = System.nanoTime();
        for(int i = 30000;i < 60000;i++) {
            arrayLst.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList get: "+(end-start));

        start = System.nanoTime();
        for(int i = 30000;i < 60000;i++) {
            linkedLst.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get: "+(end-start));

        start = System.nanoTime();
        for(int i = 0;i < 30000;i++) {
            arrayLst.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add to end: "+(end-start));

        start = System.nanoTime();
        for(int i = 0;i < 30000;i++) {
            linkedLst.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to end: "+(end-start));

    }
}