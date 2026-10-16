package e.a.e;

import e.a.ee;
import e.a.ef;
import h.ab;
import h.g.a.p;
import h.g.b.am;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f47382a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f47383b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f47384c = "request";

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f47385d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f47386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(k kVar, Object obj, h.c.e eVar) {
        super(2, eVar);
        this.f47383b = kVar;
        this.f47385d = obj;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f47383b, this.f47385d, eVar);
        hVar.f47386e = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws ef {
        am amVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f47382a != 0) {
            amVar = (am) this.f47386e;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            l lVar = (l) this.f47386e;
            am amVar2 = new am();
            this.f47386e = amVar2;
            this.f47382a = 1;
            if (this.f47383b.collect(new g(amVar2, lVar, this.f47385d), this) == aVar) {
                return aVar;
            }
            amVar = amVar2;
        }
        if (amVar.f48101a) {
            return ab.f48028a;
        }
        String str = this.f47384c;
        Object obj2 = this.f47385d;
        throw new ef(ee.f47410j.g("Expected one " + str + " for " + obj2 + " but received none"));
    }
}
