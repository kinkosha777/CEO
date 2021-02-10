package kg.megacom;

public class Specialist extends Employee {
    int levels;




    public Specialist(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void print() {

    }

    public int getLevels() {
        return levels;
    }

    public Specialist(String name, int age, double salary, int levels) {
        super(name, age, salary);
        this.levels = levels;
    }

    public Specialist(int levels) {
        super();
        this.levels = levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public void work() {

    }
}
