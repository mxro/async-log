package de.mxro.async.log.values.v01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.mxro.async.properties.values.PropertyValue;

public class StringLogData implements PropertyValue, Serializable {

    private static final long serialVersionUID = 1L;

    private final int maxCapacity;
    private final List<String> entries;

    @Override
    public boolean is(final Class<?> type) {
        // TODO Auto-generated method stub
        return false;
    }

    public List<String> entries() {
        return this.entries;
    }

    public void add(final String message) {
        if (entries.size() > maxCapacity) {

        }
    }

    public StringLogData(final int maxCapacity) {
        super();
        this.maxCapacity = maxCapacity;
        this.entries = new ArrayList<String>(maxCapacity);
    }

}
