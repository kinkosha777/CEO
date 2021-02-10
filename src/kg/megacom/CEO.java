package kg.megacom;

public class CEO extends Manager{
    boolean hasCompanyCar;

    void goPublic() {

    }



    public CEO(String name, int age, double salary) {
        super(name, age, salary);
    }

    public CEO(String name, int age, double salary, boolean hasStocks, boolean hasCompanyCar) {
        super(name, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }



    @Override
    public void print(){

    }
}
