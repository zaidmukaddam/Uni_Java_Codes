/**
 * Area
 */
class Area {
    double length;
    double breadth;
    double radius;
    double height;

    double areaRect() {
        return length * breadth;
    }

    double areaCircle() {
        return 3.14 * radius * radius;
    }

    double volume() {
        return length * height * breadth;
    }
}

/**
 * Input
 */
class Input extends Area {

    Input() {
        length = 12;
        breadth = 12;
        height = 12;
        radius = 3;
    }

}

/**
 * Display
 */
class Display {
    public static void main(String[] args) {
        System.out.println("K039/Zaid Mukaddam");

        Input a = new Input();

        double rect = a.areaRect();
        double cir = a.areaCircle();
        double vol = a.volume();

        System.out.println("Area of Rectangle is " + rect);
        System.out.println("Area of Circle is " + cir);
        System.out.println("Volume of Box is " + vol);

    }
}
