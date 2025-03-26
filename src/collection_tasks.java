import java.util.*;

//ArrayList---------------------------------------------------------------

//Write a Java program to print all the elements of a ArrayList using the position of the elements.
class Exercise1 {
    public static void main(String[] args) {
        ArrayList <String> rainbow = new ArrayList <String> ();
        rainbow.add("Red");
        rainbow.add("Green");
        rainbow.add("Black");
        rainbow.add("White");
        rainbow.add("Pink");
        System.out.println(rainbow);
        System.out.println("----------------------");
        int no_of_elements = rainbow.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(rainbow.get(index));
    }
}

//Write a Java program to update specific array element by given element.
class Exercise2 {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList <> (2);
            array.add("Red");
            array.add("Green");
            array.set(1, "White");
            System.out.println(array);
        }
}
//Write a Java program to increase an array list size.
class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        //not initialCapacity
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        //now initialCapacity
        numbers.add(50);
        // ¯\(°_o)/¯
    }
}
//Write a Java program to test whether an array list is empty or not.
class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        System.out.println(numbers.isEmpty());
    }
}
//Write a Java program to empty an array list.
class Exercise5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Bomboclac");
        names.add("Boba");
        names.add("Biba");
        names.removeAll(names);
        System.out.println(names);
        names.add("Baba");
        System.out.println(names);
    }
}
//Write a Java program to clone an array list to another array list.
class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);
        numbers2 = (ArrayList<Integer>) numbers1.clone();
        System.out.println(numbers2);
    }
}

//LinkedList---------------------------------------------------------------

//Write a Java program to replace an element in a linked list.
class Exercise7 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Bomboclac");
        names.add("Boba");
        names.add("Biba");
        System.out.println(names);
        names.set(1, "Baba");
        System.out.println(names);
    }
}
//Write a Java program to check if a linked list is empty or not.
class Exercise8 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Bomboclac");
        names.add("Boba");
        names.add("Biba");
        System.out.println(names.isEmpty());
        names.removeAll(names);
        System.out.println(names.isEmpty());
    }
}
//Write a Java program to compare two linked lists.
class Exercise9{
    public static void main(String[] args) {
        LinkedList<Integer> nums1 = new LinkedList<>();
        LinkedList<Integer> nums2 = new LinkedList<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums2.add(10);
        nums2.add(20);
        nums2.add(30);
        if (nums2.containsAll(nums1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
//Write a Java program to convert a linked list to an array list.
class Exercise10 {
    public static void main(String[] args) {
        LinkedList<Integer> nums1 = new LinkedList<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        ArrayList<Integer> nums2 = new ArrayList<>(nums1);
        System.out.println(nums2);
    }
}
//Write a Java program to check if a particular element exists in a linked list.
class Exercise11 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Bomboclac");
        names.add("Boba");
        names.add("Biba");
        System.out.println(names.contains("Boba"));
    }
}
//Write a Java program to retrieve, but not remove, the last element of a linked list.
class Exercise12 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Bomboclac");
        names.add("Boba");
        names.add("Biba");
        System.out.println(names.peekLast());
        System.out.println(names);
    }
}

//HashSet---------------------------------------------------------------

//Write a Java program to remove all elements from a hash set.
class Exercise13 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums);
        System.out.println(nums.removeAll(nums));
        System.out.println(nums);
    }
}
//Write a Java program to compare two sets and retain elements that are the same.
class Exercise14 {
    public static void main(String[] args) {
        HashSet<Integer> nums1 = new HashSet<>();
        HashSet<Integer> nums2 = new HashSet<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);

        nums2.add(10);
        nums2.add(20);
        nums2.add(40);
        System.out.println(nums1.retainAll(nums2));
    }
}
//Write a Java program to compare two hash set.
class Exercise15 {
    public static void main(String[] args) {
        HashSet<Integer> nums1 = new HashSet<>();
        HashSet<Integer> nums2 = new HashSet<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);

        nums2.add(10);
        nums2.add(20);
        nums2.add(40);
        System.out.println(nums1.containsAll(nums2));
    }
}
//Write a Java program to find numbers less than 7 in a tree set. (задание по hashset так и не понял почему он treeset)
class Exercise16 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        for(Integer i : nums) {
            if (i <= 7) {
                System.out.println(i);
            }
        }
    }
}
//Write a Java program to convert a hash set to a tree set.
class Exercise17 {
    public static void main(String[] args) {
        HashSet<Integer> nums1 = new HashSet<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums1.add(5);
        TreeSet<Integer> nums2 = new TreeSet<>(nums1);
        System.out.println(nums2);
    }
}
//Write a Java program to convert a hash set to an array.
class Exercise18 {
    public static void main(String[] args) {
        HashSet<Integer> nums1 = new HashSet<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums1.add(5);
        ArrayList<Integer> nums2 = new ArrayList<>(nums1);
        System.out.println(nums2);
    }
}

