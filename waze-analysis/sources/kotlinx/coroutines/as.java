package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as extends kotlinx.coroutines.e.ah {

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.b f51367b;

    public as(h.c.j jVar, h.c.e eVar) {
        super(jVar, eVar);
        this.f51367b = h.e.b.f(0);
    }

    @Override // kotlinx.coroutines.e.ah, kotlinx.coroutines.a
    protected final void bQ(Object obj) {
        kotlinx.a.b bVar;
        do {
            bVar = this.f51367b;
            int iD = bVar.d();
            if (iD != 0) {
                if (iD != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                h.c.e eVar = this.f51865c;
                kotlinx.coroutines.e.k.b(h.c.a.h.d(eVar), h.f.s.i(obj, eVar));
                return;
            }
        } while (!bVar.g(0, 2));
    }

    public final Object i() {
        kotlinx.a.b bVar;
        do {
            bVar = this.f51367b;
            int iD = bVar.d();
            if (iD != 0) {
                if (iD != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objB = cg.b(bX());
                if (objB instanceof u) {
                    throw ((u) objB).f52067a;
                }
                return objB;
            }
        } while (!bVar.g(0, 1));
        return h.c.a.a.f48038a;
    }

    @Override // kotlinx.coroutines.e.ah, kotlinx.coroutines.cf
    protected final void k(Object obj) {
        bQ(obj);
    }
}
