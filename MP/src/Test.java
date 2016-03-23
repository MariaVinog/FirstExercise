import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class Test {

	
	
	@org.junit.Test
	public void test() {
		
		try {
		FileReader fr1 = new FileReader("ans1 - Copy.txt");
		FileReader fr2 = new FileReader("ans.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		String l1,l2;
		while((l1 = br1.readLine()) != null && (l2 = br2.readLine()) != null) {
			assertEquals(l1,l2); 
			}
		}catch (Exception e) {
			
		}
		
		
		}
	
	
	public void test2() {
		
		
		
		
		
	}

}
