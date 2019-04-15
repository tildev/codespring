/**
 * 
 */
package com.tildev.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author tildev
 * @date 2019. 4. 15.
 */
@Controller
public class SampleController4_1 {
    private static final Logger logger = LoggerFactory.getLogger(SampleController4_1.class);

    @RequestMapping("doEE")
    public String doEE(RedirectAttributes rttr) {

        logger.info("doEE called but redirect to /doFF.............");

        rttr.addFlashAttribute("msg", "This is the msg. with redirected");

        return "redirect:/doFF";
    }

    @RequestMapping("doFF")
    public String doFF() {
        logger.info("doFF called.............");
        return "doff";
    }
}
