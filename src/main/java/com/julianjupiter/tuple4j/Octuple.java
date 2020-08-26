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

public class Octuple<T1, T2, T3, T4, T5, T6, T7, T8> {
    private final T1 first;
    private final T2 second;
    private final T3 third;
    private final T4 fourth;
    private final T5 fifth;
    private final T6 sixth;
    private final T7 seventh;
    private final T8 eight;

    public Octuple(T1 first, T2 second, T3 third, T4 fourth, T5 fifth, T6 sixth, T7 seventh, T8 eight) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eight = eight;
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

    public T5 getFifth() {
        return fifth;
    }

    public T6 getSixth() {
        return sixth;
    }

    public T7 getSeventh() {
        return seventh;
    }

    public T8 getEight() {
        return eight;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Octuple<T1, T2, T3, T4, T5, T6, T7, T8> of(T1 first, T2 second, T3 third, T4 fourth, T5 fifth, T6 sixth, T7 seventh, T8 eight) {
        return new Octuple<>(first, second, third, fourth, fifth, sixth, seventh, eight);
    }

    public <T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> toNonuple(T9 ninth) {
        return Nonuple.of(this.first, this.second, this.third, this.fourth, this.fifth, this.sixth, this.seventh, this.eight, ninth);
    }
}
