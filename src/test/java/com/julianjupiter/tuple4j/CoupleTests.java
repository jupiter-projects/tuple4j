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

public class CoupleTests {
    private final String firstName = "Jose";
    private final String lastName = "Rizal";
    private final LocalDate birthday = LocalDate.of(1861, 6, 19);

    @Test
    void createWithConstructor() {
        var couple = new Couple<>(firstName, lastName);

        assertEquals("Jose", couple.getFirst());
        assertEquals("Rizal", couple.getSecond());
    }

    @Test
    void createWithConvenienceFactoryMethod() {
        var couple = Couple.of(firstName, lastName);

        assertEquals("Jose", couple.getFirst());
        assertEquals("Rizal", couple.getSecond());
    }

    @Test
    void toTriple() {
        var couple = Couple.of(firstName, lastName);
        var triple = couple.toTriple(birthday);

        assertEquals("Jose", couple.getFirst());
        assertEquals("Rizal", couple.getSecond());

        assertEquals("Jose", triple.getFirst());
        assertEquals("Rizal", triple.getSecond());
        assertEquals(LocalDate.of(1861, 6, 19), triple.getThird());
    }
}
