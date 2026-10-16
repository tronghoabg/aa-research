package com.waze.bw.a.b;

import com.waze.av.b.ah;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    private final ah f17582a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bw.a.a.c f17583b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bw.b.a.p f17584c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f17585d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f17586e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bn.b f17587f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17588g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.bw.b.b.h f17589h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.c.i f17590i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.o.c.c.b f17591j;

    public m(ah ahVar, com.waze.bw.a.a.c cVar, com.waze.bw.b.a.p pVar, com.waze.sharedui.e.g gVar, com.waze.shared_infra.q.e eVar, com.waze.bn.b bVar, com.waze.shared_infra.i.e eVar2, com.waze.bw.b.b.h hVar, com.waze.car_lib.c.i iVar, com.waze.o.c.c.b bVar2) {
        x.f(ahVar, "wazePlaceRepository");
        x.f(cVar, "startStateAutoConfigRepository");
        x.f(pVar, "startStateEtaRepository");
        x.f(gVar, "wazeLocationService");
        x.f(eVar, "wazeClock");
        x.f(bVar, "roamingStateProvider");
        x.f(eVar2, "loggerInterface");
        x.f(hVar, "startStateStatsSender");
        x.f(iVar, "inCarMainScreenStatsReporter");
        x.f(bVar2, "companinioConfig");
        this.f17582a = ahVar;
        this.f17583b = cVar;
        this.f17584c = pVar;
        this.f17585d = gVar;
        this.f17586e = eVar;
        this.f17587f = bVar;
        this.f17588g = eVar2;
        this.f17589h = hVar;
        this.f17590i = iVar;
        this.f17591j = bVar2;
    }

    @Override // com.waze.bw.a.b.k
    public final v a() {
        return new v(this.f17582a, this.f17583b, this.f17584c, this.f17585d, this.f17586e, this.f17587f, this.f17588g, this.f17589h, this.f17590i, this.f17591j);
    }
}
