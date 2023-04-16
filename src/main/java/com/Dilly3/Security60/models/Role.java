package com.Dilly3.Security60.models;

public enum Role {
    USER("USER"), ADMIN("ADMIN");
    private final String name;
    Role(String name1){

        this.name = name1;
    }

    public String getName() {
        return name;
    }
}
