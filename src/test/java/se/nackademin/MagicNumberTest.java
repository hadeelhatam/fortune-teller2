package se.nackademin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class MagicNumberTest {
    MagicNumbers magicNumbers;

    @Before
    public void setUp() {
        magicNumbers = new MagicNumbers();
        magicNumbers.setAge(16);
        magicNumbers.setHeight(165);
        magicNumbers.setIncome(11000);
        magicNumbers.setLocation("Hagfors");
        magicNumbers.setName("Sture Hagfors");
    }

    @Test
    public void testA() {
        assertEquals("A is not calculated correctly", 4, magicNumbers.calculateA());
    }

    @Test
    public void testB() {
        assertEquals("B is not calculated correctly", 3, magicNumbers.calculateB());
    }

    @Test
    public void testC() {
        assertEquals("C is not calculated correctly", 2, magicNumbers.calculateC());
    }

    @Test
    public void testD() {
        assertEquals("D is not calculated correctly", 6, magicNumbers.calculateD());
    }

    @Test
    public void testDWithAGreaterThan5() {
        magicNumbers.setAge(18);
        assertEquals("D is not calculated correctly", 9, magicNumbers.calculateD());
    }

    @Test
    public void testE() {
        assertEquals("E is not calculated correctly", 9, magicNumbers.calculateE());
    }

    @Test
    public void testADependsOnName() {
        int first = magicNumbers.calculateA();
        magicNumbers.setName("Sture i Hagfors");
        int second = magicNumbers.calculateA();
        assertNotEquals("A should provide different values for different names", first, second);
    }

    @Test
    public void testADependsOnAge() {
        int first = magicNumbers.calculateA();
        magicNumbers.setAge(18);
        int second = magicNumbers.calculateA();
        assertNotEquals("A should provide different values for different ages", first, second);
    }

    @Test
    public void testBDependsOnLocation() {
        int first = magicNumbers.calculateB();
        magicNumbers.setLocation("Grytevik");
        int second = magicNumbers.calculateB();
        assertNotEquals("B should provide different values for different locations", first, second);
    }

    @Test
    public void testBDependsOnIncome() {
        int first = magicNumbers.calculateB();
        magicNumbers.setIncome(219487);
        int second = magicNumbers.calculateB();
        assertNotEquals("B should provide different values for different income values", first, second);
    }

    @Test
    public void testCDependsOnHeight() {
        int first = magicNumbers.calculateC();
        magicNumbers.setHeight(126);
        int second = magicNumbers.calculateC();
        assertNotEquals("C should provide different values for different heights", first, second);
    }

    @Test
    public void testCDependsOnAge() {
        int first = magicNumbers.calculateC();
        magicNumbers.setAge(126);
        int second = magicNumbers.calculateC();
        assertNotEquals("C should provide different values for different ages", first, second);
    }

    @Test
    public void testCDependsOnName() {
        int first = magicNumbers.calculateC();
        magicNumbers.setName("Sture i Hagfors");
        int second = magicNumbers.calculateC();
        assertNotEquals("C should provide different values for different names", first, second);
    }
    
    //Test case för issue 37
   @Test
   public void testIssue37(){
      magicNumbers.setName("Svante");
      magicNumbers.setIncome(-10000);
      magicNumbers.setLocation("Malmö");
      magicNumbers.setAge(27);
      magicNumbers.setHeight(0);
      assertTrue("A is less than 10", magicNumbers.calculateA()<10);
      assertTrue("A is not negative", magicNumbers.calculateA()>=0);
      assertTrue("B is less than 10", magicNumbers.calculateB()<10);
      assertTrue("B is not negative", magicNumbers.calculateB()>=10);
      assertTrue("C is less than 10", magicNumbers.calculateC()<10);
      assertTrue("C is not negative", magicNumbers.calculateC()>=10);
      assertTrue("D is less than 10", magicNumbers.calculateD()<10);
      assertTrue("D is not negative", magicNumbers.calculateD()>=10);
      assertTrue("E is less than 10", magicNumbers.calculateE()<10);
      assertTrue("E is not negative", magicNumbers.calculateE()>=10);
               
   }
   
    //Test case för issue 38
   @Test
   public void testIssue38(){
      magicNumbers.setName("Svante");
      magicNumbers.setIncome(10000);
      magicNumbers.setLocation("Malmö");
      magicNumbers.setAge(27);
      magicNumbers.setHeight(0);
      assertTrue("A is less than 10", magicNumbers.calculateA()<10);
      assertTrue("A is not negative", magicNumbers.calculateA()>=0);
      assertTrue("B is less than 10", magicNumbers.calculateB()<10);
      assertTrue("B is not negative", magicNumbers.calculateB()>=10);
      assertTrue("C is less than 10", magicNumbers.calculateC()<10);
      assertTrue("C is not negative", magicNumbers.calculateC()>=10);
      assertTrue("D is less than 10", magicNumbers.calculateD()<10);
      assertTrue("D is not negative", magicNumbers.calculateD()>=10);
      assertTrue("E is less than 10", magicNumbers.calculateE()<10);
      assertTrue("E is not negative", magicNumbers.calculateE()>=10);
               
   }
    //Test case för issue 39
   @Test
   public void testIssue39(){
      magicNumbers.setName("Svante");
      magicNumbers.setIncome(10000);
      magicNumbers.setLocation("Malmö");
      magicNumbers.setAge(-5);
      magicNumbers.setHeight(165);
      assertTrue("A is less than 10", magicNumbers.calculateA()<10);
      assertTrue("A is not negative", magicNumbers.calculateA()>=0);
      assertTrue("B is less than 10", magicNumbers.calculateB()<10);
      assertTrue("B is not negative", magicNumbers.calculateB()>=10);
      assertTrue("C is less than 10", magicNumbers.calculateC()<10);
      assertTrue("C is not negative", magicNumbers.calculateC()>=10);
      assertTrue("D is less than 10", magicNumbers.calculateD()<10);
      assertTrue("D is not negative", magicNumbers.calculateD()>=10);
      assertTrue("E is less than 10", magicNumbers.calculateE()<10);
      assertTrue("E is not negative", magicNumbers.calculateE()>=10);
               
   }
    //Test case för issue 40
   @Test
   public void testIssue40(){
      magicNumbers.setName("Svante");
      magicNumbers.setIncome(10000);
      magicNumbers.setLocation("Malmö");
      magicNumbers.setAge(27);
      magicNumbers.setHeight(-20);
      assertTrue("A is less than 10", magicNumbers.calculateA()<10);
      assertTrue("A is not negative", magicNumbers.calculateA()>=0);
      assertTrue("B is less than 10", magicNumbers.calculateB()<10);
      assertTrue("B is not negative", magicNumbers.calculateB()>=10);
      assertTrue("C is less than 10", magicNumbers.calculateC()<10);
      assertTrue("C is not negative", magicNumbers.calculateC()>=10);
      assertTrue("D is less than 10", magicNumbers.calculateD()<10);
      assertTrue("D is not negative", magicNumbers.calculateD()>=10);
      assertTrue("E is less than 10", magicNumbers.calculateE()<10);
      assertTrue("E is not negative", magicNumbers.calculateE()>=10);
               
   }
    //Test case för issue 41
   @Test
   public void testIssue41(){
      magicNumbers.setName("Svante");
      magicNumbers.setIncome(0);
      magicNumbers.setLocation("Malmö");
      magicNumbers.setAge(27);
      magicNumbers.setHeight(165);
      assertTrue("A is less than 10", magicNumbers.calculateA()<10);
      assertTrue("A is not negative", magicNumbers.calculateA()>=0);
      assertTrue("B is less than 10", magicNumbers.calculateB()<10);
      assertTrue("B is not negative", magicNumbers.calculateB()>=10);
      assertTrue("C is less than 10", magicNumbers.calculateC()<10);
      assertTrue("C is not negative", magicNumbers.calculateC()>=10);
      assertTrue("D is less than 10", magicNumbers.calculateD()<10);
      assertTrue("D is not negative", magicNumbers.calculateD()>=10);
      assertTrue("E is less than 10", magicNumbers.calculateE()<10);
      assertTrue("E is not negative", magicNumbers.calculateE()>=10);
               
   }
    
}


