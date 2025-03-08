# GenericsExample
 Java Generics: https://www.youtube.com/watch?v=K1iu1kXkVoA

# Why Generics?
- Imagine we create a class that holds an int and prints it out when we ask it
to be printed: IntegerPrinter


```java
public class IntegerPrinter {

    Integer value;

    /**
     * Default constructor.
     */
    public IntegerPrinter() {
        super();
    }

    /**
     * Constructor for IntegerPrinter. Takes a value and returns an instance of
     * IntegerPrinter.
     *
     * @param value The value to be stored in the instance.
     */
    public IntegerPrinter(Integer value) {
        super();
        this.value = value;
    }

    /**
     *
     */
    public void print() {
        System.out.println(value);

    }

}
```

- What if we wanted to do exactly the same thing with a double?
    - We'd have to simply copy the class and call it DoublePrinter
- Now we want one for strings, chars, booleans, etc, etc
- End up with a lot of code duplication.
- Generics to the rescue.
    - Refactor IntegerPrinter
    - rename it Printer.
    - place the type parameter after the class name in the declaration:

```java
public class Printer <T> {...}
```
- T is used by convention, but can be anything.
- Update the type of the stored value to T and update the constructor:

```java
 T value;
 public Printer(T value) {}
```

- When create an instance, Eclipse warns but Netbeans doesn't if we don't specify the type.

```java
  Printer printer = new Printer("F");
```
- ideally should be:

```java
Printer<String> printer = new Printer("F");
```
- And the following will not compile/displays warning:

```java
Printer<Integer> printer = new Printer<>("F");
```

- Generics don't work with `int` `long` `double` - you must use Double, Long, Integer
- We've seen generics with List and ArrayList:

```java
  ArrayList<Cat> cats = new ArrayList<>();
```
- We could just use Object and store any type of object:

```java
  ArrayList<Object> cats = new ArrayList<>();
```
- This isn't type safe at all!
- Retrieving the cat:

```java
     // Retrieving the Cat from the list
        Cat myCat = (Cat) cats.get(0); // Object can't be converted to Cat
```
- You must cast the object retrieved before storing it.
- What if we add a bunch of Dogs and Cats to the list, what do we cast it to?
    - Casting Dog to Cat will lead to a class cast exception at runtime.
    - This is a type safety issue
- Generics solves this issue, so we shouldn't use Object!
- Imagine we have Animal and Dog and Cat extend Animal, we update our printer:

```java
public class Printer<T extends Animal> {}
```
- now the Printer will only accept types that extend Animal
- Any method in Animal is now availbe to our `value` inside Printer!
    - <T extends Animal> is a bounded generic
    - you're giving a bound, a limit, on the type to be passed in
    - can use bounds with interfaces
        - <T extends List> for example (not implements)
        - remember, List is an interface

```java
public class Printer<T extends List> {}
```
- You can have multiple bounds: is a subclass of Animal and implements List
    - just use an ampersand

```java
public class Printer<T extends Animal & List> {}
```
- Can add as much as you want with some restrictions:
    - only one class (Java doesn't support multiple inheritance)
    - must list class name first, with interfaces afterwards

# Generic Methods
- 