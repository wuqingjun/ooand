package model;

import java.util.List;

public interface IContactDAO {
	
	void save(Contact contact);
	
	List<Contact> list(); 
	
	List<Contact> list(int groupId);
	
}