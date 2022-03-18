package phoneBook;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    private Map<LocalDateTime, String> storage = new TreeMap<>();

    public void addMissedCall(String phone) {
        storage.put(LocalDateTime.now(), phone);
    }

    public void toString(PhoneBook phoneBook) {
        System.out.println("\nСписок пропущенных вызовов:\n");
        for (Map.Entry<LocalDateTime, String> mc : storage.entrySet()) {
            final Contact c = phoneBook.searchContactByNumber(mc.getValue());
            System.out.println(String.format("%s, (%s)",
                    c != null ? c.getName() : mc.getValue(),
                    mc.getKey()));
        }
    }
}