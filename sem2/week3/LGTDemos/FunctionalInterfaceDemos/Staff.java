package sem2.week3.LGTDemos.FunctionalInterfaceDemos;

public class Staff implements Person {

    private String name;
    private int id;
    private int energy;
    private Employee job;

    public Staff(String name, int id) {
        energy = 0;
        this.name = name;
        this.id = id;
        job = (int hours) -> 11.00 * hours;
    }

    public String getName() {
        return name;
    }

    public String talk() {
        String dialogue = "Do we have any meetings planned today?";
        return dialogue;
    }

    public void sleep() {
        energy += 3;
    }

    public void eat(int addEnergy) {
        energy += addEnergy;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isStudent() {
        return false;
    }

    public boolean isStaff() {
        return true;
    }

    public double getPay(int hours) {
        return job.pay(hours);
    }
    
    public static void main(String[] args) {
        Staff casey = new Staff("Casey", 483975);
        System.out.println();
        System.out.println(casey.getName() + ": " + casey.talk());
        casey.sleep();
        casey.eat(40);
        System.out.println("Energy Level: " + casey.getEnergy());
        System.out.println();

    }
}
