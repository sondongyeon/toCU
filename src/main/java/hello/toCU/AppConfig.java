package hello.toCU;

import hello.toCU.discount.FixDiscountPolicy;
import hello.toCU.member.MemberService;
import hello.toCU.member.MemberServiceImpl;
import hello.toCU.member.MemoryMemberRepository;
import hello.toCU.order.OrderService;
import hello.toCU.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
