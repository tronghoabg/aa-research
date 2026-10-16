package com.waze.network.b;

import android.content.Context;
import android.net.ConnectivityManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32099a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.perf.tracer.g f32100b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32101c;

    public v(Context context, com.waze.perf.tracer.g gVar, com.waze.realtime_report_feedback.c cVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(gVar, "perfTracer");
        h.g.b.x.f(cVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f32099a = context;
        this.f32100b = gVar;
        this.f32101c = eVar;
    }

    @Override // com.waze.network.b.u
    public final okhttp3.v a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_NETWORK_V3_DNS_ANDROID_RESOLVER_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        if (!boolB.booleanValue()) {
            return okhttp3.v.f56344b;
        }
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_NETWORK_V3_DNS_TIMEOUT_MS.b();
        h.g.b.x.e(lB, "getValue(...)");
        long j2 = h.o.c.j(lB.longValue(), h.o.d.f48272c);
        com.waze.shared_infra.i.e eVar = this.f32101c;
        eVar.g("using DnsResolver, timeoutSec=" + h.o.a.p(j2));
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f32099a.getSystemService(ConnectivityManager.class);
        h.g.b.x.c(connectivityManager);
        return new f(connectivityManager, j2, this.f32100b, eVar);
    }
}
