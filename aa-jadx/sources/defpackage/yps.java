package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yps extends java.lang.Exception {
    public yps(java.lang.Throwable th, defpackage.yqi yqiVar, java.lang.StackTraceElement[] stackTraceElementArr) {
        super(yqiVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
