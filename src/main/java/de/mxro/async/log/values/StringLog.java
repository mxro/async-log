package de.mxro.async.log.values;

import java.util.List;

public interface StringLog {

    public List<String> entries();

    public void add(String message);

}