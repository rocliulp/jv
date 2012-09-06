package startup;

import java.util.*;

public class startup {
  public static void main (String [] argv) {
    System.out.println ("Hello, startup!");

    PublicClass pc = new PublicClass ();
    pc.printInterfaceName ();
    pc.printClassName ();

    CommonClass cc = new CommonClass ();
    cc.printInterfaceName ();
    cc.printClassName ();
  }
}
