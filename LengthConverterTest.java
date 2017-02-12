import static org.junit.Assert.*;
import org.junit.Test;

public class LengthConverterTest {
	private double delta = 0.0001 ;
	  
	  @Test
		public void test1() {	
			double expected = 1.6093440006146922;
			double value = 1.00;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}
	  
	  @Test
		public void test2() {	
			double expected = 5.055903203185513;
			double value = 3.1415926;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}
	  
	  @Test
		public void test3() {	
			double expected = 1609.344000614692;
			double value = 1000.0;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}
	  
	  @Test
		public void test4() {	
			double expected = 0.0048280320018440764;
			double value = 0.003;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}
	  
	  @Test
		public void test5() {	
			double expected = 9.656064003688152E-23;
			double value = 6.0E-23;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}
	  
	  @Test
		public void test6() {	
			double expected = 1.4966899205716637E8;
			double value = 9.3E7;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}
	  
	  @Test
		public void test7() {	
			double expected = 1.0E-323;
			double value = 4.9E-324;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}

		@Test
		public void test8() {	
			try {
				double test = Double.NaN;
				LengthConverter.mileToKm(test);
			} catch (IllegalArgumentException e) {}	
		}
		
		@Test
		public void test9() {	
			try {
				LengthConverter.mileToKm(-1.0);
			} catch (IllegalArgumentException e) {}
		}	
			

		@Test
		public void test10() {	
			double expected = Double.POSITIVE_INFINITY;
			double value = Double.MAX_VALUE ;
			double result = LengthConverter.mileToKm(value);
			assertEquals(expected, result, delta);
		}
	
}