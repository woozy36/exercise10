public class Main {
    public static void main(String[] args) {
        ContactInfo aNewStudent1 = new ContactInfo("Brett",123887);
        ContactInfo aNewStudent2 = new ContactInfo("Miguel",123456);
        ContactInfo aNewStudent3 = new ContactInfo("Joseph",838451);
        ContactInfo aNewStudent4 = new ContactInfo("AndrewSemchicken",112340);
        ContactInfo aNewStudent5 = new ContactInfo("Amal",101100);
        ContactInfo aNewStudent6 = new ContactInfo("Ayub",999990);

        Storage alc = new Storage();
        alc.addStudent(aNewStudent1);
        alc.addStudent(aNewStudent2);
        alc.addStudent(aNewStudent3);
        alc.addStudent(aNewStudent4);

        Storage halleck = new Storage();
        halleck.addStudent(aNewStudent5);
        halleck.addStudent(aNewStudent6);

        for(ContactInfo a :alc){
            System.out.println(a);
        }

    }
}