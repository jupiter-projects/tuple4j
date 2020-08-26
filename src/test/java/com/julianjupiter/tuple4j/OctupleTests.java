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

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OctupleTests {
    private final String employeeNumber = "E2020-0000001";
    private final String firstName = "Juan";
    private final String lastName = "Dela Cruz";
    private final LocalDate birthday = LocalDate.parse("1990-07-25");
    private final Gender gender = Gender.MALE;
    private final String mobileNumber = "+639161234567";
    private final String emailAddress = "juandelacruz@gmail.com";
    private final String address = "San Roque St., Bagumbayan";
    private final String city = "Quezon City";

    @Test
    void createWithConstructor() {
        var octuple = new Octuple<>(employeeNumber, firstName, lastName, birthday, gender, mobileNumber, emailAddress, address);

        assertEquals("E2020-0000001", octuple.getFirst());
        assertEquals("Juan", octuple.getSecond());
        assertEquals("Dela Cruz", octuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), octuple.getFourth());
        assertEquals(Gender.MALE, octuple.getFifth());
        assertEquals("+639161234567", octuple.getSixth());
        assertEquals("juandelacruz@gmail.com", octuple.getSeventh());
        assertEquals("San Roque St., Bagumbayan", octuple.getEight());
    }

    @Test
    void createWithConvenienceFactoryMethod() {
        var octuple = Octuple.of(employeeNumber, firstName, lastName, birthday, gender, mobileNumber, emailAddress, address);

        assertEquals("E2020-0000001", octuple.getFirst());
        assertEquals("Juan", octuple.getSecond());
        assertEquals("Dela Cruz", octuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), octuple.getFourth());
        assertEquals(Gender.MALE, octuple.getFifth());
        assertEquals("+639161234567", octuple.getSixth());
        assertEquals("juandelacruz@gmail.com", octuple.getSeventh());
        assertEquals("San Roque St., Bagumbayan", octuple.getEight());
    }

    @Test
    void toNonuple() {
        var octuple = Octuple.of(employeeNumber, firstName, lastName, birthday, gender, mobileNumber, emailAddress, address);
        var nonuple = octuple.toNonuple(city);

        assertEquals("E2020-0000001", octuple.getFirst());
        assertEquals("Juan", octuple.getSecond());
        assertEquals("Dela Cruz", octuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), octuple.getFourth());
        assertEquals(Gender.MALE, octuple.getFifth());
        assertEquals("+639161234567", octuple.getSixth());
        assertEquals("juandelacruz@gmail.com", octuple.getSeventh());
        assertEquals("San Roque St., Bagumbayan", octuple.getEight());

        assertEquals("E2020-0000001", nonuple.getFirst());
        assertEquals("Juan", nonuple.getSecond());
        assertEquals("Dela Cruz", nonuple.getThird());
        assertEquals(LocalDate.parse("1990-07-25"), nonuple.getFourth());
        assertEquals(Gender.MALE, nonuple.getFifth());
        assertEquals("+639161234567", nonuple.getSixth());
        assertEquals("juandelacruz@gmail.com", nonuple.getSeventh());
        assertEquals("San Roque St., Bagumbayan", nonuple.getEight());
        assertEquals("Quezon City", nonuple.getNinth());
    }
}
