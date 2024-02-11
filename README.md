# jankenpo-kotlin

## Installation

I installed Kotlin using `apt` on `Ubuntu 23`:

```
sudo apt install kotlin -y
```

Then I compiled a test (`tests/manuals/index.kt`) using this command:

```
cd tests/manuals
kotlinc -include-runtime index.kt -d index.jar
```

Please see that I defined the name of the generated file with the `-d` clausule.

Then I executed the `jar` file with this command:

```
java -jar index.jar
```

Observations: 

- I tested (viewing) this simple output. It worked;
- I already had installed the openjdk-18.

