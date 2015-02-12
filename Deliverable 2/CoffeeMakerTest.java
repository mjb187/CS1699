//Code written by Mike Byrne
//	mjb187@pitt.edu

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito.*;


public class CoffeeMakerTest 
{
	@Mock
	Game mockedGame = Mockito.mock(Game.class);
	Game mockedPlayer = Mockito.mock(Player.class);
	Game mockedHouse = Mockito.mock(House.class);
	
	@Before
	public void setUp() throws Exception 
	{
		//setup code
		MockitoAnnotations.initMocks(mockedGame);
		MockitoAnnotations.initMocks(mockedPlayer);
		MockitoAnnotations.initMocks(mockedHouse);
	}
	
	/*-------------------------------------------------*/

	@After
	public void tearDown() throws Exception 
	{
		//teardown code
	}
	
	/*-------------------------------------------------*/
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
