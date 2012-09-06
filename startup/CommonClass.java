package startup;

import java.util.*;

public class CommonClass extends PublicClass {
  public CommonClass () {
  }
  
  @Override
  public int printInterfaceName () {
    System.out.println ("CommonClass IClassInterface");
    return 0;
  }

  @Override
  public int printClassName () {
    System.out.println ("CommonClass");
    return 0;
  }
}
