import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class GameModelTest {

	@Test
	void getLevelsTest() {
		MobilityDevice md = new MobilityDevice();
		GameModel gm = new GameModel();
		assert(gm.getLevels(md)!=null);
		assertTrue(gm.getLevels(md) instanceof List);
		
	}

	@Test
	void getEnvironmentCollectionTest() {
		GameModel gm = new GameModel();
		gm.getEnvironmentCollection(1);
		assert(gm.getEnvironmentCollection(1)!=null);
		assertTrue(gm.getEnvironmentCollection(1) instanceof EnvironmentCollection);
	}
	
	@Test
	void getQuizTest() {
		GameModel gm = new GameModel();
		Level newLevel = new Level();
		assert(gm.getQuiz(newLevel)!=null);
		assertTrue(gm.getQuiz(newLevel) instanceof Quiz);
	}
	

}
