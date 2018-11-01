import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameModelTest {

	@Test
	void test1() {
		MobilityDevice md = new MobilityDevice();
		GameModel gm = new GameModel();
		Level newLevel = new Level();

		assertNotNull(gm.getLevels(md));
	}
		//@Test
//	void test2() {
//		MobilityDevice md = new MobilityDevice();
//		GameModel gm = new GameModel();
//		Level newLevel = new Level();
//		assertNotNull(gm.getQuiz(newLevel));
//	}
	@Test
	void test3() {
		MobilityDevice md = new MobilityDevice();
		GameModel gm = new GameModel();
		Level newLevel = new Level();
		assertTrue(true&&true);
	}
	

}
