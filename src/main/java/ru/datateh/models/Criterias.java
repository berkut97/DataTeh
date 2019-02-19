package ru.datateh.models;

import java.util.HashMap;
import java.util.Map;

public class Criterias {
    /**
     * Карта критериев
     */
    Map<String, Integer> criterias = new HashMap<String, Integer>();

    public Map<String, Integer> getCriterias() {
        return criterias;
    }

    public void setCriterias(Map<String, Integer> criterias) {
        this.criterias = criterias;
    }
}
