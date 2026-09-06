# Journal
Why did we use a final int constant to set the array size? What happens in Java when you attempt to access an array index that contains null versus one that contains an object?

We used a final int constant to make the code self-documenting by clearly defining what the number represents. Also, using a constant creates a single source of truth—if we ever need to update the array size, we only have to change it in one place instead of searching for hardcoded values throughout the code.


When printing an array index that contains an object, Java calls that object's toString() method and displays its output. If the index contains null, Java safely prints the literal word 'null' without throwing an error or exception.