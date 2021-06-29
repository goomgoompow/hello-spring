package com.goom.hellospring.service;

import com.goom.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    private MemberService memberService = new MemberService();

    @Test
    public void join(){
        Member member1 = new Member();
        member1.setName("Kim");
        member1.setId(1L);

        Member member2 = new Member();
        member2.setName("Kim");
        member2.setId(2L);

        memberService.join(member1);
        memberService.join(member2);
        memberService.join(member2);

       // Assertions.assertThat()

    }

}
