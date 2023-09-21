package com.ttasjwi.core.member

interface MemberService {

    fun join(member: Member)
    fun findMember(memberId: Long): Member
}
