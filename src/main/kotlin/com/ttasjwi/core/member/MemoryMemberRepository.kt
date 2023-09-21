package com.ttasjwi.core.member

class MemoryMemberRepository : MemberRepository {

    companion object {
        //        private val store: MutableMap<Long, Member> = ConcurrentHashMap()
        private val store: MutableMap<Long, Member> = HashMap()
    }

    override fun save(member: Member) {
        store[member.id] = member
    }

    override fun findById(memberId: Long): Member? = store[memberId]
}
