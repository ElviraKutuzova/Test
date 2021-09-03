package com.Kutuzova.arsoft.controllers;

import com.Kutuzova.arsoft.services.TextServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/")
public class TextController {

    private String text = "  Создать сервис Rest Full, который на вход получает текст русского языка с абзацами.\n" +
            "                На выходе нужно получить текст, где каждую букву исходного текста заменить ее\n" +
            "                порядковым номером в алфавите, при этом в одной строке печатать текст с двумя\n" +
            "                пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее\n" +
            "                номер.";

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", text);
        TextServices textServices = new TextServices();
        String textResult = textServices.textWrite(text);
        model.addAttribute("result", textResult);
        return "home";
    }

}
