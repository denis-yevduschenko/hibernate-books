# Hibernate 

RUN RESULTS:

---- add data into db ----
id  isbn    title   description
1  1234  Thinking in java    decription language java
3  784  How would you move mount fuji?    book about interview
4  2478  Crack Code    clean code
5  2948  Atomic Scala    book about scala

---- add data into db author----
id  first_name    middle_name   last_name
1 Gayle  John    Laakmann
2 Bruce  Joey    Eckel
3 William  Scott    Poundstone

---- data into db book_authors ----
id  isbn    title   description id  first_name    middle_name   last_name
1  1234  Thinking in java    decription language java    2 Bruce  Joey    Eckel
5  2948  Atomic Scala    book about scala    2 Bruce  Joey    Eckel
4  2478  Crack Code    clean code    1 Gayle  John    Laakmann
3  784  How would you move mount fuji?    book about interview    3 William  Scott    Poundstone

