/******************************************************************************
 *  Compilation:  javac In.java
 *  Execution:    java In   (basic test --- see source for required files)
 *  Dependencies: none
 *
 *  Reads in data of various types from standard input, files, and URLs.
 *
 ******************************************************************************/

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *  <i>Input</i>. This class provides methods for reading strings
 *  and numbers from standard input, file input, URLs, and sockets. 
 *  <p>
 *  The Locale used is: language = English, country = US. This is consistent
 *  with the formatting conventions with Java floating-point literals,
 *  command-line arguments (via {@link Double#parseDouble(String)})
 *  and standard output. 
 *  <p>
 *  For additional documentation, see 
 *  <a href="http://introcs.cs.princeton.edu/31datatype">Section 3.1</a> of
 *  <i>Introduction to Programming in Java: An Interdisciplinary Approach</i> 
 *  by Robert Sedgewick and Kevin Wayne.
 *  <p>
 *  Like {@link Scanner}, reading a token also consumes preceding Java
 *  whitespace, reading a full line consumes
 *  the following end-of-line delimeter, while reading a character consumes
 *  nothing extra. 
 *  <p>
 *  Whitespace is defined in {@link Character#isWhitespace(char)}. Newlines
 *  consist of \n, \r, \r\n, and Unicode hex code points 0x2028, 0x2029, 0x0085;
 *  see <tt><a href="http://www.docjar.com/html/api/java/util/Scanner.java.html">
 *  Scanner.java</a></tt> (NB: Java 6u23 and earlier uses only \r, \r, \r\n).
 *
 *  @author David Pritchard
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 *  
 *  
 *We deleted the function that we don't need.
 *  
 */
public final class OurIn {
    
    private Scanner scanner;

   /**
     * Initializes an input stream from a filename.
     *
     * @param  name the filename.
     * @throws IllegalArgumentException if cannot open {@code name} as
     *         a file.
     * @throws NullPointerException if {@code name} is {@code null}
     */
    public OurIn(String name) {
        if (name == null) throw new NullPointerException("argument is null");
        try {
            // first try to read file from local file system
            File file = new File(name);
            scanner = new Scanner(file);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException(ioe.getMessage());
        }
    }

   /**
     * Reads the next token from this input stream, parses it as a <tt>int</tt>,
     * and returns the <tt>int</tt>.
     *
     * @return the next <tt>int</tt> in this input stream
     */
    public int readInt() {
        return scanner.nextInt();
    }

   /**
     * Reads the next token from this input stream, parses it as a <tt>double</tt>,
     * and returns the <tt>double</tt>.
     *
     * @return the next <tt>double</tt> in this input stream
     */
    public double readDouble() {
        return scanner.nextDouble();
    }

    /** 
     * Returns true if this input stream has a next line.
     * Use this method to know whether the
     * next call to {@link #readLine()} will succeed.
     * This method is functionally equivalent to {@link #hasNextChar()}.
     *
     * @return <tt>true</tt> if this input stream is empty;
     *         <tt>false</tt> otherwise
     */
    public boolean hasNextLine() {
        return scanner.hasNextLine();
    }
    /**
     * Reads and returns the next line in this input stream.
     *
     * @return the next line in this input stream; <tt>null</tt> if no such line
     */
    public String readLine() {
        String line;
        try {
            line = scanner.nextLine();
        }
        catch (NoSuchElementException e) {
            line = null;
        }
        return line;
    }
}