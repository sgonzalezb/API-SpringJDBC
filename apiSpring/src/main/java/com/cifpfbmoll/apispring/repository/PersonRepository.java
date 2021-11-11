package com.cifpfbmoll.apispring.repository;

import com.cifpfbmoll.apispring.entity.Person;
import com.cifpfbmoll.apispring.entity.PersonMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {


    private JdbcTemplate jdbcTemplate;

    public Person findOne(String name) {
        String sql = """
                SELECT *
                FROM CUSTOMER 
                WHERE ID = %s
                """.formatted(name);

        return jdbcTemplate.queryForObject(sql, new PersonMapper());
    }
}
