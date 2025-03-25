public class Dmarket {
    public static void main(String[] args) {

        User user1 = new User() {
            @Override
            public void getinfo() {
                System.out.println("Admin");
            }
        };
        user1.getinfo();
        Admin admin1 = new Admin();
        admin1.getinfo();

        OnlineOrder onlineOrder = new OnlineOrder(1, "John", "Street 1");
        InStoreOrder inStoreOrder = new InStoreOrder(2, "Jane", true);

        onlineOrder.processOrder(onlineOrder);
        inStoreOrder.processOrder(inStoreOrder);
        onlineOrder.pp();
        inStoreOrder.pp();

    }
}

interface IOrderProcessor<T> {
    void processOrder(T order);
    void pp();
}

interface User {
    void getinfo();
}

class Admin implements User {
    @Override
    public void getinfo() {
        System.out.println("Admin");
    }
}

abstract class Order {
    protected int orderid;
    protected String customername;

    public Order(int orderid, String customername) {
        this.orderid = orderid;
        this.customername = customername;
    }
    @Override
    public String toString() {
        return "Order ID: " + orderid + ", Customer: " + customername;
    }
}

class OnlineOrder extends Order implements IOrderProcessor<OnlineOrder> {
    private String street;

    public OnlineOrder(int orderid, String customername, String street) {
        super(orderid, customername);
        this.street = street;
    }

    @Override
    public void processOrder(OnlineOrder order) {
        System.out.println("Processing Online Order: " + order);
    }

    @Override
    public String toString() {
        return super.toString() + ", Delivery Address: " + street;
    }

    @Override
    public void pp() {
        System.out.println("pp" + this);
    }
}

class InStoreOrder extends Order implements IOrderProcessor<InStoreOrder> {
    private boolean paid;

    public InStoreOrder(int orderid, String customername, boolean paid) {
        super(orderid, customername);
        this.paid = paid;
    }

    @Override
    public void processOrder(InStoreOrder order) {
        System.out.println("Processing Instore Order: " + order);
    }

    @Override
    public String toString() {
        return super.toString() + ", Paid: " + paid;
    }

    @Override
    public void pp() {
        System.out.println("pp" + this);
    }
}