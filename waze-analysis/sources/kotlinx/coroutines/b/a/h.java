package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends g {
    public /* synthetic */ h(kotlinx.coroutines.b.k kVar, h.c.k kVar2, kotlinx.coroutines.a.a aVar, int i2) {
        super(kVar, (i2 & 2) != 0 ? h.c.k.f48060a : kVar2, (i2 & 4) != 0 ? -3 : 0, (i2 & 8) != 0 ? kotlinx.coroutines.a.a.f51271a : aVar);
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final e b(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return new h(this.f51411d, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.a.e
    public final kotlinx.coroutines.b.k e() {
        return this.f51411d;
    }

    @Override // kotlinx.coroutines.b.a.g
    protected final Object f(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f51411d.collect(lVar, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
