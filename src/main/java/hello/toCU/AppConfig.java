package hello.toCU;

import hello.toCU.discount.DiscountPolicy;
import hello.toCU.discount.FixDiscountPolicy;
import hello.toCU.discount.RateDiscountPolicy;
import hello.toCU.member.MemberService;
import hello.toCU.member.MemberServiceImpl;
import hello.toCU.member.MemoryMemberRepository;
import hello.toCU.order.OrderService;
import hello.toCU.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
