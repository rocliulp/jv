package startup;

import java.util.*;

public class PublicClass implements IClassInterface {
  public PublicClass () {
  }

  /* @{ IClassInterface */
  public int printInterfaceName () {
    System.out.println ("IClassInterface");
    return 0;
  }

  public int printClassName () {
    System.out.println ("PublicClass");
    return 0;
  }
  /* @}*/
}
