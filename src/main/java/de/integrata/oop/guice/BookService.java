package de.integrata.oop.guice;
import javax.inject.Inject;


public class BookService {

	private DBService dbService;
	
	@Inject
	public BookService(DBService dbService) {
		super();
		this.dbService = dbService;
	}

	@Override
	public String toString() {
		return "BookService [dbService=" + dbService + "]";
	}
	
	
	
	
	
	
}
