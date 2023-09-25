package com.ttasjwi.core.discount

import com.ttasjwi.core.member.Grade
import com.ttasjwi.core.member.Member

class FixDiscountPolicy : DiscountPolicy {

    companion object {
        private const val DISCOUNT_FIX_AMOUNT = 1000 // 1000원 할인
    }

    override fun discount(member: Member, price: Int): Int =
        if (member.grade === Grade.VIP)
            DISCOUNT_FIX_AMOUNT // VIP이면 고정 할인 적용
        else
            0 // VIP 아니면 할인 대상 아님

}
