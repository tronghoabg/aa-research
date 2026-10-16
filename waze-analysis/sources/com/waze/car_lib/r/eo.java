package com.waze.car_lib.r;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eo {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.b.g f21560a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21561b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21562c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.p.dg f21563d;

    public eo(com.waze.shared_infra.o.a aVar, com.waze.navigate.b.g gVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(gVar, "navigationStatsSender");
        this.f21560a = gVar;
        String strC = aVar.c(R.string.AAOS_UGC_REPORTS_SUBMIT_LOGS, new Object[0]);
        this.f21561b = strC;
        String strC2 = aVar.c(R.string.AAOS_UGC_REPORTS_REPORT_LOGS_MESSAGE, new Object[0]);
        this.f21562c = strC2;
        this.f21563d = new com.waze.car_lib.p.dg(strC, strC2, null, false, new com.waze.car_lib.p.dc(aVar.c(R.string.NO, new Object[0]), false), new com.waze.car_lib.p.dc(aVar.c(R.string.YES, new Object[0]), true), 12);
    }

    public final com.waze.car_lib.p.dg a() {
        return this.f21563d;
    }

    public final void b() {
        this.f21560a.b(com.waze.navigate.b.c.f31043d, this.f21561b, this.f21562c);
    }

    public final void c() {
        this.f21560a.b(com.waze.navigate.b.c.f31041b, this.f21561b, this.f21562c);
    }

    public final void d() {
        this.f21560a.b(com.waze.navigate.b.c.f31044e, this.f21561b, this.f21562c);
    }

    public final void e() {
        this.f21560a.c(this.f21561b, this.f21562c);
    }
}
