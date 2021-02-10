package kg.megacom;


public class Main {
    public static void main(String[] args) {



        Specialist specialist1 = new Specialist("Бекмырза",23,13000,1);
        Specialist specialist2 = new Specialist("Жылдыз",25,14000,2);
        Specialist specialist3 = new Specialist("Али",25,14500,3);

        Developer developer1 = new Developer("Азим",30,30000,"Middle");
        Developer developer2 = new Developer("Нурсултан",32,35000,"Middle");
        Developer developer3 = new Developer("Ксения",31,37000,"Middle");
        Developer developer4 = new Developer("Тимур",35,37000,"Middle");

        Manager manager1 = new Manager("Алина",29,40000,true);
        Manager manager2 = new Manager("Манас",33,40500,true);

        CEO ceo = new CEO("Арстан",41,70000,true,true);

        specialist1.print();
        print(specialist1);
        print(specialist2);
        print(specialist3);
        manager1.print();
        print(manager1);
        print(manager2);
        developer1.print();
        print(developer1);
        print(developer2);
        print(developer3);
        print(developer4);
        ceo.print();
        print(ceo);
        System.out.println("\nГлавный импольнительный Директор:"+"\nФио:"+ceo.getName()+"\nВозрост:"+ceo.getAge()+"\nЗарпоата:"+ceo.getSalary()+"\nСлужебная Машина:"+ceo.hasCompanyCar);
   }

    private static void print(Developer developer1) {

        System.out.println("\nРазроботчик:"+"\nФио:"+developer1.getName()+"\nВозрост"+developer1.getAge()+"\nЗаплата:"+developer1.getSalary()+"\nРанг:"+developer1.getGrades());
    }

    private static void print(Manager manager1) {

        System.out.println("\nМенеджер:"+"\n  b  vФио:"+manager1.getName()+"\nВозрост:"+manager1.getAge()+"\nЗарпалат:"+manager1.getSalary()+"\nАкции:"+manager1.hasStocks);
    }

    public static void print(Specialist specialist1){



        System.out.println("\nСпециалиcт:"+"\nФио:" + specialist1.getName() + "\nВозрост:"+specialist1.getAge()+"\nЗарплата:"+specialist1.getSalary()+"\nУровень:"+specialist1.getLevels());










    }
    
    

}
