class Person {
    private String name;
    private int age;
    public String getName(){
        return name;
    } 
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void introduce(){
        System.out.println("Hello my name is " + name + " and i am " + age+ " years old.");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       Person person = new Person();
       person.setName("Bishal Khadka");
       person.setAge(21);
       person.introduce();
    }
}
