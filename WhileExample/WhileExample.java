public class WhileExample {
    
    public static void main(String[] args) {
        
        int i = 20;
        int j =0;
        int sum =0;
        while (j<=i) {
            sum = sum+j;
            j++;
        }
        System.out.println("sum of "+i+" nattural numbers = "+sum);
    }
}
