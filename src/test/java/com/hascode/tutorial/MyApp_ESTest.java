/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 22 18:50:07 GMT 2016
 */

package com.hascode.tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hascode.tutorial.MyApp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MyApp_ESTest extends MyApp_ESTest_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      MyApp myApp0 = new MyApp();
      String string0 = myApp0.getId((Long) (-1628L), "-1628--ID--(-)");
      assertEquals("-1628--ID--(-1628--ID--(-))", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      MyApp myApp0 = new MyApp();
      // Undeclared exception!
      try { 
        myApp0.getId((Long) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // id must not be null
         //
         assertThrownBy("com.hascode.tutorial.MyApp", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MyApp myApp0 = new MyApp();
      Long long0 = new Long((-1628L));
      String string0 = myApp0.getId(long0, (String) null);
      assertEquals("-1628--ID--(-)", string0);
  }
}
