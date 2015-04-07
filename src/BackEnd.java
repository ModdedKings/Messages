import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class BackEnd {
	
	public Map<String, List<String>> data;
	data = new TreeMap<String, List<String>>();
	
	public List<String> getMessage(String username)
	{
		return data.get(username);
		
	}
	
	public void addMessage(String username, String msg)
	{
		data.put(username, msg);
	}
	
	public List<String> getUsers()
	{
		
		return Arrays.asList(data.keySet().toArray());
		
	}

}
