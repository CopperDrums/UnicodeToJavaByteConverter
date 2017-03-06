# UnicodeToJavaByteConverter
Converts characters from Unicode table to Java's byte representation

The desired state of the project:
```java
input: U+0041, UTF-8 (English letter 'A') => 65 in UTF-8 table => 65 is decimal representation of the letter.

input: U+041F, UTF-8 (Cyrillic letter 'П') => 208 159 in UTF-8 => -48 -97 is decimal representation of the letter;
```


**Practical applications**:

*As of now*: 

you can get a javaByte of knowing a particular character's decimal representation in some encoding. 

```java
byte[] bytes=new byte[] {-48, -97, -47, -128, -48, -72, -48, -78, -48, -75, -47, -126};
``` 
*In plans*: 

gettting javaByte using Unicode's code points.
```java
String encoding="UTF-8";

byte[] javaBytes=makeBytes("U+041F", "U+0440", "U+0438", "U+0432", "U+0435", "U+0442");

```
