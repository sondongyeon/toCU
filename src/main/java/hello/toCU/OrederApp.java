package hello.toCU;

import hello.toCU.member.*;
import hello.toCU.order.Order;
import hello.toCU.order.OrderService;
import hello.toCU.order.OrderServiceImpl;

public class OrederApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order = " + order.calculatePrice());

    }
}
