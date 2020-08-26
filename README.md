# Tuple4j
`Tuple4j` is a Java library that provides ten (10) tuple APIs.
## Clone and Install
```bash
$ git clone https://github.com/jupiter-projects/tuple4j.git
$ ./mvnw install
```
## Add as Dependency
### Maven
```xml
<dependency>
    <groupId>com.julianjupiter.tuple4j</groupId>
    <artifactId>tuple4j</artifactId>
    <version>0.0.1</version>
</dependency>
```
### Gradle
```gradle
compile 'com.julianjupiter.tuple4j:tuple4j:0.0.1'
```
## JPMS
If your application is using module system (JPMS):
```java
requires com.julianjupiter.tuple4j;
```
## Usage
Monuple, via constructor:
```java
var monuple = new Monuple<>("Jose");
```
Via convenience factory method:
```java
var monuple = Monuple.of("Jose");
```
To get value:
```java
var firstName = monuple.get();
```
Couple, via constructor:
```java
var couple = new Couple<>("Jose", "Rizal");
```
Via convenience factory method:
```java
var couple = Couple.of("Jose", "Rizal");
```
To get values:
```java
var firstName = couple.getFirst();
var lastName = couple.getSecond();
```
Convert to higher tuple:
```java
var couple = monuple.toCouple("Rizal");
var firstName = couple.getFirst();
var lastName = couple.getSecond();

---

var triple = couple.toTriple(LocalDate.of(1861, 6, 19));
var firstName = triple.getFirst();
var lastName = triple.getSecond();
var birthday = triple.getThird();
```
Othe built-in classes:
- Quadruple - 4 elements
- Quintuple - 5 elements
- Sextuple - 6 elements
- Septuple - 7 elements
- Octuple - 8 elements
- Nonuple - 9 elements
- Decuple - 10 elements
## License
```
Copyright 2020 Julian Jupiter

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
