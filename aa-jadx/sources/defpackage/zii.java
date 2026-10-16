package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zii extends java.util.concurrent.TimeoutException {
    public zii(java.lang.String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
