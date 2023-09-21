package com.ttasjwi.core.member

import java.util.NoSuchElementException

class MemberServiceImpl : MemberService {

    private val memberRepository: MemberRepository = MemoryMemberRepository()

    override fun join(member: Member) {
        memberRepository.save(member)
    }

    override fun findMember(memberId: Long): Member =
        memberRepository.findById(memberId)
            ?: throw NoSuchElementException("그런 회원이 없습니다")
}
