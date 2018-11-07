package org.Centrale;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	@Mocked ReservEnergie mockedReservEnergie;
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    @Test
    public void ConsommerTropEnergie_methodMustFail()
    {	
    	ReservEnergie reservEnergie = new ReservEnergie();
    	boolean testConso = true;
    	testConso = reservEnergie.consommer(150);
        assertFalse(testConso);
    }
    
    public void ConsommerTropViaCentrale_methodMustFailt(){
    	Centrale centrale = new Centrale(1);
    	NonStrictExpectations() {{
    		mockedReservEnergie.consommer(150);
    		result = false;
    	}};
    	boolean testConsoViaCentrale = true;
    	testConsoViaCentrale = centrale.consommerEnergie(150);
    	AssertFalse(testConsoViaCentrale)
    }
}
