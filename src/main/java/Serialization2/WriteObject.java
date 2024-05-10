package Serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {
                new Person(1, "Bob"),
                new Person(2, "Mike"),
                new Person(3, "Tom") };
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}