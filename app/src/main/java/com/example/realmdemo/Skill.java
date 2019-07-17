package com.example.realmdemo;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Skill extends RealmObject {

    public static final String PROPERTY_SKILL = "skillName";

    public Skill() {
    }

    @PrimaryKey
    @Required
    public String skillName;
}