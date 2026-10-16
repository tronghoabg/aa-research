package com.waze.car_lib.i.c;

import com.waze.car_lib.b.as;
import com.waze.car_lib.j.ak;
import com.waze.navigate.ao;
import com.waze.navigate.aq;
import com.waze.navigate.gj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.b.e f20096a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.aa f20097b;

    /* renamed from: c, reason: collision with root package name */
    private final aq f20098c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.g f20099d;

    /* renamed from: e, reason: collision with root package name */
    private final gj f20100e;

    /* renamed from: f, reason: collision with root package name */
    private final ao f20101f;

    /* renamed from: g, reason: collision with root package name */
    private final ak f20102g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.j.y f20103h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.c.f f20104i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20105j;

    /* renamed from: k, reason: collision with root package name */
    private final as f20106k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.car_lib.j.a f20107l;

    public g(com.waze.an.b.e eVar, com.waze.map.aa aaVar, aq aqVar, com.waze.car_lib.g gVar, gj gjVar, ao aoVar, ak akVar, com.waze.car_lib.j.y yVar, com.waze.car_lib.c.f fVar, com.waze.shared_infra.o.a aVar, as asVar, com.waze.car_lib.j.a aVar2) {
        h.g.b.x.f(eVar, "insightPolicyFactory");
        h.g.b.x.f(aaVar, "mapColorProvider");
        h.g.b.x.f(aqVar, "currentStreetState");
        h.g.b.x.f(gVar, "bottomPillVisibilityController");
        h.g.b.x.f(gjVar, "trafficStateInterface");
        h.g.b.x.f(aoVar, "averageSpeedCameraStateInterface");
        h.g.b.x.f(akVar, "trafficMeterSelector");
        h.g.b.x.f(yVar, "trafficMeterConfigRepository");
        h.g.b.x.f(fVar, "bottomPillAnalyticsSender");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(asVar, "speedZoneConfig");
        h.g.b.x.f(aVar2, "config");
        this.f20096a = eVar;
        this.f20097b = aaVar;
        this.f20098c = aqVar;
        this.f20099d = gVar;
        this.f20100e = gjVar;
        this.f20101f = aoVar;
        this.f20102g = akVar;
        this.f20103h = yVar;
        this.f20104i = fVar;
        this.f20105j = aVar;
        this.f20106k = asVar;
        this.f20107l = aVar2;
    }

    public final h a() {
        com.waze.car_lib.j.a aVar = this.f20107l;
        com.waze.shared_infra.i.h.i("PillWidget", "creating pill widget incarInsightEnabled=" + aVar.b());
        if (!aVar.b()) {
            return new t(this.f20097b, this.f20098c, this.f20099d, this.f20100e, this.f20101f, this.f20102g, this.f20103h, this.f20106k, this.f20104i);
        }
        return new ai(this.f20096a.a(), this.f20105j);
    }
}
