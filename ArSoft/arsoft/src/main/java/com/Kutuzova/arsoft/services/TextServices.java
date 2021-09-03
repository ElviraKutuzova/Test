package com.Kutuzova.arsoft.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextServices {
    List <String>listNumber = new ArrayList();
    List<String> listLine = new ArrayList<>();

    public String textWrite(String text) {
        return changeText(text);
    }

    private String changeText(String text){

        char[] strToArray = text.toCharArray();
        for(int i = 0; i < strToArray.length; i++){

            listLine.add(strToArray[i] + "  ");
            int number = Character.codePointAt(strToArray, i) - 1071;
            String s = String.format("%2d", number);
            if(number>0){
                listNumber.add(s);
            } else if (number <0){
                listNumber.add(" ");
            }
        }
        String textResult = String.join("  ", listLine );
        String numberResult = String.join(" ", listNumber);

        String result = textResult + numberResult;
        return result;

    }

}
