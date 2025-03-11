import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    List<T> array = new ArrayList<>();

    void add(T item) {
        array.add(item);
    }

    void remove(T item) {
        array.remove(item);
    }

    void display() {
        for (T item : array) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Storage array= " + array;
    }

    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();
        storage.add("Hello");
        storage.add("World");
        storage.add("Java");
        storage.display();
        storage.remove("World");
        storage.display();
        System.out.println(storage);
    }
}
