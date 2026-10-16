package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ag f31924a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f31925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ag agVar, h.c.e eVar) {
        super(2, eVar);
        this.f31924a = agVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ad adVar = new ad(this.f31924a, eVar);
        adVar.f31925b = obj;
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
        return kotlinx.coroutines.aj.z((kotlinx.coroutines.af) this.f31925b, null, null, new an(this.f31924a, (h.c.e) null, 1), 3);
    }
}
