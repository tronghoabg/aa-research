package defpackage;

/* loaded from: classes3.dex */
public final class yon extends Exception {
    public yon(Throwable th, ypd ypdVar, StackTraceElement[] stackTraceElementArr) {
        super(ypdVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
