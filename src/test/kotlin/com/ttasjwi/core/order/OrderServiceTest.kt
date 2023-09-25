package com.ttasjwi.core.order

import com.ttasjwi.core.member.Grade
import com.ttasjwi.core.member.Member
import com.ttasjwi.core.member.MemberServiceImpl
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class OrderServiceTest {

    private val memberService = MemberServiceImpl()
    private val orderService = OrderServiceImpl()

    @Test
    fun createOrder() {
        val memberId = 1L
        val member = Member(memberId, "memberA", Grade.VIP)
        memberService.join(member)

        val order = orderService.createOrder(memberId, "itemA", 10000)
        assertThat(order.discountPrice).isEqualTo(1000)
        assertThat(order.calculatePrice()).isEqualTo(9000)
    }
}