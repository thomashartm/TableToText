package net.thartm.utils.text.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A row containing column information.
 * 
 * @author thomas.hartmann@netcentric.biz
 * @since 01/2016
 */
public class Row {

    private List<String> columns = new ArrayList<>();

    public void addColumnValues(final Object... values) {
        for (final Object value : values) {
            final String stringValue = valueOf(value);
            this.columns.add(stringValue);
        }
    }

    public void addColumnValue(final int index, final String value) {
        this.columns.add(index, value);
    }

    public List<String> getColumns() {
        return columns;
    }

    private String valueOf(final Object value) {
        String stringValue = null;

        if (value instanceof String) {
            stringValue = (String) value;
        }

        if (value instanceof Double) {
            stringValue = String.valueOf(value);
        }

        if (value instanceof Boolean) {
            stringValue = String.valueOf(value);
        }

        if (value instanceof Integer) {
            stringValue = String.valueOf(value);
        }

        if (value instanceof Float) {
            stringValue = String.valueOf(value);
        }

        if (value instanceof Collection) {
            stringValue = StringUtils.join((Collection) value, ",");
        }
        return stringValue != null ? stringValue : StringUtils.EMPTY;
    }
}
