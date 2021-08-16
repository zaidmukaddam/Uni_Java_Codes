public class Totalof5subjects1 {
    public static void main(String[] args) {
        int english, chemistry, computers, physics, maths;
        float total, Average;

        english = 75;
        chemistry = 89;
        computers = 99;
        physics = 85;
        maths = 97;

        total = english + chemistry + computers + physics + maths;
        Average = total / 5;

        System.out.println("Average Marks =  " + Average);
    }
}