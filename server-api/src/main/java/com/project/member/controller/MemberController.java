package com.project.member.controller;

import com.project.entity.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    @GetMapping("/test")
    public ResponseEntity<Member> test(){
        Member member = Member.builder()
                .memberId(1L)
                .memberName("test")
                .build();
        return new ResponseEntity<>(member, HttpStatus.OK);
    }
}
