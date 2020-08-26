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

public class Monuple<T> {
    private final T value;

    public Monuple(T value) {
        this.value = value;
    }

    public <T2> Couple<T, T2> toCouple(T2 second) {
        return Couple.of(this.value, second);
    }

    public T get() {
        return value;
    }

    public static <T> Monuple<T> of(T value) {
        return new Monuple<>(value);
    }

    @Override
    public String toString() {
        return "Monuple{" +
                "value=" + value +
                '}';
    }
}
