package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dk implements h.c.h, h.c.i {

    /* renamed from: a, reason: collision with root package name */
    public static final dk f51847a = new dk();

    @Override // h.c.j
    public final /* bridge */ <R> R fold(R r, h.g.a.p<? super R, ? super h.c.h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public final /* bridge */ <E extends h.c.h> E get(h.c.i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    @Override // h.c.h
    public final h.c.i<?> getKey() {
        return this;
    }

    @Override // h.c.j
    public final /* bridge */ h.c.j minusKey(h.c.i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // h.c.j
    public final /* bridge */ h.c.j plus(h.c.j jVar) {
        return h.c.a.h.h(this, jVar);
    }
}
