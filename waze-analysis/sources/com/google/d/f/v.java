package com.google.d.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends Exception {
    v(Throwable th, ak akVar, StackTraceElement[] stackTraceElementArr) {
        super(akVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
