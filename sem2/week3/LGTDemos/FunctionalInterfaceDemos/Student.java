package sem2.week3.LGTDemos.FunctionalInterfaceDemos;

public class Student implements Person {
    private String name;
    private int id;
    private int energy;
    private int addEnergy;
    private Employee job;

    public Student(String name, int id) {
        energy = 0;
        this.name = name;
        this.id = id;
        job = (int hours) -> 9.50 * hours;
    }

    public String getName() {
        return name;
    }

    public String talk() {
        String greeting = "Good Morning, Teacher! My name is " + getName() + ".";
        return greeting;
    }

    public void sleep() {
        energy += 8;
    }

    public void eat(int addEnergy) {
        energy += addEnergy;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isStudent() {
        return true;
    }

    public boolean isStaff() {
        return false;
    }

    public double getPay(int hours) {
        return job.pay(hours);
    }

    public static void main(String[] args) {
        Student joel = new Student("Joel", 123594);
        System.out.println();
        System.out.println(joel.getName() + ": " + joel.talk());
        joel.sleep();
        joel.eat(60);
        System.out.println("Energy Level: " + joel.getEnergy());
        System.out.println();

    }
}
