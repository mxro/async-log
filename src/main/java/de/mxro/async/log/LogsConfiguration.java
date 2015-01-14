package de.mxro.async.log;

import de.mxro.factories.Configuration;

public class LogsConfiguration implements Configuration {

    private final int maxCapacity;

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public LogsConfiguration(final int maxCapacity) {
        super();
        this.maxCapacity = maxCapacity;
    }

}
