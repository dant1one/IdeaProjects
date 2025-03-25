import java.util.*;
class Container<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isEmpty() {
        System.out.println(value == null);
        return value == null;
    }

    public void clear() {
        value = null;
    }

    public void compare(Container<?> container) {
        if (this.value!= null && container.getValue() != null && this.value.getClass() == container.getValue().getClass()) {
            System.out.println("The same container");
        } else {
            System.out.println("Different containers");
        }
    }
}

public class ddd {
    public static void main(String[] args) {
        Container<String> st = new Container<>();
        Container<Integer> in = new Container<>();
        st.set("Hello");
        in.set(5);
        in.isEmpty();
        st.compare(in);
    }
}
