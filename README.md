# 99-scala-problems

[![license](https://img.shields.io/github/license/mashape/apistatus.svg)](./LICENSE)

A repository with my attempt to solve 99 Scala Problems.

### Table of Contents
**[1. 99 Scala Problems](#the-99-scala-problems)**<br>
**[2. Code Layout](#code-layout)**<br>
**[3. Question Topics](#question-topics)**<br>
**[4. Testing](#testing)**<br>
**[5. License](#License)**<br>

## 99 Scala Problems

The 99 Scala Problems are defined [here](http://aperiodic.net/phil/scala/s-99/) but a copy has been made in this repository in [99-scala-problems.txt](./99-scala-problems.txt).

Example problem:
```
P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```

## Code Layout

Each problem has its own object, e.g. `P01` with a corresponding test class, e.g. `P01Test`. The only dependency used is ScalaTest.

## Question Topics

|          Topic         | Questions |
|:----------------------:|-----------|
| Working with Lists     |    1-28   |
| Arithmetic             |   31-41   |
| Logic and Codes        |   46-50   |
| Binary Trees           |   55-69   |
| Multiway Trees         |   70-73   |
| Graphs                 |   80-89   |
| Miscellaneous Problems |   90-99   |

## Testing

To run the tests, go to the root of the repository and run the following:

```shell
sbt
sbt:99-scala-problems> test
```

## License

[![license](https://img.shields.io/github/license/mashape/apistatus.svg)](./LICENSE)

Copyright ©‎ 2020, tcooling

Released under the MIT license, see [LICENSE](./LICENSE) for details.