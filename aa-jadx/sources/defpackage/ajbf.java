package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajbf extends java.util.concurrent.CancellationException {
    public final transient java.lang.Object a;

    public ajbf(java.lang.Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
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
