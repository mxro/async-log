package de.mxro.async.log.internal;

import de.mxro.async.properties.PropertyFactory;

public class LogFactory implements PropertyFactory {

    private final int defaultMaxCapacity;

    public LogFactory(final int defaultMaxCapacity) {
        super();
        this.defaultMaxCapacity = defaultMaxCapacity;
    }

    @Override
    public <T> T create(final Class<T> type) {
        // TODO Auto-generated method stub
        return null;
    }

}
