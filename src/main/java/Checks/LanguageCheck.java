package Utils;

import Types.Language;

public class LanguageCheck {

    private LanguageCheck(){}
    public static Language check(String string) {
        Boolean flag = true;
        char[] massiv = string.toCharArray();
        Language expectedLanguage = charCheck(massiv[0]);
        if(expectedLanguage == Language.NONE)
            return Language.NONE;
        for(char symbol:massiv){
            if(charCheck(symbol) != expectedLanguage && symbol != ' '  && symbol != '/')
                flag = false;
        }
        return flag?expectedLanguage:expectedLanguage== Language.ENGLISH? Language.RUSSIAN: Language.ENGLISH;
    }
    private static Language charCheck(char symbol){
        int code = (int)symbol;
        if((code >= 65 && code <=90) || (97 >= 65 && code <=122))
            return Language.ENGLISH;
        if((code >= 1040 && code <=1103))
            return Language.RUSSIAN;
        else
            return Language.NONE;
    }
}
