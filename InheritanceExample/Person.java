
public class Person {

    String name;
    int age;

   
    Person(String name , int age){
    this.name = name;
    this.age = age;
    }
    
    String toString(String name,int rollno){
        return name+rollno;
    }

    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    
}
