package de.mxro.async.log.internal;

import de.mxro.async.log.values.StringLog;
import de.mxro.async.log.values.v01.StringLogData;
import de.mxro.async.properties.PropertyFactory;

public class LogFactory implements PropertyFactory {

    private final int defaultMaxCapacity;

    public LogFactory(final int defaultMaxCapacity) {
        super();
        this.defaultMaxCapacity = defaultMaxCapacity;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T create(final Class<T> type) {

        if (type.equals(StringLog.class)) {
            return (T) new StringLogData(defaultMaxCapacity);
        }

        return null;
    }

}
