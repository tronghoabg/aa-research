package com.google.b.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends b {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
