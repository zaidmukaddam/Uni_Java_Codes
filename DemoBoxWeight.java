// This program uses inheritance to extend Box1.
class Box1 {
    double width;
    double height;
    double depth;// construct clone of an object

    Box1(Box1 ob) {
        // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box1() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // Box1
    }

    // constructor used when cube is created
    Box1(double len) {
        width = height = depth = len;
    }// compute and return volume

    double volume() {
        return width * height * depth;
    }
}

// Here, Box1 is extended to include weight.
class Box1Weight extends Box1 {
    double weight; // weight of Box1

    // constructor for Box1Weight
    Box1Weight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {
        System.out.println("K039/Zaid Mukaddam");
        
        Box1Weight myBox1 = new Box1Weight(10, 20, 15, 34.3);
        Box1Weight myBox2 = new Box1Weight(2, 3, 4, 0.076);
        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();
        vol = myBox2.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
    }
}