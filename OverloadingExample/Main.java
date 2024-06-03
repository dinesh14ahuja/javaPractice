class Main{
    public static void main(String[] args){
        Calculator c = new Calculator();

        System.out.println(c.Add(1,2));
        System.out.println(c.Add(1,2,3));
        System.out.println(c.Add(1,2,3,4,5,6,7));
        System.out.println(c.Add(3d,5d));
        System.out.println(c.Add(1,6d));
        System.out.println(c.Add(5d,9));
    }
}