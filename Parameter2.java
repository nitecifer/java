public class Parameter2 {
    static void checkAge(int age){
        if(age<18){
            System.out.println("not elegible for vote");
        }
        else{
            System.out.println("elegible for vote");
        }
    }
    public static void main (String args[]){
        checkAge(40);
        checkAge(13);
    }
    
}
