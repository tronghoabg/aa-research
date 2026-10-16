package com.fasterxml.jackson.core;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ErrorReportConfiguration implements Serializable {
    private static ErrorReportConfiguration DEFAULT = new ErrorReportConfiguration(256, 500);
    private static final long serialVersionUID = 1;
    protected final int _maxErrorTokenLength = 256;
    protected final int _maxRawContentLength = 500;

    protected ErrorReportConfiguration(int i2, int i3) {
    }

    public static ErrorReportConfiguration defaults() {
        return DEFAULT;
    }

    public int getMaxErrorTokenLength() {
        return this._maxErrorTokenLength;
    }

    public int getMaxRawContentLength() {
        return this._maxRawContentLength;
    }
}
