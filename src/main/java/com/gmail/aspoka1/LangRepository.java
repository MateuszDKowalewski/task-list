package com.gmail.aspoka1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LangRepository {
    List<Lang> languages;

    Optional<Lang> getLanguagesById(Integer id){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.get(Lang.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}
