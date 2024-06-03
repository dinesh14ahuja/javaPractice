class Student extends Person{
    int rollNo;
    int marks;

    // Student(String name , int age ,int rollNo, int marks){ 
    //     super.name=name;
    //     super.age= age;
    //     this.rollNo = rollNo;
    //     this.marks = marks;

    // }
    Student(String name,int age,int rollNo,int marks){
        super(name,age);
        this.rollNo= rollNo;
        this.marks= marks;
    }

    int getRollNo(){
        System.out.println(super.toString("Dinesh",20));
        return this.rollNo;
    }
    int getmarks(){
        return this.marks;
    }


    
}
