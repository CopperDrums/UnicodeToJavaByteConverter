# UnicodeToJavaByteConverter
Converts characters from Unicode table to Java's byte representation

The desired state of the project:
```java
input: U+0041, UTF-8 (English letter 'A') => 65 in UTF-8 table => 65 is decimal representation of the letter.

input: U+041F, UTF-8 (Cyrillic letter 'П') => 208 159 in UTF-8 => -48 -97 is decimal representation of the letter;
```


**Practical applications**:

Debugging or other purposes; manually constucting a String with bytes of a particular encoding.

*As of now*: 

you can get a javaByte of knowing a particular character's decimal representation in some encoding. 

```java
byte javaByte1 = getByteDecimal(208);  //gives -48
byte javaByte2 = getByteDecimal(159);  //gives -97
``` 
*In plans*: 

gettting javaByte using Unicode's code points.
```java
String encoding="UTF-8";

String codePoint="U+041F";

byte javaByte=makeByte(codePoint, encoding);

```
