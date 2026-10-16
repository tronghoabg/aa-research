package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final transient h.c.j f51899a;

    public i(h.c.j jVar) {
        this.f51899a = jVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f51899a);
    }
}
