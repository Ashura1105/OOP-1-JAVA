public class Main{

    public static void main(String[] args) {
        Address address1=new Address("dhaka","UP","BG");
        Address address2=new Address("Manikganj","UP","BG");

        Emp e1=new Emp(111,"Suraiya",address1);
        Emp e2=new Emp(112,"Ema",address2);

        e1.display();
        e1.display2();
        e2.display();

        Bank b1= new Bank("Sonali bank",e1);
        b1.openAccount();
        b1.closeAccount();
    }
}