import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void Test_tinyEWD_test1() {
		
		OurIn Boaz_file = new OurIn("Solution_test1.txt_tinyEWD.txt_1458310266177_.txt");
		String TestFile = "test1.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "tinyEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		while((new_test.in.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(new_test.in.readLine(),Boaz_file.readLine()); 
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

		while((new_test.in.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(new_test.in.readLine(),Boaz_file.readLine()); 
		}
	}
	
	@org.junit.Test
<<<<<<< HEAD
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
			
=======
	public void Test_mediumEWD_test3() {

		OurIn Boaz_file = new OurIn("Solution_test3.txt_mediumEWD.txt_1458310286550_.txt");
		String TestFile = "test3.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "mediumEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		while((new_test.in.hasNextLine()) && (Boaz_file.hasNextLine())){
			assertEquals(new_test.in.readLine(),Boaz_file.readLine()); 
>>>>>>> branch 'master' of https://github.com/MariaVinog/FirstExercise.git
		}
	}
	
	@org.junit.Test
	public void Test_largeEWD_test3() {

//		OurIn Boaz_file = new OurIn("Solution_test3.txt_largeEWD.txt_1458309223268_.txt");
//		String TestFile = "test3.txt";
//		String AnsFile = "ans.txt";
//		String GraphFile = "largeEWD.txt";
//
//		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
//		new_test.RunFile();
//
//		while((new_test.in.hasNextLine()) && (Boaz_file.hasNextLine())){
//			assertEquals(new_test.in.readLine(),Boaz_file.readLine()); 
//		}
	}

}
