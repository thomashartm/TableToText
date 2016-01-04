package net.thartm.utils.text;

import net.thartm.utils.text.model.Row;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author thomas.hartmann@netcentric.biz
 * @since 01/2016
 */
public class RowModelBackedTextTable {

    private boolean showHeader;

    private boolean showLineNumber;

    private Row header;

    private List<Row> rows = new ArrayList();


    public void addHeader(final Row row){
        header = row;
    }

    public void addRow(final Row row){
        rows.add(row);
    }

    public boolean isShowHeader() {
        return showHeader;
    }

    public boolean isShowLineNumber() {
        return showLineNumber;
    }

    public Row getHeader() {
        return header;
    }

    public List<Row> getRows() {
        return rows;
    }
}
