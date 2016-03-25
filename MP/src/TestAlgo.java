/**
 * The TestAlgo class represents a test for the shortest path from begin vertex to end vertex
 * by using the Dijkstra algorithm.
 * the steps of the test:
 * 1.uploading a graph from file(text).
 * 2.open the test file(text) with paths to test.
 * 3.run the algorithm on each path.
 * 5.print the answers to answer file(text).
 * 
 * @author mariavinogradov
 *
 */
public class TestAlgo {

	private int vertexFrom;//begin vertex
	private int vertexTo;//end vertex
	private int NumOftests;//number of tests in the file.
	private int NumOfBP;//number of black point
	private int[] ArrayOfBP;//Array with black points.

	private Graph G;
	private OurIn GFile;
	private OurOut outStream;
	public  OurIn in;
	private Graph_algo New_G_algo;

	//****RunTime*****
	private long start;
	private long end;

	//***Getters and Setters****

	public int getVertexFrom() {
		return vertexFrom;
	}
	public int getVertexTo() {
		return vertexTo;
	}
	public int getNumOfBP() {
		return NumOfBP;
	}
	public void setVertexFrom(int vertexFrom) {
		this.vertexFrom = vertexFrom;
	}
	public void setVertexTo(int vertexTo) {
		this.vertexTo = vertexTo;
	}
	public void setNumOfBP(int numOfBP) {
		NumOfBP = numOfBP;
	}
	public int getNumOftests() {
		return NumOftests;
	}
	public void setNumOftests(int NumOftests) {
		this.NumOftests = NumOftests;
	}
	public int[] getArrayOfBP() {
		return ArrayOfBP;
	}

	/**
	 * Constructor.
	 * @param TestFile - file to test.
	 * @param GraphFile - from this file we upload the graph.
	 * @param AnsFile - to this file we print the answer.
	 */
	public TestAlgo(String TestFile ,String GraphFile, String AnsFile){

		this.in = new OurIn(TestFile);
		this.GFile = new OurIn(GraphFile);
		this.G = new Graph(GFile);
		this.outStream = new OurOut(AnsFile);
	}

	/**
	 * This function is reading from the TestFile file , running the Dijkstra algorithm
	 * and printing to the AnsFile file.
	 */
	public void RunFile(){
		this.setNumOftests(Integer.parseInt(in.readLine()));
		this.outStream.println(this.getNumOftests());

		while(in.hasNextLine()){
			this.setVertexFrom(in.readInt());
			this.setVertexTo(in.readInt());
			this.setNumOfBP(in.readInt());

			this.PrintToFile();
			this.start = System.currentTimeMillis();
			this.Test_Algo();

		}
		this.end = System.currentTimeMillis();
		System.out.println("Selection Sort time = " + (this.end-this.start)/1000. + " seconds");
		this.outStream.close();
	}

	/**
	 * This function running the Dijkstra algorithm.
	 */
	private void Test_Algo(){

		this.G.BLIn(this.getArrayOfBP() , this.getNumOfBP());
		this.New_G_algo = new Graph_algo(G, this.getVertexFrom());
		this.PrintAnsToFile();
		this.G.BLOut();
	}
	/**
	 * This function printing to the AnsFile file.
	 */
	private void PrintToFile(){

		this.outStream.print(this.getVertexFrom()+" "+this.getVertexTo()+" "+this.getNumOfBP()+" ");
		this.ArrayOfBP = new int[this.getNumOfBP()];
		for(int i = 0; i < this.getNumOfBP(); i++ ){
			this.ArrayOfBP[i] = in.readInt();
			this.outStream.print(this.ArrayOfBP[i]+" ");
		}
	}
	/**
	 * This function printing the final answer to the AnsFile file.
	 */
	private void PrintAnsToFile(){

		if (this.New_G_algo.hasPathTo(this.getVertexTo()) && this.New_G_algo.distTo(this.getVertexTo()) < 100 ) {
			outStream.print(this.New_G_algo.distTo(this.getVertexTo()));
		}
		else {
			outStream.print("inf");
		}
		outStream.print("\n");
	}
}
