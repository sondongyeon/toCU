package hello.toCU.discount;

import hello.toCU.member.Grade;
import hello.toCU.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
            // Test 만드는 단축키 ctrl + shift + t
        }else {
            return 0;
        }
        }
}
