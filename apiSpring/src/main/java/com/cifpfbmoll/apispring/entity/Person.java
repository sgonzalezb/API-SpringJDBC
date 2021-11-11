package com.cifpfbmoll.apispring.entity;

import java.math.BigDecimal;

public record Person(String name,
                     Integer age,
                     BigDecimal money) {
}
