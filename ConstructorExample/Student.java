class Student{

    String name;

    int age;

    boolean gender;
   
    //Constructor 
    Student(){
       
    }

    Student(String name , int age , boolean gender){
        this.name =name;
        this.age = age;
        this.gender = gender;
    }

    // Student(String name , boolean gender){
    //     this.name = name;
       
    //     this.gender = gender;
    // }

    boolean getGender(){
        return this.gender;
    }

    void setGender(boolean gender){
        this.gender = gender;
    }

    
//this keyword
    int getAge(){
        return this.age;
    }

    
    String getName(){
        return this.name;
    }

}