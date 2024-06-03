public class Multi {
    public static void main(String[] args){
        int[][] multiarr = new int[2][2];
        multiarr[0][0]=1;
        multiarr[0][1]=5;
        multiarr[1][0]=7;
        multiarr[1][1]=6;

        for(int i=0;i<multiarr.length;i++){
            for(int j=0;j<multiarr.length;j++){
                System.out.println(multiarr[i][j]);
            }
        }
    }
}
