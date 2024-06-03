public class Array {
    public static void main(String[] args) {
   
        int sum=0;
        int[] arr = new int[]{2,4,5,7,8,10};

        int target = 11;
       // int target2 = 11;
        // if flag is false i.e target not found 
        // if flag is true i.e target is found
        boolean flag=false;

        for(int i:arr){
            if(target==i){
              flag=true;
            }
        }

        if(flag==true){
            System.out.println("Target "+target+" was found" );
        }else{
            System.out.println("Target not found");
        }
    }



}
