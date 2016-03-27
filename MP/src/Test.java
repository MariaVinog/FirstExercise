import static org.junit.Assert.*;

/**
 * @author Most601 mariavinogradov aviv
 */
public class Test {

	@org.junit.Test
	public void Test_tinyEWD_test1() {
		
		OurIn Boaz_file = new OurIn("Solution_test1.txt_tinyEWD.txt_1458310266177_.txt");
		String TestFile = "test1.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "tinyEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();
		
		OurIn ToTest = new OurIn(AnsFile);
		
		assertEquals(ToTest.readLine(),Integer.toString(Boaz_file.readInt()));
		Boaz_file.readLine();
		
		while((ToTest.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(ToTest.readLine(),Boaz_file.readLine()); 
		}
	}

	@org.junit.Test
	public void Test_mediumEWD_test2() {

		OurIn Boaz_file = new OurIn("Solution_test2.txt_mediumEWD.txt_1458309646602_.txt");
		String TestFile = "test2.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "mediumEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();
		
		OurIn ToTest = new OurIn(AnsFile);
		assertEquals(ToTest.readLine(),Integer.toString(Boaz_file.readInt()));
		Boaz_file.readLine();

		while((ToTest.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(ToTest.readLine(),Boaz_file.readLine()); 
		}
	}
	
	@org.junit.Test
	public void Test_mediumEWD_test3() {

		OurIn Boaz_file = new OurIn("Solution_test3.txt_mediumEWD.txt_1458310286550_.txt");
		String TestFile = "test3.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "mediumEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);
		assertEquals(ToTest.readLine(),Integer.toString(Boaz_file.readInt()));
		Boaz_file.readLine();

		while((ToTest.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(ToTest.readLine(),Boaz_file.readLine()); 
		}
	}
	
	@org.junit.Test
	public void Test_largeEWD_test3() {

		OurIn Boaz_file = new OurIn("Solution_test3.txt_largeEWD.txt_1458309223268_.txt");
		String TestFile = "test3.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "largeEWD.txt";
		
		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);
		assertEquals(ToTest.readLine(),Integer.toString(Boaz_file.readInt()));
		Boaz_file.readLine();

		while((ToTest.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(ToTest.readLine(),Boaz_file.readLine()); 
		}
	}
	@org.junit.Test
	public void Test_tinyEWD2_test4() {
		
		OurIn Boaz_file = new OurIn("Solution_test4.txt_tinyEWD2.txt");
		String TestFile = "test4.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "tinyEWD2.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();
		
		OurIn ToTest = new OurIn(AnsFile);
		
		assertEquals(ToTest.readLine(),Integer.toString(Boaz_file.readInt()));
		Boaz_file.readLine();
		
		while((ToTest.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(ToTest.readLine(),Boaz_file.readLine()); 
		}
	}

}
