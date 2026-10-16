package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajcz extends java.lang.RuntimeException {
    private final transient defpackage.afdo a;

    public ajcz(defpackage.afdo afdoVar) {
        this.a = afdoVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return java.lang.String.valueOf(this.a);
    }
}
