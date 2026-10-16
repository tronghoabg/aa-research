package kotlinx.coroutines.a;

import h.g.b.ar;
import kotlinx.coroutines.e.al;
import kotlinx.coroutines.e.av;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y extends k {

    /* renamed from: c, reason: collision with root package name */
    private final int f51330c;

    /* renamed from: d, reason: collision with root package name */
    private final a f51331d;

    public y(int i2, a aVar, h.g.a.l lVar) {
        super(i2, lVar);
        this.f51330c = i2;
        this.f51331d = aVar;
        if (aVar != a.f51271a) {
            if (i2 > 0) {
                return;
            }
            throw new IllegalArgumentException("Buffered channel capacity must be at least 1, but " + i2 + " was specified");
        }
        int i3 = ar.f48106a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new h.g.b.m(k.class).c() + " instead");
    }

    private final Object H(Object obj, boolean z) {
        h.g.a.l lVar;
        av avVarJ;
        if (this.f51331d != a.f51273c) {
            return j(obj);
        }
        Object objI = super.i(obj);
        if (t.g(objI) || (objI instanceof r)) {
            return objI;
        }
        if (!z || (lVar = this.f51293a) == null || (avVarJ = al.j(lVar, obj, null)) == null) {
            return h.ab.f48028a;
        }
        throw avVarJ;
    }

    @Override // kotlinx.coroutines.a.k, kotlinx.coroutines.a.ag
    public final Object g(Object obj, h.c.e eVar) throws Throwable {
        av avVarJ;
        Object objH = H(obj, true);
        if (!(objH instanceof r)) {
            return h.ab.f48028a;
        }
        t.d(objH);
        h.g.a.l lVar = this.f51293a;
        if (lVar == null || (avVarJ = al.j(lVar, obj, null)) == null) {
            throw m();
        }
        e.a.h.ad.c(avVarJ, m());
        throw avVarJ;
    }

    @Override // kotlinx.coroutines.a.k, kotlinx.coroutines.a.ag
    public final Object i(Object obj) {
        return H(obj, false);
    }

    @Override // kotlinx.coroutines.a.k
    protected final boolean z() {
        return this.f51331d == a.f51272b;
    }
}
