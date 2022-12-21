package DisadvantagesOfHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Disadvantage {
  @Test
  public void Testing() 
  {
	  String a="pune";
	  String b="pune";
	  
	  //if both are not equal and b is not null then TC should be pass
	  
	  Assert.assertNotEquals(a, b ,"a and b are equal TC is failed");
	  
	  Assert.assertNotNull(b, "b is null TC is failed");
  

  }
}
