package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32413a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f32414b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f32415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(y yVar, h.c.e eVar) {
        super(2, eVar);
        this.f32414b = yVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        u uVar = new u(this.f32414b, eVar);
        uVar.f32415c = obj;
        return uVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32413a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f32415c;
            h.g.b.aq aqVar = new h.g.b.aq();
            y yVar = this.f32414b;
            t tVar = new t(yVar, aqVar, adVar);
            yVar.a().registerDefaultNetworkCallback(tVar);
            this.f32413a = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new com.waze.nav_connect.b.ab(yVar, tVar, aqVar, 3, (byte[]) null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
