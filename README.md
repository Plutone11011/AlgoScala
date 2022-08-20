## AlgoScala

This is a repository for Leetcode-style algorithms, written in Scala. Use this as both a way to train your algorithm writing skill, while also writing unit tests for them, and learn Scala and a more functional approach.

## Contributing

Feel free to have a look at the issues page or raise one of your own. If you have more general topics to discuss you can use the Discussion Do remember that whenever you want to add a new algorithm, a test class with at least two test cases is needed. 

For consistency, every algorithm implementation is in a single Scala Object, whereas tests are in a single Scala class that derives from `org.scalatest.flatspec.AnyFlatSpec`. The naming convention here is to use UpperCamelCase for the algorithm object, lowerCamelCase for the method name inside the object, and the same UpperCamelCase for the test.

Please try to use semantic commits:

```
feat: (adding new feature, which means writing a new algorithm, or a different implementation of an already existing algo. If you commit an algo together with its test still use this commit)
fix: (bug fix for algo)
docs: (changes to the documentation)
style: (formatting, missing semi colons, etc)
refactor: (refactoring, eg. renaming a variable)
test: (adding missing tests, refactoring tests)
dx: (dev experience; anything that helps to improve developers' experience)
chore: (updating grunt tasks etc; no code change)
```

## Usage

1. Fork the repo
2. Clone it ```git clone https://github.com/Plutone11011/AlgoScala.git```
3. The project is an sbt Scala project, so you need a JVM to be installed on your machine. [Here](https://docs.scala-lang.org/getting-started/index.html) are the official instructions to install everything needed to run this project.


You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

