package classesPart1;

public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getlastName(){
        return this.lastName;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setFirstName(String value){
        this.firstName = value;
    }
    
    public void setLastName(String value){
        this.lastName = value;
    }
    
    public void setAge(int value){
        if(value < 0 || value > 100){
            this.age = 0;
        } else {
            this.age = value;
        }
    }
    
    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        } else {
            return false;
        }
    }
    
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }
        if(this.lastName.isEmpty()){
            return this.firstName;
        }
        if(this.firstName.isEmpty()){
            return this.lastName;
        }
        
        return this.firstName + " " + this.lastName;
    }
}
