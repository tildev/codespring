/**
 * 
 */
package com.tildev.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tildev.web.domain.ProductVO;

/**
 * @author tildev
 * @date 2019. 4. 15.
 */
@Controller
public class SampleController3 {
    private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);

    @RequestMapping("doD")
    public String doD(Model model) {

        ProductVO product = new ProductVO("Sample Project", 10000);

        logger.info("doD called.............");
        model.addAttribute(product);
        
        return "productDetail";
    }
}
