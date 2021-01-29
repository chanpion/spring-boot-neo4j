package com.chanpion.kg.neo4j.entity;

import java.util.Map;

/**
 * @author April Chen
 * @date 2021/1/19 21:13
 */
public class GraphRelation {
    private Long id;
    private String name;
    private GraphNode start;
    private GraphRelation end;
    private Map<String,Object> properties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GraphNode getStart() {
        return start;
    }

    public void setStart(GraphNode start) {
        this.start = start;
    }

    public GraphRelation getEnd() {
        return end;
    }

    public void setEnd(GraphRelation end) {
        this.end = end;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
