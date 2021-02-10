package kg.megacom;

public class Manager extends Employee{
    boolean hasStocks;



    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Manager(String name, int age, double salary, boolean hasStocks) {
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }

    @Override
    public void print(){

    }


    @Override
    public void work() {

    }
}
