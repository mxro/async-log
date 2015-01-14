package de.mxro.async.log;

import de.mxro.async.log.internal.LogFactory;
import de.mxro.async.log.internal.operations.WriteEntryOperation;
import de.mxro.async.properties.PropertiesCommon;
import de.mxro.async.properties.PropertyFactory;
import de.mxro.async.properties.PropertyNode;
import de.mxro.async.properties.PropertyOperation;
import de.mxro.factories.Configuration;
import de.mxro.factories.Dependencies;
import de.mxro.factories.Factory;

/**
 * <p>
 * Key methods and factories for Async Log library.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public class LogsCommon extends PropertiesCommon {

    public static PropertyNode createUnsafe() {
        final int defaultMaxCapacity = 40;
        return PropertiesCommon.createUnsafe(PropertiesCommon.compositeFactory(PropertiesCommon.defaultFactory(),
                logFactory(defaultMaxCapacity)));
    }

    public static PropertyNode createUnsafe(final int defaultMaxCapacity) {
        return PropertiesCommon.createUnsafe(PropertiesCommon.compositeFactory(PropertiesCommon.defaultFactory(),
                logFactory(defaultMaxCapacity)));
    }

    public static PropertyFactory logFactory(final int defaultMaxCapacity) {
        return new LogFactory(defaultMaxCapacity);
    }

    public static PropertyOperation<String> string(final String id, final String message) {
        return new WriteEntryOperation(message).setId(id);
    }

    public static Factory<?, ?, ?> createUnsafeLogsFactory() {
        return new Factory<PropertyNode, Configuration, Dependencies>() {

            @Override
            public boolean canInstantiate(final Configuration conf) {

                return conf instanceof LogsConfiguration;
            }

            @Override
            public PropertyNode create(final Configuration conf, final Dependencies dependencies) {

                return LogsCommon.createUnsafe();
            }

        };
    }

}
