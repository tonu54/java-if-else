//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int a =5;
    int b =6;
    int c =7;
    if (a<b){
        if(b<c){
            System.out.println("Largest number = "+c+" And Smallest Number is "+a);
        }else{
            System.out.println("Largest number = "+b+ " And Smallest Number is "+a);
        }
    }
    if (b<a){
        if(a<c){
            System.out.println("Largest number = "+c+" And Smallest Number is "+b);
        }else{
            System.out.println("Largest number = "+a+ " And Smallest Number is "+b);
        }
    }
    }
}