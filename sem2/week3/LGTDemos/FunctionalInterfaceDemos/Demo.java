package sem2.week3.LGTDemos.FunctionalInterfaceDemos;

import java.util.ArrayList;

public class Demo {
    
    public static void main(String[] args) {
        
        ArrayList<Person> people = new ArrayList<Person>();
        
        people.add(new Student("Lyle", 22039642));
        people.add(new Student("Wealthie", 22046226));
        people.add(new Staff("Joshua", 63828302));
        people.add(new Staff("Turham", 48573485));

        for (Person person : people) {
            
            person.sleep();
            person.eat(65);

            System.out.println();
            System.out.println(person.getName() + ": " + person.talk());
            System.out.println("Energy Level: " + person.getEnergy());
            System.out.println("Income: £" + person.getPay(20));

        }

    }

}
