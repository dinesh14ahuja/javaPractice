public class ForExample {


    public static void main(String args[]){

       int i=20;
       for(int j=0;j<i;j++){
        if(j%2==0){
            continue;
        }
        System.out.println("Value of j="+j);
       }

       System.out.println("Program completed");
    }
    
}