//TreeSet---------------------------------------------------------------

//Write a Java program to remove a given element from a tree set.
class Exercise19 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        nums.remove(5);
        System.out.println(nums);
    }
}
//Write a Java program to retrieve and remove the last element of a tree set.
class Exercise20 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        System.out.println(nums.pollLast());
        System.out.println(nums);
    }
}
//Write a Java program to retrieve and remove the first element of a tree set.
class Exercise21 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        System.out.println(nums.pollFirst());
        System.out.println(nums);
    }
}
//Write a Java program to get an element in a tree set that has a lower value than the given element.
class Exercise22 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        for(Integer i : nums) {
            if(i<10) {
                System.out.println(i);
            }
        }
        System.out.println(nums.lower(10));
    }
}
//Write a Java program to get the element in a tree set strictly greater than or equal to the given element
class Exercise23 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        for(Integer i : nums) {
            if(i>=10) {
                System.out.println(i);
            }
        }
        System.out.println(nums.higher(10));
    }
}
//Write a Java program to get the element in a tree set less than or equal to the given element.
class Exercise24 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        for(Integer i : nums) {
            if(i<=10) {
                System.out.println(i);
            }
        }
        System.out.println(nums.floor(10));
    }
}

//PriorityQueue---------------------------------------------------------------

//Write a Java program to change priorityQueue to maximum priority queue.
class Exercise25 {
    public static void main(String[] args) {
        PriorityQueue<Integer> nums = new PriorityQueue<>(Collections.reverseOrder());
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        System.out.println(nums);
    }
}
//Write a Java program to convert a Priority Queue element to string representations.
class Exercise26 {
    public static void main(String[] args) {
        PriorityQueue<String> blablabla = new PriorityQueue<>();
        blablabla.add("Bomboclac");
        blablabla.add("Boba");
        blablabla.add("Biba");
        String str = blablabla.toString();
        System.out.println(str);
    }
}
//Write a Java program to convert a priority queue to an array containing all its elements.
class Exercise27 {
    public static void main(String[] args) {
        PriorityQueue<Integer> nums = new PriorityQueue<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        System.out.println(Arrays.toString(arr));
    }
}
//Write a Java program to retrieve and remove the first element.
class Exercise28 {
    public static void main(String[] args) {
        PriorityQueue<Integer> nums = new PriorityQueue<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        System.out.println(nums.poll());
        System.out.println(nums);
    }
}
//Write a Java program to compare two priority queues.
class Exercise29 {
    public static void main(String[] args) {
        PriorityQueue<Integer> nums1 = new PriorityQueue<>();
        PriorityQueue<Integer> nums2 = new PriorityQueue<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);

        nums2.add(10);
        nums2.add(20);
        nums2.add(30);
        if (nums2.containsAll(nums1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
//Write a Java program to retrieve the first element of the priority queue.
class Exercise30 {
    public static void main(String[] args) {
        PriorityQueue<Integer> nums = new PriorityQueue<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(5);
        System.out.println(nums.peek());
    }
}

//HashMap---------------------------------------------------------------

//Write a Java program to get a collection view of the values contained in this map.
class Exercise31 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        Collection<String> values = map.values();
        System.out.println(values);
    }
}
//Write a Java program to get a set view of the keys contained in this map.
class Exercise32 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        Set keys = map.keySet();
        System.out.println(keys);
    }
}
//Write a Java program to get the value of a specified key in a map.
class Exercise33 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        String key = map.get(2);
        System.out.println(key);
    }
}
//Write a Java program to create a set view of the mappings contained in a map.
class Exercise34 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        Set set = map.entrySet();
        System.out.println(set);
    }
}
//Write a Java program to test if a map contains a mapping for the specified value.
class Exercise35 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        if (map.containsValue("Boba")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
//Write a Java program to test if a map contains a mapping for the specified key.
class Exercise36 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        if (map.containsKey(1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

//TreeMap---------------------------------------------------------------
//Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
class Exercise37 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        System.out.println(map.ceilingKey(4));
    }
}
//Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
class Exercise38 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        System.out.println(map.ceilingEntry(2));
        System.out.println(map.ceilingEntry(3));
    }
}
//Write a Java program to get a portion of a map whose keys are greater than a given key.
class Exercise39 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        System.out.println(map.tailMap(2));
    }
}
//Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
class Exercise40 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        System.out.println(map.tailMap(2, true));
    }
}
//Write a Java program to get the portion of a map whose keys range from a given key to another key.
class Exercise41 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        System.out.println(map.subMap(1, 3));
    }
}
//Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
class Exercise42 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Bomboclac");
        map.put(2, "Boba");
        map.put(3, "Biba");
        System.out.println(map.subMap(1, false, 3, true));
    }
}
