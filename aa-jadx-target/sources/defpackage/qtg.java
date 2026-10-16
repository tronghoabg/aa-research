package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qtg extends defpackage.qtt {
    final /* synthetic */ defpackage.qtj a;

    public qtg(defpackage.qtj qtjVar) {
        this.a = qtjVar;
    }

    @Override // defpackage.qtt, java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        defpackage.qtj.a.l().ai(7854).y("Uncaught exception: %s", th);
        try {
            this.a.d.e();
        } catch (java.lang.Exception e) {
            defpackage.qtj.a.g().p(e).ai(7855).u("Error cleaning up on crash");
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
