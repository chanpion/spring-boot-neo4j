package com.chanpion.kg.neo4j.controller;

import org.neo4j.driver.AccessMode;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author April Chen
 * @date 2021/1/18 19:46
 */
@RestController
@RequestMapping(value = "/neo4j", method = {RequestMethod.GET, RequestMethod.POST})
public class Neo4jController {
    private static final Logger LOGGER = LoggerFactory.getLogger(Neo4jController.class);

    @Resource
    private Driver driver;

    @RequestMapping("/search")
    public Object search() {
        LOGGER.info("search");
        SessionConfig sessionConfig = SessionConfig.builder().withDefaultAccessMode(AccessMode.READ).build();
        try (Session session = driver.session(sessionConfig)) {
            return session.run("MATCH (m:个股) RETURN m ORDER BY m.name ASC  LIMIT 100").stream()
                    .map(r -> r.get("m").asNode())
                    .map(n -> {
                        Map<String, Object> map = new HashMap<>(n.asMap());
                        map.put("labels", n.labels());
                        return map;
                    })
                    .collect(Collectors.toList());
        }
    }
}
