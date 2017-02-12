public class LengthConverter{
    static private double kmToMile = 0.621371192;
	
	static public double kmToMile(double km) 
	{
		if (km < 0){throw new IllegalArgumentException("Argument must be non-negative.");}		   
		double result = km * kmToMile ; 
		return result;
	}
	
	static public double mileToKm(double mile)
	{
		if (mile < 0) {throw new IllegalArgumentException("Argument must be non-negative.");}		   
		double result = mile / kmToMile ; 
		return result;
	}
	
	public static void main(String[] args)
	{
		double value[] = { 1.00, 3.1415926, 1000, 0.003, 6.0E-23,
		    93000000.00, Double.MIN_VALUE, Double.MAX_VALUE, 0, Double.NaN, -10};

		LengthConverter lenConv = new LengthConverter();
		for (int i = 0; i <= 10; i++) {
			System.out.println(value[i] + " km = " + lenConv.kmToMile(value[i]) + " miles"); 
			System.out.println(value[i] + " miles = " + lenConv.mileToKm(value[i]) + " km"); 
		}
	}
}
