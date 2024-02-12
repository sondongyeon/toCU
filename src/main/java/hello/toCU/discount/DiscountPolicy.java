package hello.toCU.discount;

import hello.toCU.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
