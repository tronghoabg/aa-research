package defpackage;

/* loaded from: classes3.dex */
public final class ajbz extends RuntimeException {
    private final transient afco a;

    public ajbz(afco afcoVar) {
        this.a = afcoVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}
