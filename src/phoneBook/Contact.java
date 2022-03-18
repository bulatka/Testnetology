package phoneBook;

import java.util.Objects;

public class Contact {
    private String name;
    private final String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }

    @Override
    public String toString() {
        return name + " (" + phone + ")";
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}