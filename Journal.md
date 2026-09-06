# Journal
Why did we use a final int constant to set the array size? What happens in Java when you attempt to access an array index that contains null versus one that contains an object?

We used a final int constant to make the code self-documenting by clearly defining what the number represents. Also, using a constant creates a single source of truth—if we ever need to update the array size, we only have to change it in one place instead of searching for hardcoded values throughout the code.


When printing an array index that contains an object, Java calls that object's toString() method and displays its output. If the index contains null, Java safely prints the literal word 'null' without throwing an error or exception.


_________


Compare the primitive double and int types. What happens to the decimal values during an explicit narrowing cast? Why does Java force you to explicitly cast from double to int instead of doing it automatically?

A double holds 64 bits of precision and can store decimal values, whereas an int holds 32 bits and only stores whole numbers.

During a narrowing cast, Java uses truncation which discards everything after the decimal point rather than rounding to the nearest whole number.

Java requires an explicit cast from double to int to protect you from unintended bugs. Since dropping the decimal portion results in data loss, the compiler forces you to explicitly confirm that you know data will be lost and want to proceed anyway.


_________


Explain how two different array elements were able to reflect the same change to the RuneCore. How does a primitive variable holding a value differ from a reference variable holding an object location?

Both ChaosRune objects reflect the same change because they share a reference pointing to the exact same RuneCore object in memory rather than holding separate copies.

Primitive variables differ because they store raw data values directly. When you assign one primitive to another, Java copies the actual value, so modifying one leaves the other unaffected. Reference variables, on the other hand, store a memory address. Assigning a reference variable copies that memory location, causing both variables to point to the exact same object on the heap and share its state."