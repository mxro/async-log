package de.mxro.async.log.jre;

import de.mxro.async.log.LogsCommon;
import de.mxro.async.log.LogsConfiguration;
import de.mxro.async.properties.PropertiesCommon;
import de.mxro.async.properties.PropertyNode;
import de.mxro.async.properties.jre.Properties;
import de.mxro.factories.Configuration;
import de.mxro.factories.Dependencies;
import de.mxro.factories.Factory;

public class Logs extends LogsCommon {

    public static PropertyNode create() {
        final int defaultMaxCapacity = 20;
        return create(defaultMaxCapacity);
    }

    public static PropertyNode create(final int capacity) {

        return Properties.create(PropertiesCommon.compositeFactory(PropertiesCommon.defaultFactory(),
                logFactory(capacity)));
    }

    public static Factory<?, ?, ?> createLogsFactory() {
        return new Factory<PropertyNode, LogsConfiguration, Dependencies>() {

            @Override
            public boolean canInstantiate(final Configuration conf) {

                return conf instanceof LogsConfiguration;
            }

            @Override
            public PropertyNode create(final LogsConfiguration conf, final Dependencies dependencies) {

                return Logs.create(conf.getMaxCapacity());
            }

        };
    }
}
