package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ch extends h.c.b.a.g implements h.g.a.t {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21203a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21204b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21205c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ boolean f21206d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f21207e;

    ch(h.c.e eVar) {
        super(6, eVar);
    }

    @Override // h.g.a.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ch chVar = new ch((h.c.e) obj6);
        chVar.f21203a = (ca) obj;
        chVar.f21204b = (cf) obj2;
        chVar.f21205c = (fb) obj3;
        chVar.f21206d = zBooleanValue;
        chVar.f21207e = (com.waze.av.b.n) obj5;
        return chVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new cg((ca) this.f21203a, (cf) this.f21204b, (fb) this.f21205c, this.f21206d, (com.waze.av.b.n) this.f21207e);
    }
}
