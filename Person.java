public class Person {
    // BIO
    private String name;
    private int roll;

    // Person Constructor
    Person(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
  
    // Getting Person Information
    public String getData(){
        return this.name + " and the Roll number is: " + this.roll;
    }
}
