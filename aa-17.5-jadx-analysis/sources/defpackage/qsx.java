package defpackage;

import java.lang.Thread;

/* loaded from: classes.dex */
public class qsx implements Thread.UncaughtExceptionHandler {
    Thread.UncaughtExceptionHandler b;
    public boolean c;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
