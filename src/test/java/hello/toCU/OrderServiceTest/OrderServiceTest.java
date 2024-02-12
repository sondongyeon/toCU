package hello.toCU.OrderServiceTest;

import hello.toCU.member.Grade;
import hello.toCU.member.Member;
import hello.toCU.member.MemberService;
import hello.toCU.member.MemberServiceImpl;
import hello.toCU.order.Order;
import hello.toCU.order.OrderService;
import hello.toCU.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
