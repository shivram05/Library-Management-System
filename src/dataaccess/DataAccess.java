package src.dataaccess;

import src.business.Book;
import src.business.LibraryMember;

import java.util.HashMap;



public interface DataAccess { 
	public HashMap<String, Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
	public void saveNewMember(LibraryMember member); 
}
