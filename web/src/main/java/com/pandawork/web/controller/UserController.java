package com.pandawork.web.controller;

import com.pandawork.common.entity.User;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.framework.web.WebConstants;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * UserController
 *
 * @author: zhangteng
 * @time: 2015/3/24 19:35
 */
@Controller
public class UserController extends AbstractController {

    /**
     * 去学生注册页面
     * @param model
     * @return
     */
    @RequestMapping(value = " ", method = RequestMethod.GET)
    public String toAdd(Model model) {
        return "student/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(User user) {
        try {
            userService.newUser(user);
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            return WebConstants.sysErrorCode;
        }
        return "student/add";
    }
}
