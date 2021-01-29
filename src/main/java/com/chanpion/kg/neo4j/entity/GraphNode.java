package com.chanpion.kg.neo4j.entity;

import java.util.Map;
import java.util.Set;

/**
 * @author April Chen
 * @date 2021/1/19 21:12
 */
public class GraphNode {
    private Long id;
    private String name;
    private Set<String> labels;
    private Map<String, Object> properties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getLabels() {
        return labels;
    }

    public void setLabels(Set<String> labels) {
        this.labels = labels;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
