package com.waze.closure.domain;

import com.waze.reports_v2.b.ad;
import com.waze.reports_v2.b.ae;
import com.waze.reports_v2.c.Cdo;
import com.waze.reports_v2.c.ck;
import com.waze.reports_v2.c.cl;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f22506a;

    /* renamed from: b, reason: collision with root package name */
    private final Cdo f22507b;

    public j(com.waze.reports_v2.d.j jVar, Cdo cdo) {
        x.f(jVar, "reportingStatsSender");
        x.f(cdo, "reportMenuStatsSender");
        this.f22506a = jVar;
        this.f22507b = cdo;
    }

    @Override // com.waze.closure.domain.i
    public final void a(int i2, int i3) {
        this.f22506a.i(com.waze.reports_v2.d.a.f34554b, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // com.waze.closure.domain.i
    public final void b() {
        this.f22507b.K(new ck(ad.f34020d), new cl(ae.f34026b), false);
    }

    @Override // com.waze.closure.domain.i
    public final void c() {
        this.f22507b.b(new ck(ad.f34020d), new cl(ae.f34026b));
    }

    @Override // com.waze.closure.domain.i
    public final void d() {
        this.f22506a.g();
    }
}
