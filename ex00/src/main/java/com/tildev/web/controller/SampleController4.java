/**
 * 
 */
package com.tildev.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author tildev
 * @date 2019. 4. 15.
 */
@Controller
public class SampleController4 {
    private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);

    @RequestMapping("doE")
    public String doE(RedirectAttributes rttr) {

        logger.info("doE called but redirect to /doF.............");

        rttr.addAttribute("msg", "This is the msg. with redirected");

        return "redirect:/doF";
    }

    @RequestMapping("doF")
    public void doF(@RequestParam(value = "msg") String msg) {
        logger.info("doF called............." + msg);
    }
}
