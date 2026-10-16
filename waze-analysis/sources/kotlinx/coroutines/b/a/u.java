package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements h.c.j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f51455a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h.c.j f51456b;

    public u(Throwable th, h.c.j jVar) {
        this.f51456b = jVar;
        this.f51455a = th;
    }

    @Override // h.c.j
    public final <R> R fold(R r, h.g.a.p<? super R, ? super h.c.h, ? extends R> pVar) {
        return (R) this.f51456b.fold(r, pVar);
    }

    @Override // h.c.j
    public final <E extends h.c.h> E get(h.c.i<E> iVar) {
        return (E) this.f51456b.get(iVar);
    }

    @Override // h.c.j
    public final h.c.j minusKey(h.c.i<?> iVar) {
        return this.f51456b.minusKey(iVar);
    }

    @Override // h.c.j
    public final h.c.j plus(h.c.j jVar) {
        return this.f51456b.plus(jVar);
    }
}
