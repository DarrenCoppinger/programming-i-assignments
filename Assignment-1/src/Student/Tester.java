package Student;

public class Tester {

    public static void main(String[] args) {
        //Open array for instances of student object
        Student[] studentArray = {new Student("Tom", 123456789L), new Student() ,new Student("Jerry", 987654321L)};

        //use enhanced loop to output values in studentArray
        for(Student s: studentArray) {
            System.out.println(s);
        }

        //Print Program Terminated and exit program
        System.out.println("Program Terminated");

    }

}
