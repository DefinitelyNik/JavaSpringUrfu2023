package org.example.web.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class QueryToRemove {

    @NotEmpty
    private String regexQuery;

    public String getRegexQuery() {
        return regexQuery;
    }

    public void setRegexQuery(String regexQuery) {
        this.regexQuery = regexQuery;
    }
}
