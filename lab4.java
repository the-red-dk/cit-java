class Box {
    double length;
    double width; 
    double height;

    Box() {
        length = -1;
        width = -1;
        height = -1;
    } //Default 

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }  //Parameterised

    Box(Box ob) {
        length = ob.length;
        width = ob.width;
        height = ob.height;
    }  //Copy Constructor

    Box (double len) {
        width = height = length = len;
    }  //Square condition 


    double volume() {
        return length * width * height;
    }  //Evaluate
}

class BoxW extends Box {
    double weight;

    BoxW() {
        super();
        weight = -1;
    }   //Default

    BoxW(double l, double w, double h, double wt) {
        super(l, w, h);
        weight = wt;
    }   //Parameterised

    BoxW(BoxW ob) {
        super(ob);
        weight = ob.weight;
    }   //Copy Constructor

    BoxW(double len, double wt) {
        super(len);
        weight = wt;
    }   //Just assign?
}

class Shipment extends BoxW {
    double cost;

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double l, double w, double h, double wt, double c) {
        super(l, w, h, wt);
        cost = c;
    }

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }


    Shipment (double l, double wt, double c) {
        super(l, wt);
        cost = c;
    }
}

public class lab4 {
    public static void main(String[] args) {

        Shipment s1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment s2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = s1.volume();
        System.out.println("Volume of Shipment 1 is: " + vol);
        System.out.println("Weight of Shipment 1 is: " + s1.weight);
        System.out.println("Shipping Cost of Shipment1 is: " + s1.cost);
        vol = s2.volume();
        System.out.println("Volume of Shipment 2 is: " + vol);
        System.out.println("Weight of Shipment 2 is: " + s2.weight);
        System.out.println("Shipping Cost of Shipment2 is: " + s2.cost);
    }
}