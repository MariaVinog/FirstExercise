/******************************************************************************
 *  Compilation:  javac Out.java
 *  Execution:    java Out
 *  Dependencies: none
 *
 *  Writes data of various types to: stdout, file, or socket.
 *
 ******************************************************************************/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *  This class provides methods for writing strings and numbers to
 *  various output streams, including standard output, file, and sockets.
 *  <p>
 *  For additional documentation, see
 *  <a href="http://introcs.cs.princeton.edu/31datatype">Section 3.1</a> of
 *  <i>Introduction to Programming in Java: An Interdisciplinary Approach</i>
 *  by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 *  
 * We deleted the function that we don't need.
 *  
 */
public class OurOut {

	private PrintWriter out;

	/**
	 * Initializes an output stream from a file.
	 *
	 * @param  filename the name of the file
	 */
	public OurOut(String filename) {
		try {
			OutputStream os = new FileOutputStream(filename);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			out = new PrintWriter(osw, true);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Closes the output stream.
	 */
	public void close() {
		out.close();
	}
	/**
	 * Prints an object to this output stream and then terminates the line.
	 *
	 * @param x the object to print
	 */
	public void println(Object x) {
		out.println(x);
	}
	/**
	 * Prints an object to this output stream and flushes this output stream.
	 * 
	 * @param x the object to print
	 */
	public void print(Object x) {
		out.print(x);
		out.flush();
	}
}
/******************************************************************************
 *  Copyright 2002-2015, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/
