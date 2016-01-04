package net.thartm.utils.text;

import org.junit.Assert;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * @author thomas.hartmann@netcentric.biz
 * @since 01/2016
 */
public class SimpleTextTableTest {

    private SimpleTextTable table;

    @Before
    public void setUp() throws Exception {
        this.table = new SimpleTextTable(true, true);
        table.addRow("Column Header 1", "Column Header 2", "Column Header 1");
        table.addRow("Row 1 Value 1", "Row 1 Value 2", "Row 1 Value 3");
        table.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");
        table.addRow("Row 2 Value 1", "Row 2 Value 2", "Row 2 Value 3");
    }

    @Test
    public void testAddRow() throws Exception {
        Assert.assertEquals(4, table.getRows().size());
    }

    @Test
    public void testPrintFormatted() throws Exception {

        final String expected = " Column Header 1 Column Header 2 Column Header 1 " + StringUtils.LF
                + "--------------- --------------- --------------- " + StringUtils.LF
                + "1 Row 1 Value 1   Row 1 Value 2   Row 1 Value 3   " + StringUtils.LF
                + "2 Row 2 Value 1   Row 2 Value 2   Row 2 Value 3   " + StringUtils.LF
                + "3 Row 2 Value 1   Row 2 Value 2   Row 2 Value 3   " + StringUtils.LF;

        Assert.assertEquals(expected, table.printFormatted());
    }
}