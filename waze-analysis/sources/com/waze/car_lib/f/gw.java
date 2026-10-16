package com.waze.car_lib.f;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gw extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.j.a f19634a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.search.b.a f19635b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.c.m f19636c;

    /* renamed from: d, reason: collision with root package name */
    private final gt f19637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(com.waze.car_lib.j.a aVar, com.waze.car_lib.n.r rVar, com.waze.search.b.a aVar2, com.waze.car_lib.c.m mVar, com.waze.av.b.ah ahVar, kotlinx.coroutines.af afVar, gt gtVar) {
        super(he.f19650a, afVar);
        h.g.b.x.f(aVar, "drivingStatusProvider");
        h.g.b.x.f(rVar, "searchController");
        h.g.b.x.f(aVar2, "venueDataSource");
        h.g.b.x.f(mVar, "analytics");
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(gtVar, "config");
        this.f19634a = aVar;
        this.f19635b = aVar2;
        this.f19636c = mVar;
        this.f19637d = gtVar;
        ahVar.e();
        rVar.c();
    }

    public final void d(String str, int i2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        this.f19636c.a(str, i2);
        H(new hb(new com.waze.car_lib.n.t(str, true, com.waze.car_lib.n.s.f20432a)));
    }

    public final void e(Integer num) {
        H(new gx(num));
    }

    public final void f() {
        H(hd.f19649a);
    }

    public final void g(com.waze.av.b.n nVar, boolean z) {
        h.g.b.x.f(nVar, "place");
        kotlinx.coroutines.aj.z(G(), null, null, new gv(z, this, nVar, null), 3);
    }

    public final void h(String str) {
        h.g.b.x.f(str, "searchTerm");
        this.f19636c.b(str);
    }

    public final void i(com.waze.car_lib.n.v vVar) {
        h.g.b.x.f(vVar, "query");
        H(new hb(vVar));
    }

    public final void j(String str, String str2) {
        H(new hf(str, str2));
    }
}
