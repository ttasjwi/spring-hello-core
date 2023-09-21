package com.ttasjwi.core.member

interface MemberRepository {

    fun save(member: Member)
    fun findById(memberId: Long): Member?
}
