public class IfExample {

    public static void main(String[] args) {

        int a = 11;


       
        if(a%2==0){
            System.out.println("Number is divisble by 2");
        }else if(a%3==0){
            System.out.println("Number is divisble by 3");
        }else if(a%5==0){
            System.out.println("Number is divisble by 5");
        }else{
            System.out.println("Number not divisible by 2,3 and 5");
        }

    }
    
}
