class Calculator{

    public double Add(int a,double b){
        return a+b;
    }

    public double Add(double a ,int b){
        return a+b;
    }

    public double Add(double c, double d){
        return c+d;
    }
    public int Add(int a,int b){
        return a+b;
    }

    public int Add(int a ,int b ,int c){
        return a+b+c;
    }
    public int Add(int ...a){
        int sum = 0;
        for(int i :a){
            sum+=i;

        }
        return sum;
    }
}