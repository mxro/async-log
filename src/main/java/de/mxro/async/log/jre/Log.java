package de.mxro.async.log.jre;

import de.mxro.async.log.LogCommon;
import de.mxro.async.properties.PropertiesCommon;
import de.mxro.async.properties.PropertyNode;
import de.mxro.async.properties.jre.Properties;

public class Log extends LogCommon {

    public static PropertyNode create() {
        final int defaultMaxCapacity = 20;
        return Properties.create(PropertiesCommon.compositeFactory(PropertiesCommon.defaultFactory(),
                logFactory(defaultMaxCapacity)));
    }
}
