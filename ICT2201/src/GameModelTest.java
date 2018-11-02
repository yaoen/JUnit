import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class GameModelTest {

	@Test
	void test1() {
		MobilityDevice md = new MobilityDevice();
		assert(md.getLevels().isEmpty()==false);
	}

	
	@Test
	void test2() {
		
	}
	
	@Test
	void test3() {
		GameModel gm = new GameModel();
		Level newLevel = new Level();
		assert(gm.getQuiz(newLevel)!=null);
	}
	

}
