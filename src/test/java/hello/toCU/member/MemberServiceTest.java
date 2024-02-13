package hello.toCU.member;

import hello.toCU.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

   MemberService memberService;
   @BeforeEach // 동작전에 먼저 실행
   public void beforeEach(){
       AppConfig appConfig = new AppConfig();
       memberService = appConfig.memberService();
   }

    @Test
    void join(){

        Member member = new Member(1L, "memberA", Grade.VIP);
        //given
        memberService.join(member);
        //when
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
