import phoneBook.*;

public class Main {
    public static void main(String[] args) throws Exception {
        PhoneBook pb = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        pb.addContact(new Contact("Булат", "+79179000111"));
        pb.addContact(new Contact("Артур", "+79179000222"));
        pb.addContact(new Contact("Ксения", "+79179000333"));
        pb.addContact(new Contact("Азат", "+79179000444"));
        pb.addContact(new Contact("Мама", "+79179000555"));
        pb.addContact(new Contact("Папа", "+79179000666"));

        fillMissedCalls(missedCalls);
        missedCalls.toString(pb);
    }

    public static void fillMissedCalls(MissedCalls missedCalls) throws Exception {
        for (int i = 0; i < 10; i++) {
            missedCalls.addMissedCall("+79179000" + i + i + i);
            Thread.sleep(100);
        }
    }
}