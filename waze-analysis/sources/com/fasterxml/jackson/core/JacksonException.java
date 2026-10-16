package com.fasterxml.jackson.core;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class JacksonException extends IOException {
    private static final long serialVersionUID = 123;

    protected JacksonException(String str) {
        super(str);
    }

    public abstract JsonLocation getLocation();

    public abstract String getOriginalMessage();

    public abstract Object getProcessor();

    protected JacksonException(String str, Throwable th) {
        super(str, th);
    }

    protected JacksonException(Throwable th) {
        super(th);
    }
}
