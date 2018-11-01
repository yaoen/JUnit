import java.util.List;

public class MobilityDevice {

	public List<Level> getLevels(){
		List<Level> levelList = null;
		Level lvl = new Level();
		levelList.add(0,lvl);
		return levelList;
	}
	
}
