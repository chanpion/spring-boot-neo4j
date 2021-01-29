package com.chanpion.kg.neo4j.operation;

import org.neo4j.driver.Driver;

/**
 * @author April Chen
 * @date 2021/1/19 21:20
 */
public class Neo4jTemplate {
    private final Driver driver;

    public Neo4jTemplate(Driver driver) {
        this.driver = driver;
    }
}
