package com.artimanton.learningwords;

import io.realm.RealmObject;
import io.realm.annotations.Required;

public class Words extends RealmObject{
    @Required
    private String verb;
    private String translate;
    private String example;

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

}
