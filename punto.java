package punto;


public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void coordenadasCartesianas() {
        System.out.println("los puntos en el plano cartesiano son : (" + x + ", " + y + ")");
    }

    public void coordenadasPolares() {
        double c = Math.sqrt(x * x + y * y);
        double a = Math.atan2(y, x);
        System.out.println("Las coordenadas Polares son : (r = " + c + ", θ = " + a + ")");
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        p.coordenadasCartesianas();
        p.coordenadasPolares();
        p.toString();
    }
}
