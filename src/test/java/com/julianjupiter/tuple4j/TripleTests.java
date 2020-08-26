/*
 * Copyright 2020 Julian Jupiter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.julianjupiter.tuple4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TripleTests {
    private final String employeeNumber = "E2020-0000001";
    private final String firstName = "Juan";
    private final String lastName = "Dela Cruz";
    private final LocalDate birthday = LocalDate.parse("1990-07-25");

    @Test
    void createWithConstructor() {
        var triple = new Triple<>(employeeNumber, firstName, lastName);

        Assertions.assertEquals("E2020-0000001", triple.getFirst());
        Assertions.assertEquals("Juan", triple.getSecond());
        Assertions.assertEquals("Dela Cruz", triple.getThird());
    }

    @Test
    void createWithConvenienceFactoryMethod() {
        var triple = Triple.of(employeeNumber, firstName, lastName);

        Assertions.assertEquals("E2020-0000001", triple.getFirst());
        Assertions.assertEquals("Juan", triple.getSecond());
        Assertions.assertEquals("Dela Cruz", triple.getThird());
    }

    @Test
    void toQuadruple() {
        var triple = Triple.of(employeeNumber, firstName, lastName);
        var quadruple = triple.toQuadruple(birthday);

        Assertions.assertEquals("E2020-0000001", triple.getFirst());
        Assertions.assertEquals("Juan", triple.getSecond());
        Assertions.assertEquals("Dela Cruz", triple.getThird());

        Assertions.assertEquals("E2020-0000001", quadruple.getFirst());
        Assertions.assertEquals("Juan", quadruple.getSecond());
        Assertions.assertEquals("Dela Cruz", quadruple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quadruple.getFourth());
    }
}
