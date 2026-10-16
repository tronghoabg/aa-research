package com.waze.app_nav.hub;

import h.g.b.ar;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements com.waze.app_nav.hub.c.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.a.d.k.b f15210a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15211b;

    public /* synthetic */ a(org.a.d.k.b bVar, int i2) {
        this.f15211b = i2;
        this.f15210a = bVar;
    }

    @Override // com.waze.app_nav.hub.c.e
    public final com.waze.app_nav.hub.c.b a(Object obj) {
        int i2 = this.f15211b;
        if (i2 == 0) {
            com.waze.app_nav.hub.service.a aVar = (com.waze.app_nav.hub.service.a) obj;
            int i3 = d.f15338a;
            h.g.b.x.f(aVar, "model");
            int i4 = ar.f48106a;
            h.g.b.m mVar = new h.g.b.m(k.class);
            org.a.d.k.b bVar = this.f15210a;
            k kVar = (k) bVar.a(mVar, null, null);
            com.waze.app_nav.hub.service.k kVar2 = (com.waze.app_nav.hub.service.k) bVar.a(new h.g.b.m(com.waze.app_nav.hub.service.k.class), null, null);
            com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeServicePresenter");
            h.g.b.x.e(eVarD, "create(...)");
            return new com.waze.app_nav.hub.service.i(aVar, kVar, kVar2, eVarD);
        }
        if (i2 != 1) {
            com.waze.app_nav.hub.b.k kVar3 = (com.waze.app_nav.hub.b.k) obj;
            int i5 = d.f15338a;
            h.g.b.x.f(kVar3, "popup");
            int i6 = ar.f48106a;
            return new com.waze.app_nav.hub.b.q((com.waze.app_nav.hub.b.c) this.f15210a.a(new h.g.b.m(com.waze.app_nav.hub.b.c.class), null, null), kVar3);
        }
        com.waze.app_nav.c.a aVar2 = (com.waze.app_nav.c.a) obj;
        int i7 = com.waze.app_nav.a.f15094a;
        h.g.b.x.f(aVar2, "entry");
        int i8 = ar.f48106a;
        com.waze.app_nav.w wVar = (com.waze.app_nav.w) this.f15210a.a(new h.g.b.m(com.waze.app_nav.w.class), null, null);
        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("WazeFragmentPresenter");
        h.g.b.x.e(eVarD2, "create(...)");
        return new com.waze.app_nav.o(wVar, aVar2, aj.g(aj.e(av.b()), aj.Q()), eVarD2);
    }
}
