public class Bank {
    public String Bname;
    Emp employee1;
    Bank(String Bname,Emp employee1){
        this.Bname=Bname;
        this.employee1=employee1;
    }
    void openAccount(){
        System.out.println("Account opened");
    }
    void closeAccount(){
        System.out.println("Account closed");
    }
}
