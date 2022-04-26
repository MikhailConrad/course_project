package com.web.xiaomi_products.web;

import com.web.xiaomi_products.entity.Comment;
import com.web.xiaomi_products.entity.CommentForProduct;
import com.web.xiaomi_products.entity.Product;
import com.web.xiaomi_products.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.List;
import java.util.Map;

@Controller
public class AudioController {

    private CommentService commentService;

    @Autowired
    public AudioController (CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/audio")
    public String showAudioTemplate(Model model){

        Map<Product, List<Comment>> commentsForMobileDevices =
                commentService.getCommentsForCategory("Аудио");

        for (Map.Entry<Product, List<Comment>> products : commentsForMobileDevices.entrySet()) {
            Product product = products.getKey();
            model.addAttribute(product.getProductName().replaceAll(" ", ""), products.getValue());
        }

        model.addAttribute("newComment", new CommentForProduct());

        return "audio";
    }

    @PostMapping("/audio")
    public String addComments(@ModelAttribute("newComment") CommentForProduct newCommentForProduct, Principal principal) {

        commentService.addNewComment(newCommentForProduct, principal.getName());
        return "redirect:/audio";
    }
}
