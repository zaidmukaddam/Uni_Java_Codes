public class triangle1

{

    double side1, side2, side3;

    public void setside1(double a) {

        side1 = a;

    }

    public void setside2(double b)

    {

        side2 = b;

    }

    public void setside3(double c)

    {

        side3 = c;

    }

    public double getside1()

    {

        return (side1);

    }

    public double getside2()

    {

        return (side2);

    }

    public double getside3()

    {

        return (side3);

    }

    public double perimeter()

    {

        double perimeter;

        perimeter = side1 + side2 + side3;

        return perimeter;

    }

    public static void main(String args[])

    {

        triangle1 t = new triangle1();

        t.setside1(50);

        t.setside2(45);

        t.setside3(55);

        System.out.println(t.getside1());

        System.out.println(t.getside2());

        System.out.println(t.getside3());

        System.out.println(t.perimeter());

    }

}
