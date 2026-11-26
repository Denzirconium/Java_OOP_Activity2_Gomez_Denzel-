/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package engineeringpoint;

/**
 *
 * @author Gomez_cpe113
 */
public class EngineeringPoint {

    // Declare private coordinates
    private double x, y;

    // Constructor to initialize coordinates
    public EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setters to update coordinates
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    // Getters to return coordinates
    public double getX() { return x; }
    public double getY() { return y; }

    // Calculate distance using distance formula
    public double calculateDistance(EngineeringPoint p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    // Calculate slope using slope formula
    public double calculateSlope(EngineeringPoint p) {
        return (p.x == x) ? Double.NaN : (p.y - y) / (p.x - x);
    }

    // Main method
    public static void main(String[] args) {

        // Create three EngineeringPoint objects
        EngineeringPoint A = new EngineeringPoint(3, 4);
        EngineeringPoint B = new EngineeringPoint(9, 12);
        EngineeringPoint C = new EngineeringPoint(3, 10);

        // Display program title
        System.out.println("===== ENGINEERING DISTANCE AND SLOPE ANALYZER =====");

        // Display coordinates of Point A and B
        System.out.printf("\nPoint A: (%.2f, %.2f)%n", A.getX(), A.getY());
        System.out.printf("Point B: (%.2f, %.2f)%n", B.getX(), B.getY());

        // Calculate distance and slope between A and B
        System.out.printf("Distance: %.2f units%n", A.calculateDistance(B));
        printSlope("Slope", A.calculateSlope(B));

        // Display coordinates of Point C
        System.out.printf("Point C: (%.2f, %.2f)%n", C.getX(), C.getY());

        // Calculate distance and slope between B and C
        System.out.printf("Distance B-C: %.2f units%n", B.calculateDistance(C));
        printSlope("Slope B-C", B.calculateSlope(C));

        // Calculate distance and slope between A and C
        System.out.printf("Distance A-C: %.2f units%n", A.calculateDistance(C));
        printSlope("Slope A-C", A.calculateSlope(C));
    }

    // Display slope or Undefined for vertical lines
    public static void printSlope(String label, double slope) {
        if (Double.isNaN(slope))
            System.out.println(label + ": Undefined");
        else
            System.out.printf("%s: %.2f%n", label, slope);
    }
}