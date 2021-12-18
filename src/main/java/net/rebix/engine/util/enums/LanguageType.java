package net.rebix.engine.util.enums;

public enum LanguageType {
    German("German"),
    English("English");

    public String getValue(){

        return value;
    }

    private String value;

    LanguageType(String value){
        this.value = value;
    }
}
