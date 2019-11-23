/**
 * The main class of a simple calculator. Create one of these and you'll
 * get the calculator on screen.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class Calculator
{
    private CalcEngine engine;
    private HexUserInterface hexGui;

    /**
     * Create a new calculator and show it.
     */
    public Calculator()
    {
        engine = new CalcEngine();
        hexGui = new HexUserInterface(engine);
    }
    
    public static void main (String args[]) 
    {
    	new Calculator();
    }

    /**
     * In case the window was closed, show it again.
     */
    public void show()
    {
        hexGui.setVisible(true);
    }
}
