abstract class Employee {
    String name;
    int id;
    float baseSalary;

    public Employee(String name, int id, float baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    abstract float calculateSalary();
    abstract void displayEmployeeInfo();

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Daniyal", 0, 802);
        employees[1] = new ContractEmployee("Idris",1,99,1);
        for(Employee e : employees){
            e.displayEmployeeInfo();
            System.out.println("///////");
        }
    }
}

interface Payable{
    float getPaymentAmount();
}

class FullTimeEmployee extends Employee implements Payable{
    static final float benefit = 1.4f;
    boolean Insurance = true;

    public FullTimeEmployee(String name, int id, float baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    float calculateSalary() {
        return baseSalary*benefit;
    }

    @Override
    public float getPaymentAmount(){
        return calculateSalary();
    }

    @Override
    void displayEmployeeInfo() {
        System.out.println("Name: "+name + "\nID: "+id+"\nsalary is: "+calculateSalary()+"\nInsurance: "+Insurance);
    }
}

class ContractEmployee extends Employee implements Payable{
    float hourlyrate;
    int hourlyworked;

    public ContractEmployee(String name, int id, int hourlyworked, float hourlyrate){
        super(name, id, 0);
        this.hourlyrate = hourlyrate;
        this.hourlyworked = hourlyworked;
    }

    @Override
    float calculateSalary(){
        return hourlyworked*hourlyrate;
    }

    @Override
    public float getPaymentAmount(){
        return calculateSalary();
    }

    @Override
    void displayEmployeeInfo(){
        System.out.println("Name: "+name + "\nID: "+id+"\nyour salary is: "+calculateSalary()+"\nHourly Rate: "+hourlyrate);
    }
}
