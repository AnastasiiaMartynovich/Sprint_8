package org.example;
import java.util.*;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        if(name.isEmpty()) {
            System.out.println("Передна пустая строка");
            return false;
        } else if (name.isBlank()) {
            System.out.println("Вместо имени переданы символы пробела");
            return false;
        } else if ((name.startsWith(" ")) || (name.endsWith(" "))) {
            System.out.println("Переданное имя и фамилия содержат пробелы в начале или в конце");
            return false;
        } else if ((!(name.startsWith(" "))) && (!(name.endsWith(" ")))) {
for (int i = 0; i < name.length(); i++) {
    if ((Character.isWhitespace(name.charAt(i))) && ((name.length() >= 3 && name.length() <= 19))) {
        System.out.println("Переданное имя и фамилия соответствуют корректной длине и разделены пробелом.");
        return true;
    } else if (!name.contains(" ")) {
        System.out.println("Пробелов нет вообще.");
        return false;
    }
}
        } 
return false;        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}
