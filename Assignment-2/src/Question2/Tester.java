package Question2;

public class Tester {
    public static void main(String[] args) {
        //Open array for instances of Person object
        Person personArray[] = new Person[2];

        //String personName, int personAge, char personGender
        personArray[0] = new Person("Luke", 19, 'M');
        personArray[1] = new Person("Leia", 19, 'F');

        System.out.println("Age in first Star Wars appearance");
        //use enhanced loop to output values in personArray
        for(Person p: personArray) {
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Age in last Star Wars appearance");
        personArray[0].setAge(53);
        personArray[1].setAge(54);
        for(Person p: personArray) {
            System.out.println(p);
        }
        //Print Program Terminated and exit program
        System.out.println("Program Terminated");
    }
}
