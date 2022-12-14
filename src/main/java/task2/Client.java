package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
public class Client {
    private static int count = 0;
    private int id;
    private String name;
    private int age;
    private Gender sex;

    public Client(String name, int age, Gender sex) {
        id = count++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
