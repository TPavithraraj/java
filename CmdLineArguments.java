import java.io.*;
import java.util.*;
public class CmdLineArguments {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=x+y;
        System.out.println("Sum of "+ x +"and" + y +"is" +z);
    }
}
    
