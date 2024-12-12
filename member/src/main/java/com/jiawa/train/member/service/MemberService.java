package com.jiawa.train.member.service;

import com.jiawa.train.member.mapper.MemberMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
//让springboot知道这个类
@Service
public class MemberService {
    //注入接口
    @Resource
    private MemberMapper memberMapper;
    public int count(){
        return memberMapper.count();
    }
}
