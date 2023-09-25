package com.ttasjwi.core

import com.ttasjwi.core.member.Grade
import com.ttasjwi.core.member.Member
import com.ttasjwi.core.member.MemberServiceImpl
import com.ttasjwi.core.order.OrderServiceImpl

fun main() {
    val memberService = MemberServiceImpl()
    val orderService = OrderServiceImpl()

    val memberId = 1L
    val member = Member(memberId, "memberA", Grade.VIP)
    memberService.join(member)

    val order = orderService.createOrder(memberId, "itemA", 10000)
    print(order)
}
