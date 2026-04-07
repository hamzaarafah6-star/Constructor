package javaapplication98;
public class JavaApplication98 {
public static void main(String[] args) {
person p1=new person("Hamza Arafah is ",10);        
person p2=new person("Ashraf Mostafa ",45);            
System.out.println(p1.getname()+p1.getage()+" years old");
System.out.println(p2.getname()+p2.getage()+" years old\n");   
System.out.println("set new age and name:");
p1.setage(19);
p2.setage(50);
System.out.println(p1.getname()+p1.getage()+" years old");
System.out.println(p2.getname()+p2.getage()+" years old\n");   }
    
}
 class person {
private double age;
private String name;
public person(String name,double age){
this.age=age;
this.name=name;
}
public void setname(String name){this.name=name;}
public void setage(double age){this.age=age;}
public String getname(){return name;}
public double getage(){return age;}    
}