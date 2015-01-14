package de.mxro.async.log;

import de.mxro.async.log.internal.LogFactory;
import de.mxro.async.log.internal.operations.WriteEntryOperation;
import de.mxro.async.properties.PropertiesCommon;
import de.mxro.async.properties.PropertyFactory;
import de.mxro.async.properties.PropertyNode;
import de.mxro.async.properties.PropertyOperation;

/**
 * <p>
 * Key methods and factories for Async Log library.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public class LogCommon extends PropertiesCommon {

    public static PropertyNode create() {
        return PropertiesCommon.createUnsafe(PropertiesCommon.compositeFactory(PropertiesCommon.defaultFactory(),
                logFactory()));
    }

    public static PropertyFactory logFactory() {
        return new LogFactory();
    }

    public PropertyOperation entry(final String id, final String message) {
        return new WriteEntryOperation(message).setId(id);
    }

}
