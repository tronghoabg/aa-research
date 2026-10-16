package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ao extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38342a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38343b;

    ao(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ao aoVar = new ao((h.c.e) obj3);
        aoVar.f38342a = (com.waze.sharedrive.g.aa) obj;
        aoVar.f38343b = (com.waze.sharedrive.g.aa) obj2;
        return aoVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.sharedrive.g.aa aaVar = (com.waze.sharedrive.g.aa) this.f38342a;
        com.waze.sharedrive.g.aa aaVar2 = (com.waze.sharedrive.g.aa) this.f38343b;
        return aaVar2.d() == com.waze.ui.z.at.f43936d ? com.waze.sharedrive.g.aa.g(aaVar2, aaVar.b()) : aaVar2;
    }
}
