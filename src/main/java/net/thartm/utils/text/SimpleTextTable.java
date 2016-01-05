package net.thartm.utils.text;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * @author thomas.hartmann@netcentric.biz
 * @since 01/2016
 */
public class SimpleTextTable {

    private static final String DASH = "-";

    private boolean fixedMaxColumnWidth = false;

    private int maxColumns = -1;

    private int[] maxColumnWidths;

    private List<String[]> rows = new LinkedList<String[]>();

    private boolean showHeader;

    private boolean showLineNumbers;

    public SimpleTextTable() {
    }

    public SimpleTextTable(final boolean showHeader, final boolean showLineNumbers) {
        this.showHeader = showHeader;
        this.showLineNumbers = showLineNumbers;
    }

    public void addRow(final String... cols) {
        calculateColumnWidths(cols);
        rows.add(cols);
    }

    private void calculateColumnWidths(final String[] cols) {
        if (cols.length > this.maxColumns) {
            this.maxColumns = cols.length;
            maxColumnWidths = new int[cols.length];
        }

        for (int i = 0; i < cols.length; i++) {
            this.maxColumnWidths[i] = Math.max(this.maxColumnWidths[i], StringUtils.length(cols[i]));
        }
    }

    public String printFormatted() {
        final StringBuilder sb = new StringBuilder();

        final int sizeForLineNumbers = showLineNumbers ? String.valueOf(rows.size()).length() : -1;

        for (int rowNum = 0; rowNum < rows.size(); rowNum++) {
            final String[] row = rows.get(rowNum);

            showHeader(sb, rowNum, row);

            showLineNumbers(sb, sizeForLineNumbers, rowNum);

            for (int colNum = 0; colNum < row.length; colNum++) {
                final String value = StringUtils.defaultString(row[colNum]);

                final int columnWidth = maxColumnWidths[colNum];

                sb.append(StringUtils.rightPad(value, columnWidth, StringUtils.SPACE));
                sb.append(StringUtils.SPACE);

            }

            sb.append(StringUtils.LF);
        }

        return sb.toString();
    }

    private void showLineNumbers(final StringBuilder sb, final int sizeForLineNumbers, final int rowNum) {
        if (showLineNumbers) {

            if (rowNum > 0) {
                sb.append(StringUtils.rightPad(String.valueOf(rowNum), sizeForLineNumbers, StringUtils.SPACE));
                sb.append(StringUtils.SPACE);
            }else {
                sb.append(StringUtils.rightPad(StringUtils.SPACE, sizeForLineNumbers, StringUtils.SPACE));
            }
        }
    }

    private void showHeader(final StringBuilder sb, final int rowNum, final String[] row) {
        if (showHeader && rowNum == 1) {
            for (int colNum = 0; colNum < row.length; colNum++) {
                final int columnWidth = maxColumnWidths[colNum];
                sb.append(StringUtils.rightPad(DASH, columnWidth, DASH));
                sb.append(StringUtils.SPACE);
            }
            sb.append(StringUtils.LF);
        }
    }

    public int getMaxColumns() {
        return maxColumns;
    }

    public int[] getMaxColumnWidths() {
        return maxColumnWidths;
    }

    public List<String[]> getRows() {
        return rows;
    }

    public void setShowHeader(final boolean showHeader) {
        this.showHeader = showHeader;
    }

    public void setShowLineNumbers(final boolean showLineNumbers) {
        this.showLineNumbers = showLineNumbers;
    }

    public void setFixedMaxColumnWidth(final int width){
        if(width > -1){
            this.fixedMaxColumnWidth = true;


        }
    }
}
