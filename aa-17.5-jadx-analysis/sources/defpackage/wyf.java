package defpackage;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class wyf implements Thread.UncaughtExceptionHandler {
    final Thread.UncaughtExceptionHandler a;

    public wyf(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.uncaughtException(thread, th);
    }
}
