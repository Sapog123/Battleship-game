package db;

import java.util.ArrayList;
import java.util.HashMap;

public class testDataBase implements IDataBase {
	

	HashMap<Integer,Object> db = new HashMap<Integer,Object>();

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initDatabase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getData(int userId) {
		return db.get(userId);
	}

	@Override
	public void setDataItem(int userId, Object object, int hour) {
		db.put(userId,object);
		
	}

	@Override
	public boolean checkIdIsActive(int idUser) {
		return db.containsKey(idUser);
	}

	@Override
	public void removeUserData(int userId) {
		db.remove(userId);
	}

	@Override
	public ArrayList<Integer> getIdWithTime(int time) {
		// TODO Auto-generated method stub
		return null;
	}


}
