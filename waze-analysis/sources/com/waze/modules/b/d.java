package com.waze.modules.b;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.waze.config.dh;
import com.waze.navigate.di;
import e.a.bx;
import h.g.b.x;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29819a;

    /* renamed from: b, reason: collision with root package name */
    private final bx f29820b;

    public d(final dh dhVar, final com.waze.stats.b bVar, final Context context, com.waze.shared_infra.i.e eVar) {
        x.f(dhVar, "configuration");
        x.f(bVar, "metricsConfig");
        x.f(context, "context");
        x.f(eVar, "logger");
        this.f29819a = eVar;
        this.f29820b = new b(eVar, new h.g.a.a() { // from class: com.waze.modules.b.c
            @Override // h.g.a.a
            public final Object invoke() {
                return d.a(dhVar, context, bVar, this);
            }
        });
    }

    static final bx a(dh dhVar, Context context, com.waze.stats.b bVar, d dVar) {
        di diVar = new di(dhVar);
        e.a.a.f fVarR = e.a.a.f.r(diVar.e(), diVar.a());
        fVarR.s(context);
        x.f(bVar, "metricsConfig");
        x.f(diVar, "networkConfig");
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_SERVICE, "com.waze.clientevent.WazeAppEventService");
        map.put("method", "reportClientMetricStat");
        HashMap map2 = new HashMap();
        map2.put(HintConstants.AUTOFILL_HINT_NAME, h.a.i.d(map));
        HashMap map3 = new HashMap();
        map3.put("maxAttempts", Double.valueOf(bVar.b()));
        map3.put("initialBackoff", bVar.c());
        map3.put("maxBackoff", bVar.d());
        map3.put("backoffMultiplier", Double.valueOf(bVar.a()));
        map3.put("retryableStatusCodes", h.a.i.l("UNAVAILABLE"));
        map2.put("retryPolicy", map3);
        HashMap map4 = new HashMap();
        x.f(diVar, "networkConfig");
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        map6.put(HintConstants.AUTOFILL_HINT_NAME, h.a.i.d(map5));
        map6.put("timeout", diVar.b() + CmcdData.STREAMING_FORMAT_SS);
        map4.put("methodConfig", h.a.i.i(map2, map6));
        fVarR.c(map4);
        fVarR.d();
        fVarR.f();
        long jC = diVar.c();
        long jD = diVar.d();
        StringBuilder sb = new StringBuilder("Enabling gRPC keepalive with time ");
        sb.append(jC);
        com.waze.shared_infra.i.e eVar = dVar.f29819a;
        sb.append(" seconds and timeout ");
        sb.append(jD);
        sb.append(" seconds");
        eVar.a(sb.toString());
        fVarR.h(jC, TimeUnit.SECONDS);
        fVarR.i(jD, TimeUnit.SECONDS);
        fVarR.j();
        bx bxVarA = fVarR.a();
        x.e(bxVarA, "build(...)");
        return bxVarA;
    }

    public final bx b() {
        return this.f29820b;
    }
}
