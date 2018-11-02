import java.util.ArrayList;
import java.util.List;

public class MobilityDevice {

	public List<Level> getLevels(){
		List<Level> levelList = new ArrayList<Level>();
		Level lvl = new Level();
		levelList.add(0,lvl);
		
		return levelList;
	}
	
}
