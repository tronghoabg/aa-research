package com.google.d.m.a;

import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bz extends TimeoutException {
    /* synthetic */ bz(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
