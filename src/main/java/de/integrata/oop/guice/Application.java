package de.integrata.oop.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class Application {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new AppModule());
		
		BookService instance = injector.getInstance(BookService.class);
		
		System.out.println(instance);
	}
	
	public static class AppModule extends AbstractModule {
		
		@Override
		protected void configure() {
			bind(DBService.class).to(DBServiceImpl.class);
			bind(IDGenerator.class).to(IdGenImpl.class);
		}
	}
}
