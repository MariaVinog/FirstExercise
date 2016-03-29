import static org.junit.Assert.*;

import java.util.Iterator;

/**
 * Class that performs tests.
 * 
 * @author Most601 mariavinogradov aviv
 */
public class Test {

	@org.junit.Test
	//Testing function we added.
	public void BLIn() {

		OurIn file = new OurIn("tinyEWD.txt");
		Graph G = new Graph(file);
		int NumOfBP = 2 ;
		int []BL = new int[NumOfBP];

		BL[0] = 2 ;
		BL[1] = 7 ;
		G.BLIn(BL, NumOfBP);
		for (int i = 0; i < BL.length; i++) {
			Iterator<DirectedEdge> It = G.adj(BL[i]).iterator();
			while(It.hasNext()){
				DirectedEdge e = It.next();
				assertTrue(e.weight() == Double.MAX_VALUE);
			}
		}
	}
	//Testing function we added.
	@org.junit.Test
	public void BLOut() {

		OurIn file = new OurIn("tinyEWD.txt");
		Graph G = new Graph(file);
		int NumOfBP = 2 ;
		int []BL = new int[NumOfBP];

		BL[0] = 2 ;
		BL[1] = 7 ;
		G.BLIn(BL, NumOfBP);

		G.BLOut();
		for (int i = 0; i < BL.length; i++) {
			Iterator<DirectedEdge> It = G.adj(BL[i]).iterator();
			while(It.hasNext()){
				DirectedEdge e = It.next();
				assertTrue(e.weight() != Double.MAX_VALUE);
			}
		}
	}
	
	@org.junit.Test
	//Test of tinyEWD with test1.
	public void Test_tinyEWD_test1() {

		OurIn Solution_file = new OurIn("Solution_test1.txt_tinyEWD.txt_1458310266177_.txt");
		String TestFile = "test1.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "tinyEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);
		
		assertTrue(CompareFiles(ToTest , Solution_file));
	}

	@org.junit.Test
	//Test of mediumEWD with test2.
	public void Test_mediumEWD_test2() {

		OurIn Solution_file = new OurIn("Solution_test2.txt_mediumEWD.txt_1458309646602_.txt");
		String TestFile = "test2.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "mediumEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);
		
		assertTrue(CompareFiles(ToTest , Solution_file));
	}

	@org.junit.Test
	//Test of mediumEWD with test3.
	public void Test_mediumEWD_test3() {

		OurIn Solution_file = new OurIn("Solution_test3.txt_mediumEWD.txt_1458310286550_.txt");
		String TestFile = "test3.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "mediumEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);

		assertTrue(CompareFiles(ToTest , Solution_file));
	}

	@org.junit.Test
	//Test of largeEWD with test3.
	public void Test_largeEWD_test3() {

		OurIn Solution_file = new OurIn("Solution_test3.txt_largeEWD.txt_1458309223268_.txt");
		String TestFile = "test3.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "largeEWD.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);
		
		assertTrue(CompareFiles(ToTest , Solution_file));
	}
	
	@org.junit.Test
	//Test of tinyEWD2 with test4.
	public void Test_tinyEWD2_test4() {

		OurIn Solution_file = new OurIn("Solution_test4.txt_tinyEWD2.txt");
		String TestFile = "test4.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "tinyEWD2.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);

		assertTrue(CompareFiles(ToTest , Solution_file));
	}
	
	@org.junit.Test
	//Test of tinyEWD2 with test4.
	public void Test_tinyEWD3_test5() {

		OurIn Solution_file = new OurIn("Solution_test5.txt_tinyEWD3.txt");
		String TestFile = "test5.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "tinyEWD3.txt";

		TestAlgo new_test = new TestAlgo(TestFile,GraphFile,AnsFile);
		new_test.RunFile();

		OurIn ToTest = new OurIn(AnsFile);

		assertTrue(CompareFiles(ToTest , Solution_file));
	}

	/**
	 * Function that compares two files.
	 * @param First - first file.
	 * @param Second - second file.
	 * @return - true if they are equal,
	 * otherwise return false.
	 */
	public static boolean CompareFiles(OurIn First , OurIn Second){
		
		if(First.readLine().compareTo(Integer.toString(Second.readInt())) != 0){
			return false;
		}
		
		Second.readLine(); // read "regenerated by a simple SE1_EX1 solution".

		while((First.hasNextLine()) && (Second.hasNextLine())){
			if(First.readLine().compareTo(Second.readLine()) != 0){
				return false;
			}
		}
		return true;
	}
}