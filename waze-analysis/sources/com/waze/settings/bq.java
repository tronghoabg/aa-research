package com.waze.settings;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bq implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f36897a;

    public /* synthetic */ bq(int i2) {
        this.f36897a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f36897a) {
            case 0:
                return br.a((org.a.d.g.a) obj);
            case 1:
                i.b.l.cd cdVar = (i.b.l.cd) obj;
                int i2 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar, "it");
                return cdVar.getUpdateBannersResponse();
            case 2:
                i.b.l.cd cdVar2 = (i.b.l.cd) obj;
                int i3 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar2, "it");
                return cdVar2.getListBannersResponse();
            case 3:
                i.b.l.cd cdVar3 = (i.b.l.cd) obj;
                int i4 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar3, "it");
                return cdVar3.getUpdateBannersResponse();
            case 4:
                i.b.l.cd cdVar4 = (i.b.l.cd) obj;
                int i5 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar4, "it");
                return cdVar4.getGetMarketplaceNewContentAvailabilityResponse();
            case 5:
                h.g.b.x.f((com.waze.sharedui.web.y) obj, "it");
                return h.ab.f48028a;
            case 6:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar, "$this$module");
                com.waze.sharedrive.g.ac acVar = new com.waze.sharedrive.g.ac(3);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i6 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.sharedui.web.av.class), null, acVar, cVar, listH));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                return h.ab.f48028a;
            default:
                com.waze.sound.an anVar = (com.waze.sound.an) obj;
                h.g.b.x.f(anVar, "it");
                return String.valueOf(anVar.a());
        }
    }
}
