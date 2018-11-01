import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class GameModelTest {

	@Test
	void test1() {
		MobilityDevice md = new MobilityDevice();
		GameModel gm = new GameModel();
		assert(gm.getLevels(md).isEmpty()==false);
	}

	@Test
	void test2() {
		MobilityDevice md = new MobilityDevice();
		GameModel gm = new GameModel();
		Level newLevel = new Level();
		assert(gm.getQuiz(newLevel)!=null);
	}
	

}
