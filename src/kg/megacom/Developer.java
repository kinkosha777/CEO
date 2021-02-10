package kg.megacom;

public class Developer extends Employee {
    String grades = "Middle";


    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void print() {

    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }


    public Developer(String name, int age, double salary, String grades) {
        super(name, age, salary);
        this.grades = grades;
    }

    public Developer(String grades) {
        this.grades = grades;
    }

    @Override
    public void work() {

    }
}

