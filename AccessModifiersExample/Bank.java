class Bank{
    private String accountNo;
    private String name;
    // HDFC00001246
    Bank(String name){
        this.name = name;

    }

    private String getAccountNo(){
        return this.accountNo;
    }

    public void setAccountNo(String accountNo){
        this.accountNo = "HDFC"+accountNo;
    }
    
}