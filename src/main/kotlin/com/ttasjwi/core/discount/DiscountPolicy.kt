package com.ttasjwi.core.discount

import com.ttasjwi.core.member.Member

/**
 * 할인으로 차감되는 금액을 계산하는 역할
 */
interface DiscountPolicy {

    /**
     * 할인으로 차감되는 금액을 계산합니다.
     * @param member 회원
     * @param price 원가
     * @return 할인으로 차감되는 금액(예: 할인되지 않으면 0원)
     */
    fun discount(member: Member, price: Int): Int

}
