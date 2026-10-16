package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class StreamReadConstraints implements Serializable {
    private static StreamReadConstraints DEFAULT = new StreamReadConstraints(1000, -1, 1000, 20000000, 50000);
    private static final long serialVersionUID = 1;
    protected final long _maxDocLen;
    protected final int _maxNameLen;
    protected final int _maxNestingDepth;
    protected final int _maxNumLen;
    protected final int _maxStringLen;
    protected final long _maxTokenCount;

    protected StreamReadConstraints(int i2, long j2, int i3, int i4, int i5, long j3) {
        this._maxNestingDepth = 1000;
        this._maxDocLen = -1L;
        this._maxNumLen = 1000;
        this._maxStringLen = 20000000;
        this._maxNameLen = 50000;
        this._maxTokenCount = -1L;
    }

    public static StreamReadConstraints defaults() {
        return DEFAULT;
    }

    protected String _constrainRef(String str) {
        return "`StreamReadConstraints." + str + "()`";
    }

    protected StreamConstraintsException _constructException(String str, Object... objArr) throws StreamConstraintsException {
        throw new StreamConstraintsException(String.format(str, objArr));
    }

    public int getMaxNameLength() {
        return this._maxNameLen;
    }

    public boolean hasMaxTokenCount() {
        return this._maxTokenCount > 0;
    }

    public void validateBigIntegerScale(int i2) throws StreamConstraintsException {
        if (Math.abs(i2) > 100000) {
            throw _constructException("BigDecimal scale (%d) magnitude exceeds the maximum allowed (%d)", Integer.valueOf(i2), 100000);
        }
    }

    public void validateDocumentLength(long j2) throws StreamConstraintsException {
        long j3 = this._maxDocLen;
        if (j2 > j3 && j3 > 0) {
            throw _constructException("Document length (%d) exceeds the maximum allowed (%d, from %s)", Long.valueOf(j2), Long.valueOf(this._maxDocLen), _constrainRef("getMaxDocumentLength"));
        }
    }

    public void validateFPLength(int i2) throws StreamConstraintsException {
        if (i2 > this._maxNumLen) {
            throw _constructException("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(this._maxNumLen), _constrainRef("getMaxNumberLength"));
        }
    }

    public void validateIntegerLength(int i2) throws StreamConstraintsException {
        if (i2 > this._maxNumLen) {
            throw _constructException("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(this._maxNumLen), _constrainRef("getMaxNumberLength"));
        }
    }

    public void validateNameLength(int i2) throws StreamConstraintsException {
        if (i2 > this._maxNameLen) {
            throw _constructException("Name length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(this._maxNameLen), _constrainRef("getMaxNameLength"));
        }
    }

    public void validateNestingDepth(int i2) throws StreamConstraintsException {
        if (i2 > this._maxNestingDepth) {
            throw _constructException("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(this._maxNestingDepth), _constrainRef("getMaxNestingDepth"));
        }
    }

    public void validateStringLength(int i2) throws StreamConstraintsException {
        if (i2 > this._maxStringLen) {
            throw _constructException("String value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(this._maxStringLen), _constrainRef("getMaxStringLength"));
        }
    }

    public void validateTokenCount(long j2) throws StreamConstraintsException {
        if (j2 > this._maxTokenCount) {
            throw _constructException("Token count (%d) exceeds the maximum allowed (%d, from %s)", Long.valueOf(j2), Long.valueOf(this._maxTokenCount), _constrainRef("getMaxTokenCount"));
        }
    }

    @Deprecated
    protected StreamReadConstraints(int i2, long j2, int i3, int i4, int i5) {
        this(1000, -1L, 1000, 20000000, 50000, -1L);
    }
}
