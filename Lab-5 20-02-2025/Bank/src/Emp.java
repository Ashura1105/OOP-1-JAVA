public class Emp extends Person {
int id;
String name;
Address address;
public Emp(int id,String name,Address address){
    this.id=id;
    this.name=name;
    this.address=address;
}
void display(){
    System.out.println("ID:"+id+"  Name:"+name);
    System.out.println("Address:"+address.city+","+address.state+","+address.country);
}

}
