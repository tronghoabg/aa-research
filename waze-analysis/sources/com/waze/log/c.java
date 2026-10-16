package com.waze.log;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class c {
    public static final int $stable = 0;

    public abstract void logStackTrace();

    protected final void logStackTraceJNI() {
        ((LogNativeManager) this).logStackTrace();
    }
}
