package kotlinx.coroutines.b.a;

import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends g {

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.q f51430e;

    public m(h.g.a.q qVar, kotlinx.coroutines.b.k kVar, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        super(kVar, jVar, i2, aVar);
        this.f51430e = qVar;
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final e b(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return new m(this.f51430e, this.f51411d, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.a.g
    protected final Object f(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = kotlinx.coroutines.ai.f51347a;
        Object objD = aj.d(new l(this, lVar, (h.c.e) null, 0), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }
}
