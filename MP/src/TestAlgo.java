
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Most601
 */
public class TestAlgo {

	public static void main(String[] args) {
		String TestFile = "test1.txt";
		String AnsFile = "ans.txt";
		String GraphFile = "tinyEWD.txt";
		OurIn in = new OurIn(TestFile);
		OurIn GFile = new OurIn(GraphFile);
		Graph G = new Graph(GFile);

		int count = 0;
		
		long start = System.currentTimeMillis();

		try {
		
			PrintWriter outStream = new PrintWriter(AnsFile);
			
			int NumOfQueriesin = Integer.parseInt(in.readLine());
			outStream.println(NumOfQueriesin);
			while((in.hasNextLine()) && (count < NumOfQueriesin)){
				int From = in.readInt();
				int To = in.readInt();
				int NumOfBP = in.readInt();
				outStream.print(From+" "+To+" "+NumOfBP+" ");

				int ArrayOfBP[] = new int[NumOfBP];
				for(int i = 0; i < NumOfBP; i++ ){
					ArrayOfBP[i] = in.readInt();
					outStream.print(ArrayOfBP[i]+" ");
				}
				G.BLIn(ArrayOfBP , NumOfBP);
				Graph_algo sp1 = new Graph_algo(G, From);

				if (sp1.hasPathTo(To) && sp1.distTo(To) < 100 ) {
					outStream.print(sp1.distTo(To));
				}
				else {
					outStream.print("inf");
				}
				outStream.print("\n");
				G.BLOut();
				count++;
			}
			

			outStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


        long end = System.currentTimeMillis();
        System.out.println("Selection Sort time = " + (end-start)/1000. + " seconds");
	}
}
