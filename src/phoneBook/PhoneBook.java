package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, Contact> phoneBook = new HashMap<>();

    public boolean addContact(Contact contact) {
        phoneBook.put(contact.getPhone(), contact);
        return true;
    }

    public Contact searchContactByNumber(String phone) {
        return phoneBook.get(phone);
    }
}