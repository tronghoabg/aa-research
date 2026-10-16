package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.eo f34355a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f34356b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34357c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.r f34358d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f34359e;

    public cr(com.waze.navigate.eo eoVar, kotlinx.coroutines.b.ch chVar, com.waze.reports_v2.d.j jVar, com.waze.shared_infra.q.r rVar, com.waze.shared_infra.q.e eVar, com.waze.realtime_report_feedback.c cVar) {
        h.g.b.x.f(eoVar, "navigationState");
        h.g.b.x.f(chVar, "zeroSpeedStateFlow");
        h.g.b.x.f(jVar, "statsSender");
        h.g.b.x.f(rVar, "timeUtil");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(cVar, "config");
        this.f34355a = eoVar;
        this.f34356b = chVar;
        this.f34357c = jVar;
        this.f34358d = rVar;
        this.f34359e = eVar;
    }

    public final db a() {
        return new db(this.f34355a, this.f34356b, this.f34357c, this.f34358d, this.f34359e);
    }
}
