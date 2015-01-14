package de.mxro.async.log.internal.operations;

import de.mxro.async.log.values.StringLog;
import de.mxro.async.properties.PropertyData;
import de.mxro.async.properties.operations.PropertyOperationWithId;

public class WriteEntryOperation extends PropertyOperationWithId<String> {

    private final String message;

    @Override
    public String perform(final PropertyData data) {

        data.get(id, StringLog.class).add(message);

        return message;

    }

    public WriteEntryOperation(final String message) {
        super();
        this.message = message;
    }

}
