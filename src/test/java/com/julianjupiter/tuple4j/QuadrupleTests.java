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

public class QuadrupleTests {
    private final String employeeNumber = "E2020-0000001";
    private final String firstName = "Juan";
    private final String lastName = "Dela Cruz";
    private final LocalDate birthday = LocalDate.parse("1990-07-25");
    private final Gender gender = Gender.MALE;

    @Test
    void createWithConstructor() {
        var quadruple = new Quadruple<>(employeeNumber, firstName, lastName, birthday);

        Assertions.assertEquals("E2020-0000001", quadruple.getFirst());
        Assertions.assertEquals("Juan", quadruple.getSecond());
        Assertions.assertEquals("Dela Cruz", quadruple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quadruple.getFourth());
    }

    @Test
    void createWithConvenienceFactoryMethod() {
        var quadruple = Quadruple.of(employeeNumber, firstName, lastName, birthday);

        Assertions.assertEquals("E2020-0000001", quadruple.getFirst());
        Assertions.assertEquals("Juan", quadruple.getSecond());
        Assertions.assertEquals("Dela Cruz", quadruple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quadruple.getFourth());
    }

    @Test
    void toQuintuple() {
        var quadruple = Quadruple.of(employeeNumber, firstName, lastName, birthday);
        var quintuple = quadruple.toQuintuple(gender);

        Assertions.assertEquals("E2020-0000001", quadruple.getFirst());
        Assertions.assertEquals("Juan", quadruple.getSecond());
        Assertions.assertEquals("Dela Cruz", quadruple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quadruple.getFourth());

        Assertions.assertEquals("E2020-0000001", quintuple.getFirst());
        Assertions.assertEquals("Juan", quintuple.getSecond());
        Assertions.assertEquals("Dela Cruz", quintuple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quintuple.getFourth());
        Assertions.assertEquals(Gender.MALE, quintuple.getFifth());
    }
}
