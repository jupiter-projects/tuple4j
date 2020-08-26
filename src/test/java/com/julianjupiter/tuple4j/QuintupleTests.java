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

public class QuintupleTests {
    private final String employeeNumber = "E2020-0000001";
    private final String firstName = "Juan";
    private final String lastName = "Dela Cruz";
    private final LocalDate birthday = LocalDate.parse("1990-07-25");
    private final Gender gender = Gender.MALE;
    private final String mobileNumber = "+639161234567";

    @Test
    void createWithConstructor() {
        var quintuple = new Quintuple<>(employeeNumber, firstName, lastName, birthday, gender);

        Assertions.assertEquals("E2020-0000001", quintuple.getFirst());
        Assertions.assertEquals("Juan", quintuple.getSecond());
        Assertions.assertEquals("Dela Cruz", quintuple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quintuple.getFourth());
        Assertions.assertEquals(Gender.MALE, quintuple.getFifth());
    }

    @Test
    void createWithConvenienceFactoryMethod() {
        var quintuple = Quintuple.of(employeeNumber, firstName, lastName, birthday, gender);

        Assertions.assertEquals("E2020-0000001", quintuple.getFirst());
        Assertions.assertEquals("Juan", quintuple.getSecond());
        Assertions.assertEquals("Dela Cruz", quintuple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quintuple.getFourth());
        Assertions.assertEquals(Gender.MALE, quintuple.getFifth());
    }

    @Test
    void toSextuple() {
        var quintuple = Quintuple.of(employeeNumber, firstName, lastName, birthday, gender);
        var sextuple= quintuple.toSextuple(mobileNumber);

        Assertions.assertEquals("E2020-0000001", quintuple.getFirst());
        Assertions.assertEquals("Juan", quintuple.getSecond());
        Assertions.assertEquals("Dela Cruz", quintuple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), quintuple.getFourth());
        Assertions.assertEquals(Gender.MALE, quintuple.getFifth());

        Assertions.assertEquals("E2020-0000001", sextuple.getFirst());
        Assertions.assertEquals("Juan", sextuple.getSecond());
        Assertions.assertEquals("Dela Cruz", sextuple.getThird());
        Assertions.assertEquals(LocalDate.parse("1990-07-25"), sextuple.getFourth());
        Assertions.assertEquals(Gender.MALE, sextuple.getFifth());
        Assertions.assertEquals("+639161234567", sextuple.getSixth());
    }
}
