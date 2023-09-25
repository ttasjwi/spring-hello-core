package com.ttasjwi.core.order

import com.ttasjwi.core.discount.FixDiscountPolicy
import com.ttasjwi.core.member.MemoryMemberRepository

class OrderServiceImpl : OrderService {

    private val memberRepository = MemoryMemberRepository()
    private val discountPolicy = FixDiscountPolicy()

    override fun createOrder(memberId: Long, itemName: String, itemPrice: Int): Order {
        // 회원 조회
        val member = findMember(memberId)

        // 할인금액 계산
        val discountPrice = discountPolicy.discount(member, itemPrice)

        // 주문 생성
        return Order(memberId, itemName, itemPrice, discountPrice)
    }

    private fun findMember(memberId: Long) =
        memberRepository.findById(memberId)
                    ?: throw NoSuchElementException("일치하는 식별자($memberId) 의 회원 조회 실패")


}
