package com.likelion.teammatch.controller.browser;

import com.likelion.teammatch.dto.RecruitDraftDto;
import com.likelion.teammatch.dto.UserProfileDto;
import com.likelion.teammatch.service.RecruitService;
import com.likelion.teammatch.service.UserService;
import com.likelion.teammatch.service.team.TeamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
public class MainController {

    private final TeamService teamService;
    private final RecruitService recruitService;
    private final UserService userService;

    public MainController(TeamService teamService, RecruitService recruitService, UserService userService) {
        this.teamService = teamService;
        this.recruitService = recruitService;
        this.userService = userService;
    }

    @GetMapping("/main")
    public String getMainPage(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, UserProfileDto dto,
            Model model
    ){
        List<RecruitDraftDto> recruitInfoList = recruitService.getRecruitDraftList(page);
        model.addAttribute("recruitList", recruitInfoList);

        // 프로필창 정보
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        UserProfileDto profileOfUser = userService.getProfileOfUser(username);
        model.addAttribute("username", username);
        model.addAttribute("phone", profileOfUser.getPhone());
        model.addAttribute("email", profileOfUser.getEmail());
        if (SecurityContextHolder.getContext().getAuthentication().getName().equals("anonymousUser")) model.addAttribute("logined", false);
        else model.addAttribute("logined", true);

        return "/html/index";
    }







}
