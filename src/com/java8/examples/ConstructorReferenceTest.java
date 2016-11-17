package com.java8.examples;

/**
 * Java 8 enables you to pass references of methods or constructors via the :: keyword. 
 * @author Ram
 *
 */
public class ConstructorReferenceTest {

	public static void main(String[] args) {
	
		//We create a reference to the Person constructor via Person::new
		
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Ram", "Vankaneni");
		
		System.out.println(person);
		
		Converter<String, String> converter = person::startsWithWhatLetter;
		
		String converted = converter.convert("Java8");
		System.out.println("Starts with = "+converted); 
	}
}

class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
    
	public String startsWithWhatLetter(String s) {
        return String.valueOf(s.charAt(0));
    }
    
}
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}