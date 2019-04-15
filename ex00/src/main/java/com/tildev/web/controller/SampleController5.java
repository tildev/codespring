/**
 * 
 */
package com.tildev.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tildev.web.domain.ProductVO;

/**
 * @author tildev
 * @date 2019. 4. 15.
 */
@Controller
public class SampleController5 {
    private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);

    @RequestMapping("/doJSON")
    public @ResponseBody ProductVO doJson() {
        ProductVO vo = new ProductVO("sample product", 30000);
        return vo;
    }
}
