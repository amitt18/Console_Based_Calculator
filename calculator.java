import java.util.*;
public class calculator {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first num");
            int first  = sc.nextInt();
            System.out.println("Enter oper");
            char op = sc.next().charAt(0);
            System.out.println("Enter sec num");
            int sec  = sc.nextInt();
            int res = 0;
            switch(op){
                case '+':
                    res = first+sec;
                    break;
                case '-':
                    res = first-sec;
                    break;
                case '*':
                    res = first*sec;
                    break;
                case '/':
                    if(sec!=0){
                        res = first/sec;

                    }
                    else{
                        System.out.println("cant divide");
                        return;
                    }
                    break;
                default:
                    System.out.println("invalid");
                    return;
            }
            System.out.println(res);
        }
    }

