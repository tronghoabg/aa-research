package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class StreamWriteConstraints implements Serializable {
    private static StreamWriteConstraints DEFAULT = new StreamWriteConstraints(1000);
    private static final long serialVersionUID = 1;
    protected final int _maxNestingDepth = 1000;

    protected StreamWriteConstraints(int i2) {
    }

    public static StreamWriteConstraints defaults() {
        return DEFAULT;
    }

    protected String _constrainRef(String str) {
        return "`StreamWriteConstraints.getMaxNestingDepth()`";
    }

    protected StreamConstraintsException _constructException(String str, Object... objArr) throws StreamConstraintsException {
        throw new StreamConstraintsException(String.format("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", objArr));
    }

    public void validateNestingDepth(int i2) throws StreamConstraintsException {
        if (i2 > this._maxNestingDepth) {
            throw _constructException("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(this._maxNestingDepth), _constrainRef("getMaxNestingDepth"));
        }
    }
}
