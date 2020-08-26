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

public class Quadruple<T1, T2, T3, T4> {
    private final T1 first;
    private final T2 second;
    private final T3 third;
    private final T4 fourth;

    public Quadruple(T1 first, T2 second, T3 third, T4 fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public T3 getThird() {
        return third;
    }

    public T4 getFourth() {
        return fourth;
    }

    public static <T1, T2, T3, T4> Quadruple<T1, T2, T3, T4> of(T1 first, T2 second, T3 third, T4 fourth) {
        return new Quadruple<>(first, second, third, fourth);
    }

    public <T5> Quintuple<T1, T2, T3, T4, T5> toQuintuple(T5 fifth) {
        return Quintuple.of(this.first, this.second, this.third, this.fourth, fifth);
    }
}