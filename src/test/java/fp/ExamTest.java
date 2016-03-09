package fp;
import static fp.Exam.ipAdressType;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExamTest {

	@Test
	public void testIpAdressType() {
		double nota = 0;
		boolean pass = false;
		try {

			assertEquals(ipAdressType("10.0.100.23", null), 'a');
			assertEquals(ipAdressType("10.0.100.23", ""), 'a');
			assertEquals(ipAdressType("10.0.100.23", "255.0.0.0"), 'a');
			System.out.println("otro 0,5P");
			nota += 0.5;

			assertEquals(ipAdressType("150.7.200.9", null), 'b');
			assertEquals(ipAdressType("150.7.200.9", ""), 'b');
			assertEquals(ipAdressType("10.0.100.23", "255.255.0.0"), 'b');
			System.out.println("otro 0,5P");
			nota += 0.5;

			assertEquals(ipAdressType("200.30.110.5", null), 'c');
			assertEquals(ipAdressType("200.30.110.5", ""), 'c');
			assertEquals(ipAdressType("200.30.110.5", "255.255.255.0"), 'c');
			System.out.println("otro 0,5P");
			nota += 0.5;

			assertEquals(ipAdressType("10.0.100.23/8", null), 'a');
			assertEquals(ipAdressType("10.0.100.23/8", ""), 'a');
			System.out.println("otro 0,5P");
			nota += 0.5;

			assertEquals(ipAdressType("10.0.100.23/16", null), 'b');
			assertEquals(ipAdressType("10.0.100.23/16", ""), 'b');
			assertEquals(ipAdressType("150.7.200.9/16", ""), 'b');
			System.out.println("otro 0,5P");
			nota += 0.5;

			assertEquals(ipAdressType("150.7.200.9/24", null), 'c');
			assertEquals(ipAdressType("150.7.200.9/24", ""), 'c');
			assertEquals(ipAdressType("200.30.110.5/24", ""), 'c');
			System.out.println("otro 0,5P");
			nota += 0.5;

			pass = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Tu nota es: "+ nota);
			if (!pass) {
				fail();
			}
		}

	}



}