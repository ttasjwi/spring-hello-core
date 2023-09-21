package com.ttasjwi.core.member

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("회원 서비스 테스트")
class MemberServiceTest {

    private val memberService: MemberService = MemberServiceImpl()

    @Test
    fun `회원 가입 후 같은 아이디로 조회하면 같은 회원이 찾아진다`() {
        // given
        val member = Member(1L, "memberA", Grade.VIP)

        // when
        memberService.join(member)
        val findMember = memberService.findMember(member.id)

        // then
        assertThat(findMember.id).isEqualTo(member.id)
        assertThat(findMember.name).isEqualTo(member.name)
        assertThat(findMember.grade).isSameAs(member.grade)
    }

}
