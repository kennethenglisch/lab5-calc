

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse TestUnit.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */

public class TestUnit
{
    private CalcEngine calcEngi1;
    private HexUserInterface hexUser1;
 
    
    /**
     * Konstruktor fuer die Test-Klasse TestUnit
     */
    public TestUnit()
    { 
        calcEngi1 = new CalcEngine();
        hexUser1 = new HexUserInterface(calcEngi1);
      
    }

    /**
     *  Setzt das Testger�st fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
      
      
    }

    /**
     * Gibt das Testger�st wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestClassInitialization()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        HexUserInterface hexUserI1 = new HexUserInterface(calcEngi1);
        UserInterface userInte1 = new UserInterface(calcEngi1);
        Calculator calculat1 = new Calculator();
        
    }

    @Test
    public void TestButtonsNumbers()
    {
        Calculator calculatorTestButtons = new Calculator();
        CalcEngine calcEngi1 = new CalcEngine();
        
        
        
        calcEngi1.numberPressed(1);
        calcEngi1.numberPressed(2);
        calcEngi1.numberPressed(3);
        calcEngi1.numberPressed(4);
        calcEngi1.numberPressed(5);
        calcEngi1.numberPressed(6);
        calcEngi1.numberPressed(7);
        calcEngi1.numberPressed(8);
        calcEngi1.numberPressed(9);
        calcEngi1.numberPressed(-12);
        assertEquals(1234567878, calcEngi1.getDisplayValue());
        calcEngi1.clear();
        
    }

    @Test
    public void TestOperators()
    {
        CalcEngine calcEngi4 = new CalcEngine();
        assertEquals(0, calcEngi4.getDisplayValue());
        
        
       // ---------------TestPlus-------------------------- 
        
        calcEngi4.numberPressed(2);
        calcEngi4.plus();
        calcEngi4.numberPressed(7);
        calcEngi4.equals();
        assertEquals(9, calcEngi4.getDisplayValue());
        
        calcEngi4.clear();
        
        
        
       // ------------------TestMinus--------------------------- 
       
        calcEngi4.numberPressed(5);
        calcEngi4.minus();
        calcEngi4.numberPressed(6);
        calcEngi4.equals();
        assertEquals(-1, calcEngi4.getDisplayValue());
        
        calcEngi4.clear();
        
        
        //-------------------- Test multi---------------------
        
        calcEngi4.numberPressed(7);
        calcEngi4.multiply();
        calcEngi4.numberPressed(7);
        calcEngi4.equals();
        assertEquals(49, calcEngi4.getDisplayValue());
       calcEngi4.clear();
     
        
 
        // -------------------Test divi------------------------
        
        calcEngi4.numberPressed(7);
        calcEngi4.divide();
        calcEngi4.numberPressed(7);
        calcEngi4.equals();
        assertEquals(1, calcEngi4.getDisplayValue());
        
        
    }

    

    @Test
    public void TestCheckbox()
    {
       CalcEngine calcEngi1 = new CalcEngine();
        HexUserInterface hexUserI1 = new HexUserInterface(calcEngi1);
        
        
    }

    @Test
    public void TestCalculateValue()
    {
        CalcEngine calcEngi2 = new CalcEngine();
        HexUserInterface hexUserI1 = new HexUserInterface(calcEngi2);
        calcEngi2.numberPressed(5);
        calcEngi2.plus();
        calcEngi2.numberPressed(9);
        calcEngi2.equals();
        assertEquals(14, calcEngi2.getDisplayValue());
        calcEngi2.numberPressed(-15);
        calcEngi2.plus();
        calcEngi2.numberPressed(-10);
        calcEngi2.equals();
        assertEquals(-25, calcEngi2.getDisplayValue());
        calcEngi2.clear();
        assertEquals(0, calcEngi2.getDisplayValue());
    }

    @Test
    public void TestHexaInterface()
    {
        HexUserInterface hexUserI1 = new HexUserInterface(calcEngi1);
        hexUserI1.addHexButtons();
        Calculator calculat1 = new Calculator();
        calculat1.show();
        hexUserI1.setVisible(true);
        hexUserI1.redisplay();
        hexUserI1.makeFrame();
        calcEngi1.minus();
        calcEngi1.numberPressed(11);
    }
    

    @Test
    public void TestOthers()
    {
        CalcEngine calcEngi2 = new CalcEngine();
        HexUserInterface hexUserI1 = new HexUserInterface(calcEngi1);
        calcEngi1.clear();
        assertEquals("Java Calculator", calcEngi2.getTitle());
    }

    @Test
    public void TestConvertToHexa()
    {
       calcEngi1 = new CalcEngine();
       hexUser1 = new HexUserInterface(calcEngi1);
        

        
       hexUser1.setVisible(true);
       
        
       int test = hexUser1.calc.getDisplayValue();
    }
    
    @Test
    public void testHexButtons() 
    {
    	CalcEngine calcEngi = new CalcEngine();
    	HexUserInterface hexGui = new HexUserInterface(calcEngi);
    	
    	hexGui.setVisible(true);
    	
    	hexGui.jBox.setState(true);
    	
    	ActionEvent eventF = new ActionEvent(hexGui, 0, "F");
    	ActionEvent eventA = new ActionEvent(hexGui, 0, "A");
    	ActionEvent eventC = new ActionEvent(hexGui, 0, "C");
    	ActionEvent eventPlus = new ActionEvent(hexGui, 0, "+");
    	ActionEvent eventMinus = new ActionEvent(hexGui, 0, "-");
    	ActionEvent eventEquals = new ActionEvent(hexGui, 0, "=");
    	
    	
    	hexGui.actionPerformed(eventF);
    	hexGui.actionPerformed(eventPlus);
    	
    	assertEquals(15, calcEngi.getDisplayValue());
    	
    	hexGui.actionPerformed(eventA);
    	hexGui.actionPerformed(eventMinus);
    	
    	assertEquals(25, calcEngi.getDisplayValue());
    	
    	hexGui.actionPerformed(eventC);
    	hexGui.actionPerformed(eventEquals);
    	
    	assertEquals(13, calcEngi.getDisplayValue());
    	
    }
}









