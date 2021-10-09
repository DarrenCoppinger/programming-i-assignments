package Student;

public class Student {
    //Variables
    public String name;
    public long IDnumber;

    //Constructors
    public Student(){
        //If an instance of Student is created without input
        //variable values the default values for the String (null)
        //and the Long (OL) data type are assigned. Could also
        //use "this(null, 0L);"
        this.name = null;
        this.IDnumber = 0L;
    }

    public Student(String name, long IDnumber){
        this.name = name;
        this.IDnumber = IDnumber;
    }

    //Methods
    //
    //overwrite toString method
    public String toString() {
        return "Name: " + getName() + ", ID Number: " + getIDnumber();
    }

    //Name getters
    public String getName() {
        return name;
    }
    //Name setter
    public void setName(String name) {
        this.name = name;
    }

    //IDNumber getter
    public long getIDnumber() {
        return IDnumber;
    }

    //IDNumber Setter
    public void setIDnumber(long IDnumber) {
        this.IDnumber = IDnumber;
    }
}
