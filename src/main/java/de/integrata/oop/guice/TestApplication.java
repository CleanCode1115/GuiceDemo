package de.integrata.oop.guice;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;


public class TestApplication {

	public static void main(String[] args) {
		
		BookService instance = Guice.createInjector(new TestModule()).getInstance(BookService.class);
		
		System.out.println(instance);
		
		
		
		
	}
	
	public static class TestModule extends AbstractModule {
		
		@Override
		protected void configure() {
			bind(DBService.class).to(MockDBService.class);
		}
	}
	
	
}
