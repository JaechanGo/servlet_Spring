package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {



    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }
    @Test
    void save(){
        Member member = new Member("kim",20);
        Member savedMember = memberRepository.save(member);
        Member findMember = memberRepository.findId(savedMember.getId());

        Assertions.assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findAll(){
        Member member = new Member("kim",20);
        Member member1 = new Member("Han",24);

        Member savedMember = memberRepository.save(member);
        Member savedMember2 = memberRepository.save(member1);

        List<Member> memberList = memberRepository.findAll();

        Assertions.assertThat(memberList.size()).isEqualTo(2);
        Assertions.assertThat(memberList).contains(savedMember,savedMember2);

    }


}