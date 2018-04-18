import org.junit.Assert;
import org.junit.Test;



public class SumDivTest {
@Test
	public void SumDiv()
	{
		SumDivDemo sdDemo= new SumDivDemo();
		int result = sdDemo.sumDemo();
		Assert.assertEquals(2107 , result);
		
		
	}
}
