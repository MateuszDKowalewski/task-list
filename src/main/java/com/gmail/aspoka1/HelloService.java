package com.gmail.aspoka1;

class HelloService {
    static final String FALLBACK_NAME = "world";
    static final Lang FALLBACK_LANG = new Lang(1, "Hello", "eng");

    LangRepository langRepository;

    HelloService() {
        this(new LangRepository());
    }

    HelloService(LangRepository langRepository) {
        this.langRepository = langRepository;
    }

    String prepareGreeting(String name, String id){
        int langId;
        Lang lang;
        try {
            langId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            langId = FALLBACK_LANG.getId();
        }
        lang = langRepository.getLanguagesById(langId).orElse(FALLBACK_LANG);
        return lang.getGreeting() + " " + ((name == null) ? FALLBACK_NAME : name) + "!";
    }
}
