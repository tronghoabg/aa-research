package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f18267a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f18268b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f18269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ae aeVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f18267a = aeVar;
        this.f18268b = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ad adVar = new ad(this.f18267a, this.f18268b, eVar);
        adVar.f18269c = obj;
        return adVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f18269c;
        ae aeVar = this.f18267a;
        aeVar.f18280k.a("Started with origin:" + aeVar.f18273d + ", localRoute:" + aeVar.f18272c.j() + ", destination:" + aeVar.f18274e);
        aeVar.v(ah.f18283a);
        kotlinx.coroutines.aj.z(afVar, null, null, new ab(aeVar, this.f18268b, null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(aeVar, (h.c.e) null, 1, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(aeVar, null, 0), 3);
        return kotlinx.coroutines.aj.z(afVar, null, null, new ac(aeVar, (h.c.e) null, 2, (char[]) null), 3);
    }
}
