public class main {

    static int i=20;
    public static void main(String[] args) {
        byte b1= 5;
        byte b2 = 12;
        int result = Addition(b1, b2);

        System.out.println(result);

        int result2 = Addition(12, 88);
        
        System.out.println(result2);

        Operation(1,2,3,4);
        System.out.println("Multi addition result ="+ MultiAddition(1,2,3,4,5,6,7,8,8,10));

    }

    static int Addition(int s1,int s2){
        int sum =0;
        sum = s1+s2+i;
        return sum;
    }

    static void Operation(int a,int b , int c, int d){
        int op1 = a+b;
        int op2 = c-d;
        System.out.println(op1+op2);
    }

    // Variable arguments // VarArgs
    static int MultiAddition(int ...a){
        int sum =0;
        for(int j:a){
            sum=sum+j;
        }
        return sum;
    }
    

}
