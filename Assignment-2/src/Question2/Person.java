package Question2;

class Person {
    // Data Members
    private int age; // The age if this person
    private String name; // The name of this person
    private char gender; // The gender of this person

    // Default no argument constructor
    public Person() {
        // invokes overloaded constructor
        this("Unassigned", 0, 'U');
    }

    // Overloaded Constructor
    public Person(String personName, int personAge, char personGender) {
        name = personName;
        age = personAge;
        gender = personGender;
    }

    // Returns the age of this person.
    public int getAge(){
        return age;
    }

    // Returns tte gender if this person.
    public char getGender(){
        return gender;
    }

    // Returns the name if this person.
    public String getName(){
        return name;
    }

    // Sets the age if this person.
    public void setAge(int personAge){
        age = personAge;
    }

    // Sets the gender of this person.
    public void setGender(char personGender) {
        gender = personGender;
    }

    // Sets the name of this person.
    public void setName(String personName) {
        name = personName;
    }

    @Override
    public String toString(){
        return getName() + " " + getAge() + " " + getGender();
    }
}
