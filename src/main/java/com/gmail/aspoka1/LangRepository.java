package com.gmail.aspoka1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LangRepository {
    List<Lang> languages;

    public LangRepository() {
        languages = new ArrayList<>();
        languages.add(new Lang(1L, "Hello", "eng"));
        languages.add(new Lang(2L, "Siemanko", "pl"));
    }

    Optional<Lang> getLanguagesById(Long id){
        return languages.stream().filter(l -> l.getId().equals(id)).findFirst();
    }
}
