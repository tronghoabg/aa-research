package kotlinx.coroutines.b.a;

import java.util.Iterator;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends e {

    /* renamed from: d, reason: collision with root package name */
    private final Iterable f51434d;

    public o(Iterable iterable, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        super(jVar, i2, aVar);
        this.f51434d = iterable;
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final Object a(kotlinx.coroutines.a.ad adVar, h.c.e eVar) {
        af afVar = new af(adVar);
        Iterator it = this.f51434d.iterator();
        while (it.hasNext()) {
            aj.z(adVar, null, null, new n((kotlinx.coroutines.b.k) it.next(), afVar, null), 3);
        }
        return h.ab.f48028a;
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final e b(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return new o(this.f51434d, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.a.e
    public final kotlinx.coroutines.a.af d(kotlinx.coroutines.af afVar) {
        return kotlinx.coroutines.a.ab.b(afVar, this.f51404a, this.f51405b, h());
    }
}
