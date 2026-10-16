package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends cf implements CompletableDeferred {
    public r() {
        super(true);
        I(null);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean a(Object obj) {
        return P(obj);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean b(Throwable th) {
        return P(new u(th));
    }

    @Override // kotlinx.coroutines.cf
    public final boolean bK() {
        return true;
    }

    @Override // kotlinx.coroutines.am
    public final Object c(h.c.e eVar) throws Throwable {
        Object objZ = z(eVar);
        h.c.a.a aVar = h.c.a.a.f48038a;
        return objZ;
    }

    @Override // kotlinx.coroutines.am
    public final Object e() {
        return bW();
    }

    @Override // kotlinx.coroutines.am
    public final kotlinx.coroutines.g.e h() {
        return Q();
    }
}
