package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class f implements kotlinx.coroutines.af {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f51897a;

    public f(h.c.j jVar) {
        this.f51897a = jVar;
    }

    @Override // kotlinx.coroutines.af
    public final h.c.j getCoroutineContext() {
        return this.f51897a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f51897a + ")";
    }
}
