class Student{
    
    String name;
    int age;
    private int rollNo;
     int counter=0;
    static String collegeName = "VESIT";

    Student(String name,int age){
        this.name = name;
        this.age = age;
        this.rollNo= getCounter();
    }

     int getCounter(){
        counter++;
        return counter;
    }

    // static void setCollegeName(String collegeName){
    //     CollegeName = collegeName;
    // }

    public int getRollNo(){
        return this.rollNo;
    }
    
}