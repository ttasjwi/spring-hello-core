package com.ttasjwi.core

import com.ttasjwi.core.member.Grade
import com.ttasjwi.core.member.Member
import com.ttasjwi.core.member.MemberServiceImpl

fun main() {
    val memberService = MemberServiceImpl()
    val member = Member(1L, "memberA", Grade.VIP)
    memberService.join(member)

    val findMember = memberService.findMember(1L)
    println("new member = ${member.name}")
    println("find member = ${findMember.name}")
}
