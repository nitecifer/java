class Student{
    String name; 
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPS1 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Kirti";
        s1.age = 21;

        s1.printInfo();
    }

    
}
