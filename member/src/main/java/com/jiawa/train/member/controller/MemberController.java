package com.jiawa.train.member.controller;

import com.jiawa.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")//会在前面拼上，因为都是关于member的
public class MemberController {
    @Resource
    private MemberService memberService;
    @GetMapping("/member/count")
    public Integer count() {
        return memberService.count();
    }
}
