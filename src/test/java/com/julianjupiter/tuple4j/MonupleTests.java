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

public class MonupleTests {
    private final String firstName = "Jose";
    private final String lastName = "Rizal";

    @Test
    void createWithConstructor() {
        var monuple = new Monuple<>(firstName);

        Assertions.assertEquals("Jose", monuple.get());
    }

    @Test
    void createWithConvenienceFactoryMethod() {
        var monuple = Monuple.of(firstName);

        Assertions.assertEquals("Jose", monuple.get());
    }

    @Test
    void toCouple() {
        var monuple = Monuple.of(firstName);
        var couple = monuple.toCouple(lastName);

        Assertions.assertEquals("Jose", monuple.get());

        Assertions.assertEquals("Jose", couple.getFirst());
        Assertions.assertEquals("Rizal", couple.getSecond());
    }
}
