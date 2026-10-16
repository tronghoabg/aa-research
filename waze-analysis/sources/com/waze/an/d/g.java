package com.waze.an.d;

import com.waze.R;
import com.waze.ab.z;
import com.waze.an.a.u;
import com.waze.an.c.q;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final b f14838a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14839b;

    public g(b bVar, com.waze.shared_infra.o.a aVar, e eVar) {
        x.f(bVar, "notificationInsightsService");
        x.f(aVar, "stringProvider");
        x.f(eVar, "config");
        this.f14838a = bVar;
        this.f14839b = aVar;
    }

    @Override // com.waze.an.d.f
    public final void a(u uVar) {
        x.f(uVar, "thankYouId");
        String strC = this.f14839b.c(R.string.WAZE_ASKS_THANKS_MESSAGE, new Object[0]);
        Integer numValueOf = Integer.valueOf(R.drawable.icon_report_check);
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_THANK_YOU_TIMEOUT_SECONDS.b();
        x.e(lB, "getValue(...)");
        q.b(this.f14838a, uVar, new com.waze.an.a.k(strC, null, numValueOf, new com.waze.an.a.j(h.o.c.j(lB.longValue(), h.o.d.f48273d), new z(4), null), h.a.i.h()), null, null, 24);
    }
}
