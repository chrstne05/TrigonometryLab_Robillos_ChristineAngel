/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trigonomterylab;
import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author student
 */
public class TrigonomteryLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 

        //Problem 1
        
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
        
        // Java's trigonometric functions use radians. 
        // Therefore, we convert the angle from degrees to radians. 
        // Formula: radians = degrees × π / 180        
        double radians = Math.toRadians(angle);

        System.out.println("Pick a function of your choice:");
        System.out.println("1 - Sine");
        System.out.println("2 - Cosine");
        System.out.println("3 - Tangent");
        System.out.println("4 - All three");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // sin(θ) gives the sine of the angle.        
        if (choice == 1){
            System.out.println("Sine = " + Math.sin(radians));
        
        // cos(θ) gives the cosine of the angle.
        } else if (choice == 2){
            System.out.println("Cosine = " + Math.cos(radians));
            
        // tan(θ) = sin(θ) / cos(θ). 
        // Tangent is undefined when cosine is zero, which occurs at 90°, 270°, etc.     
        } else if (choice == 3){
            if (abs((angle % 180) - 90) <= 1) {
                System.out.println("Tangent is undefined or close to undefined.");
            } else {
                System.out.println("Tangent = " + tan(radians));
            }
                    
        // Calculate all three trigonometric functions.
        } else if (choice == '4') {

            System.out.println("Sine = " + sin(radians));
            System.out.println("Cosine = " + cos(radians));

            if (abs((angle % 180) - 90) <= 1) {
                System.out.println("Tangent is undefined or close to undefined.");
            } else {
                System.out.println("Tangent = " + tan(radians));
            }

        } else {

            System.out.println("Invalid choice.");
        }
        
        //Critical THinking Questions:
        //  1. Why do we need to convert angles from degrees to radians?
        //       We need to convert degrees to radians because Java's Math.sin(), Math.cos(), and Math.tan() use radians when calculating angles.
        //  2. What makes tangent undefined at certain angles?
        //       Tangent becomes undefined when the cosine of the angle is zero. This happens at angles like 90° and 270°, because we cannot divide by zero.
        //  3. How could you modify this program to also calculate reciprocal functions?
        //      We can add calculations for cosecant, secant, and cotangent using the reciprocals of sine, cosine, and tangent.
        
        
        
        
        //Problem 2
        
        System.out.print("Enter an angle in degrees to determine its quadrant and signs:");
        double quadrantAngle = input.nextDouble();
        
        // An angle can be larger than 360° or negative. 
        // We use the remainder after dividing by 360 to normalize the angle between 0° and 360°.
        double hello = quadrantAngle % 360;
        
        // If the "a" angle is negative, add 360° to make it positive.
        if (hello < 0) {
            hello = hello + 360;
        }

        System.out.println("hello angle: " + hello + "°");
        
        // 0° lies on the positive x-axis.
        if (hello == 0) {

            System.out.println("The angle is on the positive x-axis.");
            System.out.println("Sine: 0");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: 0");
        
        // 90° lies on the positive y-axis.
        } else if (hello == 90) {

            System.out.println("The angle is on the positive y-axis.");
            System.out.println("Sine: Positive");
            System.out.println("Cosine: 0");
            System.out.println("Tangent: Undefined");
        
        // 180° lies on the negative x-axis.    
        } else if (hello == 180) {

            System.out.println("The angle is on the negative x-axis.");
            System.out.println("Sine: 0");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: 0");

        // 270° lies on the negative y-axis.    
        } else if (hello == 270) {

            System.out.println("The angle is on the negative y-axis.");
            System.out.println("Sine: Negative");
            System.out.println("Cosine: 0");
            System.out.println("Tangent: Undefined");
        
        // Quadrant I: sine, cosine, and tangent are all positive.    
        } else if (hello > 0 && hello < 90) {

            System.out.println("Quadrant I");
            System.out.println("Sine: Positive");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: Positive");

        // Quadrant II: sine is positive, while cosine and tangent are negative.    
        } else if (hello > 90 && hello < 180) {

            System.out.println("Quadrant II");
            System.out.println("Sine: Positive");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: Negative");

        // Quadrant III: sine and cosine are negative, while tangent is positive.    
        } else if (hello > 180 && hello < 270) {

            System.out.println("Quadrant III");
            System.out.println("Sine: Negative");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: Positive");

        // Quadrant IV: sine is negative, while cosine and tangent are positive/negative.    
        } else {

            System.out.println("Quadrant IV");
            System.out.println("Sine: Negative");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: Negative");
        }
                    
        //Critical Thinking Questions:
        //  1. Why is it important to normalize angles before determining their quadrant?
        //      It is important because an angle can be bigger than 360° or negative. Normalizing it changes the angle to a value between 0° and 360°, making it easier to find its quadrant.
        //  2. How does the sign of trigonometric functions change across different quadrants?
        //      The signs change depending on the quadrant. Some functions are positive while others are negative. For example, sine is positive in the first two quadrants but negative in the last two.
        //  3. What special considerations are needed for angles exactly on the axes?
        //      Angles like 0°, 90°, 180°, and 270° are on the axes, so they do not belong to a quadrant. We need to handle them separately.
        
        
        
        
        // Problem 3
        System.out.println("Choose what you know:");
        System.out.println("1 - Two sides");
        System.out.println("2 - One side and one angle");

        System.out.print("Enter your choice: ");
        char tine = input.next().charAt(0);

        double a = 0;
        double b = 0;
        double c = 0;
        double angleA = 0;
            double angleB = 0;

        if (tine == '1') {

            System.out.println("\nChoose the two given sides:");
            System.out.println("1 - Two legs");
            System.out.println("2 - One leg and hypotenuse");

            System.out.print("Enter your choice: ");
            char wow = input.next().charAt(0);

            if (wow == '1') {

                System.out.print("Enter first leg: ");
                a = input.nextDouble();

                System.out.print("Enter second leg: ");
                b = input.nextDouble();

                // The sides of a triangle must be positive.
                if (a <= 0 || b <= 0) {

            System.out.println("Sides must be positive.");

            } else {
               
                // Pythagorean theorem: c² = a² + b²
                // Therefore: c = √(a² + b²)
                c = sqrt((a * a) + (b * b));

                // tan(A) = opposite / adjacent
                // tan(A) = a / b
                // Therefore: A = tan⁻¹(a / b)
                angleA = toDegrees(atan(a / b));

                // The two acute angles of a right triangle is add up to 90°.
                angleB = 90 - angleA;

                // Area = 1/2 × base × height
                double area = (a * b) / 2;

                System.out.println("\nTriangle Results:");
                System.out.println("Side a = " + a);
                System.out.println("Side b = " + b);
                System.out.println("Hypotenuse c = " + c);
                System.out.println("Angle A = " + angleA + "°");
                System.out.println("Angle B = " + angleB + "°");
                System.out.println("Angle C = 90°");
                System.out.println("Area = " + area);
            }

            } else if (wow == '2') {

                System.out.print("Enter the leg: ");
                a = input.nextDouble();

                System.out.print("Enter the hypotenuse: ");
                c = input.nextDouble();

                // The sides must be positive.
                if (a <= 0 || c <= 0) {

                System.out.println("Sides must be positive.");

                // The hypotenuse must always be longer than a leg.
                } else if (a >= c) {

                System.out.println(
                "The hypotenuse must be longer than the leg."
                );

            } else {

                // Pythagorean theorem: a² + b² = c²
                // Therefore: b = √(c² - a²)
                b = sqrt((c * c) - (a * a));

                // sin(A) = opposite / hypotenuse
                // sin(A) = a / c
                // Therefore: A = sin⁻¹(a / c)
                angleA = toDegrees(asin(a / c));

                // The two acute angles add up to 90°.
                angleB = 90 - angleA;

                // Area = 1/2 × base × height
                double area = (a * b) / 2;

                System.out.println("\nTriangle Results:");
                System.out.println("Side a = " + a);
                System.out.println("Side b = " + b);
                System.out.println("Hypotenuse c = " + c);
                System.out.println("Angle A = " + angleA + "°");
                System.out.println("Angle B = " + angleB + "°");
                System.out.println("Angle C = 90°");
                System.out.println("Area = " + area);
                }

            } else {

                System.out.println("Invalid choice.");
            }

        } else if (tine == '2') {

            System.out.print("Enter the known side: ");
            a = input.nextDouble();

            System.out.print("Enter the known angle: ");
            angleA = input.nextDouble();

                // The side must be positive.
                if (a <= 0) {

                System.out.println("The side must be positive.");

            // A non-right angle in a right triangle must be greater than 0° and less than 90°.
            } else if (angleA <= 0 || angleA >= 90) {

            System.out.println(
            "The angle must be greater than 0° and less than 90°."
            );

            } else {

            // The two acute angles add up to 90°.
            angleB = 90 - angleA;

            // sin(A) = opposite / hypotenuse
            // Therefore: c = a / sin(A)
            c = a / sin(toRadians(angleA));

            // tan(A) = opposite / adjacent
            // Therefore: b = a / tan(A)
            b = a / tan(toRadians(angleA));

            // Area = 1/2 × base × height
            double area = (a * b) / 2;

            System.out.println("\nTriangle Results:");
            System.out.println("Side a = " + a);
            System.out.println("Side b = " + b);
            System.out.println("Hypotenuse c = " + c);
            System.out.println("Angle A = " + angleA + "°");
            System.out.println("Angle B = " + angleB + "°");
            System.out.println("Angle C = 90°");
            System.out.println("Area = " + area);
            }

        } else {

            System.out.println("Invalid choice.");
        }
               
        //Critical Thinking Questions:
        //  1. Why must we validate that angles in a right triangle are less than 90°?
        //      Because the other two angles of a right triangle must be less than 90°. If an angle is 90° or more, it would not be a valid right triangle.
        //  2. How does your program handle the different cases of known values?
        //      The program asks what values are already known, then uses the correct formula to find the missing sides or angles.
        //  3. What would happen if a user entered values that don't form a valid right triangle?
        //      The program should tell the user that the values are invalid and ask them to enter correct values.
                
                
        
        
        //Problm 4
        System.out.print("Enter an angle in degrees: ");
            double idea = input.nextDouble();

            // Java's trigonometric functions use radians, so the angle must be converted from degrees to radians.
            double theta = toRadians(idea);

            // Calculate the basic trigonometric values that will be used in the identities.
            double sinValue = sin(theta);
            double cosValue = cos(theta);
            double tanValue = tan(theta);

            // Floating-point calculations can have very small rounding errors. A tolerance allows us to consider values extremely close to each other as equal.
            double tolerance = 0.000001;

            // Identity 1
            // sin²θ + cos²θ = 1

        System.out.println("\nIdentity 1:");
        System.out.println("sin²θ + cos²θ = 1");

            // Calculate the left side of the identity.
            double left1 = (sinValue * sinValue) + (cosValue * cosValue);

            // The right side is always 1.
            double right1 = 1;

            // Compare the two sides using the tolerance.
            if (abs(left1 - right1) <= tolerance) {

                System.out.println("TRUE");

                } else {

                System.out.println("FALSE");

                // Display the difference if the identity oes not hold within the tolerance.
                System.out.println("Difference = " + abs(left1 - right1));
                }

                
            // Identity 2
            // 1 + tan²θ = sec²θ

            System.out.println("\nIdentity 2:");
            System.out.println("1 + tan²θ = sec²θ");

                // Secant is the reciprocal of cosine: sec(θ) = 1 / cos(θ)
                // Tangent and secant are undefined when cos(θ) is equal to zero.
                if (abs(cosValue) < tolerance) {

                System.out.println("Cannot verify because tangent and secant are undefined.");
                } else {

                // Calculate the left side: 1 + tan²θ
                double left2 = 1 + (tanValue * tanValue);

                // Calculate secant: sec(θ) = 1 / cos(θ)
                double valueee = 1 / cosValue;

                // Calculate the right side: sec²θ
                double right2 = valueee * valueee;

                // Compare both sides using the tolerance.
                if (abs(left2 - right2) <= tolerance) {

                System.out.println("TRUE");

                } else {

                System.out.println("FALSE");

                // Display the difference if the identity does not hold within the tolerance.
                System.out.println("Difference = " + abs(left2 - right2));
                }
            }

            // Identity 3
            // sin(2θ) = 2sinθcosθ

            System.out.println("\nIdentity 3:");
            System.out.println("sin(2θ) = 2sinθcosθ");

                // Calculate the left side: sin(2θ)
                double left3 = sin(2 * theta);

                // Calculate the right side: 2sinθcosθ
                double right3 = 2 * sinValue * cosValue;

                // Compare both sides using the tolerance.
                if (abs(left3 - right3) <= tolerance) {

                System.out.println("TRUE");

                } else {

                System.out.println("FALSE");

                // Display the difference if the identity does not hold within the tolerance.
                System.out.println("Difference = " + abs(left3 - right3));
                }

        //Critical Thinking Questions:
        //1. Why do we need a tolerance when comparing floating-point values?
        //      We need a tolerance because computers sometimes have very small differences when doing decimal calculations. The values may look slightly different even though they are supposed to be equal.
        //2. Which identity might be most susceptible to floating-point precision issues and why?
        //      The identity 1 + tan²θ = sec²θ can have precision issues, especially near angles where tangent becomes very large or undefined.
        //3. How could you extend this program to verify more complex identities?
        //      We could add more trigonometric identities to the program and let the user choose which identity they want to check.
          
        
            
            
        //Problem 5
        System.out.print("Enter amplitude: ");
        double amplitude = input.nextDouble();

        System.out.print("Enter frequency: ");
        double frequency = input.nextDouble();

        System.out.print("Enter phase shift in degrees: ");
        double shift = input.nextDouble();

        System.out.print("Enter time: ");
        double time = input.nextDouble();

        // Amplitude represents the maximum displacement of the wave, so it cannot be negative.
        if (amplitude < 0) {

            System.out.println("Amplitude cannot be negative.");

        // Frequency represents the number of cycles per unit of time, so it must be greater than zero.
        } else if (frequency <= 0) {

            System.out.println("Frequency must be greater than zero.");

        } else {

            // Java uses radians for trigonometric functions, so the phase shift is converted from degrees to radians.
            double phaseRadians = toRadians(shift);

            // Wave equation: y = A sin(2πft + φ)
            // A = amplitude
            // f = frequency
            // t = time
            // φ = phase shift
            double value =
                    amplitude *
                    sin((2 * PI * frequency * time)
                    + phaseRadians);

            System.out.println("\nWave Results:");
            System.out.println("Instantaneous value = " + value);

            // A peak occurs when the wave reaches its maximum value, which is the amplitude.
            if (abs(value - amplitude) <= tolerance) {

                System.out.println("The wave is at a PEAK.");

            // A trough occurs when the wave reaches its minimum value, which is negative amplitude.
            } else if (abs(value + amplitude) <= tolerance) {

                System.out.println("The wave is at a TROUGH.");

            // A zero-crossing occurs when the wave has a value approximately equal to zero.
            } else if (abs(value) <= tolerance) {

                System.out.println("The wave is at a ZERO-CROSSING.");

            } else {

                System.out.println(
                    "The wave is not at a peak, trough, or zero-crossing."
                );
            }

            // Find the next peak of the wave.
            // A peak occurs when: 2πft + φ = π/2 + 2πn

            double currentAngle =
                    (2 * PI * frequency * time)
                    + phaseRadians;

            // Determine the next cycle where the wave reaches its peak.
            double numberrr =
                    ceil(
                        (currentAngle - (PI / 2))
                        / (2 * PI)
                    );

            // Calculate the angle at the next peak.
            double numberrrrrr =
                    (PI / 2)
                    + (2 * PI * numberrr);

            // Solve for the time when the next peak occurs.
            double timeee =
                    (numberrrrrr - phaseRadians)
                    / (2 * PI * frequency);

            // If the calculated peak is already at the current time, find the following peak.
            if (timeee <= time + tolerance) {

                timeee = timeee + (1 / frequency);
            }

            System.out.println(
                "Next peak time = " + timeee);
        }    
        
        
        //Critical Thinking Questions:
        //  1. How did you determine if the wave is at a peak or trough?
        //      We can look at the value of the wave. If it reaches its highest value, it is at a peak. If it reaches its lowest value, it is at a trough.
        //  2. What mathematical approach did you use to find the next peak?
        //      We can use the wave's period to find when the next peak will happen. The period tells us how long it takes for the wave to repeat.
        //  3. How would you modify this program to handle non-sinusoidal waves?
        //      We could add different formulas for other types of waves, such as square waves or triangle waves, and let the user choose the type of wave.


      scanner.close();    
    }
    
}
