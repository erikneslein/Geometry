/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
     public static double trapezoidArea(double bottom, double top, double height) 
     {
          double area = (bottom + top) / 2 * height;
          return area;
      }
     public static double rectPrismVolume(double length, double width, double height)
     {
         double volume = length * width * height;
         return volume;
     }
     public static double coneVolume(double radius, double height)
    {
         double volume = Math.PI * radius * radius * (height / 3);
         return volume;
    }
    public static double rectPrismSurfaceArea(double length, double width, double height)
    {
        double surfaceArea = 2 * (width * length + height * length + height * width);
        return surfaceArea;
    }
    public static double sphereSurfaceArea(double radius)
    {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
        
    }
    public static double triangleHypotenuse(double a, double b)
    {
        double hypotenuse = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        return hypotenuse;
    }
     public static double distanceBetweenTwoPoints(double x1, double x2, double y1, double y2)
     {
         double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
         return distance;
      }
    public static double slopeOfLineBetweenTwoPoints(double x1, double x2, double y1, double y2)
    {
        double slope = (y2 - y1) / (x2 - x1);
        return slope;
    }
    public static double triangleAreaThreeSides(double a, double b, double c)
    {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
    public static void main(String[] args)
    {  
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println(ra1);
        
        double tra1 = trapezoidArea( 2, 2, 2);
        System.out.println(tra1);
        
        double rec1 = rectPrismVolume(2, 2, 2);
        System.out.println(rec1);
        
        double con1 = coneVolume(2, 2);
        System.out.println(con1);
        
        double rec2 = rectPrismSurfaceArea(2, 2, 2);
        System.out.println(rec2);
        
        double ssa = sphereSurfaceArea(2);
        System.out.println(ssa);
       
        double trah = triangleHypotenuse(2, 2);
        System.out.println(trah);
        
        double dis = distanceBetweenTwoPoints(1, 2, 3, 4);
        System.out.println(dis);
        
        double slo = slopeOfLineBetweenTwoPoints(1, 2, 3, 4);
        System.out.println(slo);
        
        double tria = triangleAreaThreeSides(2, 2, 2);
        System.out.println(tria);
    }
}
