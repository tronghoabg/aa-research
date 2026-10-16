package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag implements h.c.e, h.c.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.e f51394a;

    /* renamed from: b, reason: collision with root package name */
    private final h.c.j f51395b;

    public ag(h.c.e eVar, h.c.j jVar) {
        this.f51394a = eVar;
        this.f51395b = jVar;
    }

    @Override // h.c.b.a.d
    public final h.c.b.a.d getCallerFrame() {
        h.c.e eVar = this.f51394a;
        if (eVar instanceof h.c.b.a.d) {
            return (h.c.b.a.d) eVar;
        }
        return null;
    }

    @Override // h.c.e
    public final h.c.j getContext() {
        return this.f51395b;
    }

    @Override // h.c.b.a.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        this.f51394a.resumeWith(obj);
    }
}
