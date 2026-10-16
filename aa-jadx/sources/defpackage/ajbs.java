package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajbs extends java.util.concurrent.CancellationException {
    public ajbs() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        if (defpackage.aiuy.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
