import java.util.List;

public class GameModel {
	
	 List<Level> getLevels(MobilityDevice md) {
		 return md.getLevels();
	}
	
	
	EnvironmentCollection getEnvironmentCollection(int l) {

		MobilityDevice md = new MobilityDevice();
		List<Level> levelList;
		levelList = md.getLevels();
		for(int i=0; i<levelList.size(); i++) {
			if(levelList.get(i).equals(l)) {
				EnvironmentCollection ec = new EnvironmentCollection();
				return ec;
			}
		}
		return null;
	}
	
	
	Quiz getQuiz(Level l) {
		if(l.isQuizLevel() == true) {
			Quiz newQuiz = new Quiz();
			return newQuiz;
		}
		return null;
	}
	
	
}


