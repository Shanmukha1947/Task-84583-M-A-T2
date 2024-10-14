public class CircleCalculator {

    public static double calculateCircumference(double radius) {

        // Check for negative radius
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

        final double pi = 3.14;
        double circumference = 2 * pi * radius;

        return circumference;
    }


    public static void main(String[] args){
        double radius = 5.5;
        try {
            double circumference = calculateCircumference(radius);
            System.out.println("Circumference of the circle with radius " + radius + " is: " + circumference);

            radius = -3.0;
            circumference = calculateCircumference(radius);
            System.out.println("Circumference of the circle with radius " + radius + " is: " + circumference);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
