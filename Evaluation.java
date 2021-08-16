public class Evaluation {
    public static void main(String[] args) {
        int a=10,b =5,c=8,d=2;  
        float x=6.4F,y=3.0F;

        int Ans1 = a*b +c/d;
        int Ans2 = a *(b+c)/d;

        System.out.println("Order of Evaluation:");
        System.out.println("a*b +c/d = " + Ans1);
        System.out.println("a *(b+c)/d = " + Ans2);
        System.out.println();
        
        float ans3 = a/c;
        float ans4 =(float) a/c;
        float ans5 =a/y;

        System.out.println("Type Conversion:");        
        System.out.println("a/c = " + ans3);
        System.out.println("(float) a/c = "+ans4);
        System.out.println("a/y = " + ans5);
        System.out.println();

        int ans6 = a%c;
        int ans7 = (int) (x % y);

        System.out.println("Modulus Operation:");
        System.out.println("a%c = "+ans6);
        System.out.println("x % y = "+ ans7);
        System.out.println();

        Boolean bool1 = a>b && c>d;
        Boolean bool2 = a<b && c>d;
        Boolean bool3 = a<b || c>d;
        Boolean bool4 = !(a-b ==c);

        System.out.println("Logical Operation:");
        System.out.println("a>b && c>d = "+bool1);
        System.out.println("a<b && c>d = "+ bool2);
        System.out.println("a<b || c>d = "+bool3);
        System.out.println("!(a-b ==c) = "+bool4);

    }   
}
