package defpackage;

import java.lang.Thread;

/* loaded from: classes.dex */
public class ilf implements Thread.UncaughtExceptionHandler {
    Thread.UncaughtExceptionHandler a;
    public boolean b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
