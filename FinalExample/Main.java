public class Main {

    static final float PI = 3.1415f;
    static int i =10;
    
    public static void main(String[] args) {

        Student s = new Student("Dinesh","VESIT");
        System.out.println(s.collegeName);
        System.out.println(s.name);
        Student s1 = new Student("XYZ","IIT");
        System.out.println(s1.collegeName);
        System.out.println(s1.name);
        System.out.println(Student.collegeName);
        Student.collegeName="IIT";

    }
}
