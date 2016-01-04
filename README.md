# TextToTable Formatter
The TextToTable library handles transformation of tables or tabluar information into a pretty printed text representation.

#### How to render a simple table
The following example render a simple table with header and lne numbers.
``` java
SimpleTextTable simpleTextTable = new SimpleTextTable(true, true);
simpleTextTable.addRow("Column Header 1", "Column Header 2", "Column Header 1");
simpleTextTable.addRow("Row 1 Value 1", "Row 1 Value 2", "Row 1 Value 3");
simpleTextTable.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");
simpleTextTable.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");
.....

System.out.println(simpleTextTable.toString());
```
