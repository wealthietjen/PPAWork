package sem2.week3.LGTDemos.RegularInterfaceDemo;

public class Staff implements Person {

    private String name;
    private int id;
    private int energy;
    private int addEnergy;

    public Staff(String name, int id) {
        energy = 0;
        this.name = name;
        this.id = id;
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
