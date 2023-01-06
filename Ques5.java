import java.until.*;
class Ques3{
      public static void main(String args[]){
         int a,b,temp;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of a and b");
         a = sc.nextInt();
         b = sc.nextInt();
         temp = a;
         a = b;
         b = temp;
         System.out.println("The value of a and b after swaping : \na : "+ a + "\nb : " + b);
}
}
