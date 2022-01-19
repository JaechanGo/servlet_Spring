package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private Long id;
    private String name;
    private int age;

    public Member() {
    }

    public Member( Long id,String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
