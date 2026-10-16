package com.google.d.m.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class f extends Throwable {
    f() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
