package net.thartm.utils.text;

import org.junit.Before;
import org.junit.Test;

/**
 * @author thomas.hartmann@netcentric.biz
 * @since 01/2016
 */
public class SimpleTextTableTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testAddRow() throws Exception {

    }

    @Test
    public void testPrintFormatted() throws Exception {
        SimpleTextTable simpleTextTable = new SimpleTextTable(true, true);
        simpleTextTable.addRow("Column Header 1", "Column Header 2", "Column Header 1");
        simpleTextTable.addRow("Row 1 Value 1", "Row 1 Value 2", "Row 1 Value 3");
        simpleTextTable.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");
        simpleTextTable.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");

        System.out.println(simpleTextTable.toString());
    }
}