[![Build Status](https://travis-ci.org/jbunting/junit-accumulate.svg)](https://travis-ci.org/jbunting/junit-accumulate)
[![Coverage Status](https://coveralls.io/repos/jbunting/junit-accumulate/badge.svg)](https://coveralls.io/r/jbunting/junit-accumulate)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

junit-accumulate
----------------

This is a very simple little library designed to allow for accumulating junit assertions instead of failing immediately.

A more detailed explanation of its usage can be found here:

  http://bunting.io/junit/2015/03/07/accumulating-junit-assertions.html

Example usage:

```java
 public class MyTest {
     @Rule
     public CumulativeAssertionRule accumulator = new CumulativeAssertionRule();
 
     @Test
     public void myTest() {
         MyTestableObject underTest = new MyTestableObject();
         // do something expensive and slow
 
         accumulator.assertTrue(underTest.isSuccessful());
         accumulator.assertEquals("Mary had a little lamb.", underTest.getContent());
     }
 }
```

