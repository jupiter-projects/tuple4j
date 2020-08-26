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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class SextupleTests {
    private final String employeeNumber = "E2020-0000001";
    private final String firstName = "Juan";
    private final String lastName = "Dela Cruz";
    private final LocalDate birthday = LocalDate.parse("1990-07-25");
    private final Gender gender = Gender.MALE;
    private final String mobileNumber = "+639161234567";
    private final String emailAddress = "juandelacruz@gmail.com";

    @Test
    void createWithConstructor() {
        var sextuple = new Sextuple<>(employeeNumber, firstName, lastName, birthday, gender, mobileNumber);

        assertEquals("E2020-0000001", sextuple.getFirst());
        assertEquals("Juan", sextuple.getSecond());
        assertEquals("Dela Cruz", sextuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), sextuple.getFourth());
        assertEquals(Gender.MALE, sextuple.getFifth());
        assertEquals("+639161234567", sextuple.getSixth());
    }

    @Test
    void createWithConvenienceFactoryMethod() {
        var sextuple = Sextuple.of(employeeNumber, firstName, lastName, birthday, gender, mobileNumber);

        assertEquals("E2020-0000001", sextuple.getFirst());
        assertEquals("Juan", sextuple.getSecond());
        assertEquals("Dela Cruz", sextuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), sextuple.getFourth());
        assertEquals(Gender.MALE, sextuple.getFifth());
        assertEquals("+639161234567", sextuple.getSixth());
    }

    @Test
    void toSeptuple() {
        var sextuple = Sextuple.of(employeeNumber, firstName, lastName, birthday, gender, mobileNumber);
        var septuple = sextuple.toSeptuple(emailAddress);

        assertEquals("E2020-0000001", sextuple.getFirst());
        assertEquals("Juan", sextuple.getSecond());
        assertEquals("Dela Cruz", sextuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), sextuple.getFourth());
        assertEquals(Gender.MALE, sextuple.getFifth());
        assertEquals("+639161234567", sextuple.getSixth());

        assertEquals("E2020-0000001", septuple.getFirst());
        assertEquals("Juan", septuple.getSecond());
        assertEquals("Dela Cruz", septuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), septuple.getFourth());
        assertEquals(Gender.MALE, septuple.getFifth());
        assertEquals("+639161234567", septuple.getSixth());
        assertEquals("juandelacruz@gmail.com", septuple.getSeventh());
    }
}
