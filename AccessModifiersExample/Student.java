class Student{
    // private public protected default(No keyword required)
    // public -> default->protected->private
    private String name;
    private int age;

    Student(){
        
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        printName();
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    private void printName(){
        System.out.println(this.name);
    }
}