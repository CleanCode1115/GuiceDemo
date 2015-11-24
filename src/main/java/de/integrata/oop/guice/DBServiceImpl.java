package de.integrata.oop.guice;
import javax.inject.Inject;


public class DBServiceImpl implements DBService {

	@Inject
	private IDGenerator idGen;

	@Override
	public String toString() {
		return "DBServiceImpl [idGen=" + idGen + "]";
	}
	
	
	
}
