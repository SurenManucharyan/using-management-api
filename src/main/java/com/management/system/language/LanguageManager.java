package com.management.system.language;

import com.google.gson.Gson;
import com.management.system.utils.ReadFile;

public class LanguageManager {

    private static final Gson gson = new Gson();
    private static String classFilePath = LanguageManager.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    private static String englishJSONFilePath = classFilePath+"/static/language_en.json";
    private static String russianJSONFilePath = classFilePath+"/static/language_ru.json";
    private static String armenianJSONFilePath = classFilePath+"/static/language_am.json";
    private static String massageKeyJSONFilePath = classFilePath+"/static/massage_key.json";
    private static Language english = gson.fromJson(ReadFile.readFile(englishJSONFilePath), Language.class);
    private static Language russian = gson.fromJson(ReadFile.readFile(russianJSONFilePath), Language.class);
    private static Language armenian = gson.fromJson(ReadFile.readFile(armenianJSONFilePath), Language.class);
    private static MessageKey messageKey = gson.fromJson(ReadFile.readFile(massageKeyJSONFilePath), MessageKey.class);

    public static void reload(){
        english = gson.fromJson(ReadFile.readFile(englishJSONFilePath), Language.class);
        armenian = gson.fromJson(ReadFile.readFile(armenianJSONFilePath),Language.class);
        messageKey = gson.fromJson(ReadFile.readFile(massageKeyJSONFilePath),MessageKey.class);
    }

    public static MessageKey getMessageKey(){
        return messageKey;
    }

    public static Language getLanguageInstance(String language){
        switch (language.toUpperCase()){
            case "EN": return english;
            case "RU": return russian;
            case "HY": return armenian;
            default: return armenian;
        }
    }

}
