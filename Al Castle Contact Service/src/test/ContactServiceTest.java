package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// The Junit Class helps test the ContactService class and the methods within.
public class ContactServiceTest {

// Test the add methods.
@Test
public void testAdd(){
ContactService cs = new ContactService();
Contact t1 = new Contact("T001", "Albert", "Castle", "1234", "Paradise road");
assertEquals(true, cs.addContact(t1));
}

// Test the delete methods.
@Test
public void testDelete(){
ContactService cs = new ContactService();
Contact t1 = new Contact("T001", "Albert", "Castle", "121", "Paradise road");
Contact t2 = new Contact("T002", "Al", "Castle", "122","Paradise road");
Contact t3 = new Contact("T003", "Alex", "Castle", "123", "Paradise road");

cs.addContact(t1);
cs.addContact(t2);
cs.addContact(t3);

assertEquals(true, cs.deleteContact("T002"));
assertEquals(false, cs.deleteContact("T000"));
assertEquals(false, cs.deleteContact("T002"));

}

// Test the update methods.
@Test
public void testUpdate(){
ContactService cs = new ContactService();
Contact t1 = new Contact("T001", "Al", "Castle", "121", "Paradise road");
Contact t2 = new Contact("T002", "Alex", "Castle", "122", "Paradise road");
Contact t3 = new Contact("T003", "Alexander", "Castle", "123", "Paradise road");

cs.addContact(t1);
cs.addContact(t2);
cs.addContact(t3);

assertEquals(true, cs.updateContact("T003", "Albert", "Castle", "123", "Paradise road"));
assertEquals(false, cs.updateContact("T004", "Albert", "Castle", "123", "Paradise road"));

}

}