/*
TASK: template
LANG: JAVA
ID: maheshm2
 */
import java.io.*;

public class template {
    static StreamTokenizer input;
    public static void main(String[] args) throws java.io.IOException {
                input =new StreamTokenizer(new BufferedReader(new FileReader("template.in")));
//        input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    }
    static int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }
}

