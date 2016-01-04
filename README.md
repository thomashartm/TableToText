# TextToTable Formatter
The TextToTable library handles transformation of tables or tabluar information into a pretty printed text representation.

#### How to render a simple table
The following example renders a very simple table with header and line numbers.
``` java
SimpleTextTable simpleTextTable = new SimpleTextTable(true, true);
simpleTextTable.addRow("Column Header 1", "Column Header 2", "Column Header 1");
simpleTextTable.addRow("Row 1 Value 1", "Row 1 Value 2", "Row 1 Value 3");
simpleTextTable.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");
simpleTextTable.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");

System.out.println(simpleTextTable.printFormatted());
```

The rendered table looks as follows.

``` bash
 Column Header 1 Column Header 2 Column Header 1 
--------------- --------------- --------------- 
1 Row 1 Value 1   Row 1 Value 2   Row 1 Value 3   
2 Row 2 Value 1   Row 2 Value 2   Row 2 Value 3   
3 Row 2 Value 1   Row 2 Value 2   Row 2 Value 3   
```