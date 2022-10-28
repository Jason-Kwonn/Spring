package hello.core;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        // Spring 컨테이너 시작 시 항상 쓰는 것, Annotation 기반으로 Config 하는 것을 설정 해줌 (AppConfig 클래스에 있는 Annotation)
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //MemberService 클래스 내의 memberService 객체를 불러온다
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findmember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findmember.getName());
    }
}
