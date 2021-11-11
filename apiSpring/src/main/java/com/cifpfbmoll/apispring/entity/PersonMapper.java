package com.cifpfbmoll.apispring.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Person(
                rs.getString("id"),
                rs.getInt("age"),
                rs.getBigDecimal("money")
        );
    }
}
