package defpackage;

import java.lang.Thread;

/* loaded from: classes.dex */
final class qsm extends qsx {
    final /* synthetic */ qso a;

    public qsm(qso qsoVar) {
        this.a = qsoVar;
    }

    @Override // defpackage.qsx, java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        qso.a.l().ai(7829).y("Uncaught exception: %s", th);
        try {
            this.a.d.e();
        } catch (Exception e) {
            qso.a.g().p(e).ai(7830).u("Error cleaning up on crash");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
