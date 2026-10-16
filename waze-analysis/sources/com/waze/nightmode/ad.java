package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ad extends h.c.b.a.g implements h.g.a.s {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32448a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f32449b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f32450c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f32451d;

    ad(h.c.e eVar) {
        super(5, eVar);
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ad adVar = new ad((h.c.e) obj5);
        adVar.f32448a = (h.k) obj;
        adVar.f32449b = zBooleanValue;
        adVar.f32450c = (k) obj3;
        adVar.f32451d = (n) obj4;
        return adVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.k kVar = (h.k) this.f32448a;
        boolean z = this.f32449b;
        return new x((k) this.f32450c, ((Boolean) kVar.a()).booleanValue(), ((Boolean) kVar.b()).booleanValue(), z, (n) this.f32451d);
    }
}
