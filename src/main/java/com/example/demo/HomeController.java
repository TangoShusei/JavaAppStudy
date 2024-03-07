package com.example.demo;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  /**
   * パラメータを用いたThymeleafのサンプル
   * 
   * /hello?name=XXX で指定したパラメータをもとに画面表示する
   * 
   * @param name パラメータ
   * @param model モデル情報
   * @return テンプレートのHTML
   */

  @RequestMapping("/submt")
  public String get(@RequestParam("username") @Nullable String username, Model model) {
    
    model.addAttribute("username", username);
    
    return "result";
  }
}
