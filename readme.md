## Generic Custom Queue

## Introduction

This project is used to create a generic custom queue in SBT using Scala programming Language.

## Technology

Generic Queue is implemented in Scala programming language.

## Requirements
Java 11

Scala 2.13.5

sbt 1.4.7

Commands

### clean

This command cleans the sbt project by deleting the target directory. The command output relevant messages.
````
sbt clean
````

### compile 

This command compiles the scala source classes of the sbt project.

````
sbt compile
````

### Run 

Enter the project folder and type project module name along with the sbt run command:
````
sbt run
````
More details about project (e.g. version etc..) can be found in file build.sbt

### Tests

Code is developed by applying [TDD](https://en.wikipedia.org/wiki/Test-driven_development) and tests are located in folder **/src/test/scala-2.13**,  For running all tests enter the project folder and type:

 ```
 sbt test
 ```

### Coverage

scoverage plugin is used in the code for checking code coverage. Code coverage is 92.31%


 ```
 sbt clean coverage test coverageReport
 ```


## Library dependencies

* scalatest - test driven development
* scoverage(plugin)
* scalastyle(plugin)

More details about project libraraies (e.g. version etc..) can be found in file **build.sbt**


## Functionality

perform queue operations i.e. enqueue, dequeue, isEmpty, peek, toString.
This functionality is implemented on generic Queue

e.g.
````
Queue(3,4,7)
Queue("Hi","this","is","generic","custom","queue")
````
### enqueue

This functionality adds element in the queue

e.g.
````
enqueue(1), enqueue("string") . . ...........
````
### dequeue

This functionality removes element from front of the queue

e.g.
````
dequeue
````
### isEmpty

This functionality checks if queue is empty or not

e.g.
````
isEmpty = true/ false
````
### peek

This functionality returns front element of the queue

e.g.
````
peek
````

### toString

This functionality returns elements of Queue as string

e.g.
````
Queue(3,4,7)
Queue("Hi","this","is","generic","custom","queue")
````

A number of samples is given in test file:
* QueueSpec

Source file in which this functionality is implemented:

* Queue

## Generate scalastyle configuration file

###### Note: The configuration for scalastyle is already created.

````
sbt scalastyleGenerateConfig
````

## Check scalastyle for code
````
sbt scalastyle
````
