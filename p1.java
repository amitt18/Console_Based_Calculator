import java.util.*;
class p1{
    int roll;
    String name;
    p1(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
   

    public static void main(String[] args) {
          p1  amit = new p1(2,"virat");
        System.out.println(amit.name);
        System.out.println(amit.roll);

    }
}
