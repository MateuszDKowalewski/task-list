package com.gmail.aspoka1;

class HelloService {
    static final String CALLBACK_NAME = "world";
    static final Lang CALLBACK_LANG = new Lang(1L, "Hello", "eng");

    LangRepository langRepository;

    HelloService() {
        this(new LangRepository());
    }

    HelloService(LangRepository langRepository) {
        this.langRepository = langRepository;
    }

    String prepreGreeting(String name, String id){
        long langId;
        Lang lang;
        try {
            langId = Long.parseLong(id);
            lang = langRepository.getLanguagesByid(langId).orElse(CALLBACK_LANG);
        } catch (NumberFormatException e) {
            lang = CALLBACK_LANG;
        }
        return lang.getGreeting() + " " + ((name == null) ? CALLBACK_NAME : name) + "!";
    }
}
