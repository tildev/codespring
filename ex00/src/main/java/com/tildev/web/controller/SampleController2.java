/**
 * 
 */
package com.tildev.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tildev
 * @date 2019. 4. 15.
 */
@Controller
public class SampleController2 {
    private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);

    @RequestMapping("doC")
    public String doC(@ModelAttribute("msg") String msg) {
        logger.info("doC called.............");
        return "result";
    }
}
