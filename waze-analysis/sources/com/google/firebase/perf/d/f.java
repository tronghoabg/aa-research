package com.google.firebase.perf.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v4.app.n;
import android.support.v7.app.p;
import android.text.TextUtils;
import com.google.android.gms.o.ag;
import com.google.firebase.perf.f.ab;
import com.google.firebase.perf.f.ac;
import com.google.firebase.perf.f.ad;
import com.google.firebase.perf.f.ae;
import com.google.firebase.perf.f.ao;
import com.google.firebase.perf.f.h;
import com.google.firebase.perf.f.i;
import com.google.firebase.perf.f.r;
import com.google.firebase.perf.session.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements com.google.firebase.perf.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10360a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final f f10361b = new f();

    /* renamed from: c, reason: collision with root package name */
    private final Map f10362c;

    /* renamed from: f, reason: collision with root package name */
    private com.google.firebase.e f10365f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.perf.d f10366g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.firebase.installations.d f10367h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.firebase.g.c f10368i;

    /* renamed from: j, reason: collision with root package name */
    private a f10369j;

    /* renamed from: l, reason: collision with root package name */
    private Context f10371l;
    private com.google.firebase.perf.config.a m;
    private d n;
    private com.google.firebase.perf.a.c o;
    private com.google.firebase.perf.f.f p;
    private String q;
    private String r;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f10363d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f10364e = new AtomicBoolean(false);
    private boolean s = false;

    /* renamed from: k, reason: collision with root package name */
    private final ExecutorService f10370k = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f10362c = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static f a() {
        return f10361b;
    }

    public static /* synthetic */ void b(f fVar, r rVar, i iVar) {
        ac acVarNewBuilder = ad.newBuilder();
        acVarNewBuilder.b(rVar);
        fVar.o(acVarNewBuilder, iVar);
    }

    public static /* synthetic */ void e(final f fVar) throws PackageManager.NameNotFoundException {
        String str = "";
        Context contextA = fVar.f10365f.a();
        fVar.f10371l = contextA;
        fVar.q = contextA.getPackageName();
        fVar.m = com.google.firebase.perf.config.a.o();
        fVar.n = new d(fVar.f10371l, new com.google.firebase.perf.e.i(100L, 1L, TimeUnit.MINUTES));
        fVar.o = com.google.firebase.perf.a.c.a();
        fVar.f10369j = new a(fVar.f10368i, fVar.m.q());
        fVar.o.f(new WeakReference(f10361b));
        com.google.firebase.perf.f.f fVarNewBuilder = h.newBuilder();
        fVar.p = fVarNewBuilder;
        fVarNewBuilder.f(fVar.f10365f.d().c());
        com.google.firebase.perf.f.a aVarNewBuilder = com.google.firebase.perf.f.b.newBuilder();
        aVarNewBuilder.a(fVar.q);
        aVarNewBuilder.b(com.google.firebase.perf.a.f10252b);
        Context context = fVar.f10371l;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                str = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        aVarNewBuilder.c(str);
        fVarNewBuilder.c(aVarNewBuilder);
        fVar.f10364e.set(true);
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = fVar.f10363d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final b bVar = (b) concurrentLinkedQueue.poll();
            if (bVar != null) {
                fVar.f10370k.execute(new Runnable() { // from class: com.google.firebase.perf.d.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f fVar2 = this.f10358a;
                        b bVar2 = bVar;
                        fVar2.o(bVar2.f10339a, bVar2.f10340b);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void f(f fVar, ao aoVar, i iVar) {
        ac acVarNewBuilder = ad.newBuilder();
        acVarNewBuilder.d(aoVar);
        fVar.o(acVarNewBuilder, iVar);
    }

    public static /* synthetic */ void g(f fVar, ab abVar, i iVar) {
        ac acVarNewBuilder = ad.newBuilder();
        acVarNewBuilder.c(abVar);
        fVar.o(acVarNewBuilder, iVar);
    }

    private static String m(ae aeVar) {
        if (aeVar.hasTraceMetric()) {
            return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", aeVar.getTraceMetric().getName(), new DecimalFormat("#.####").format(r12.getDurationUs() / 1000.0d));
        }
        if (aeVar.hasNetworkRequestMetric()) {
            ab networkRequestMetric = aeVar.getNetworkRequestMetric();
            return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", networkRequestMetric.getUrl(), networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : "UNKNOWN", new DecimalFormat("#.####").format((networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L) / 1000.0d));
        }
        if (!aeVar.hasGaugeMetric()) {
            return "log";
        }
        r gaugeMetric = aeVar.getGaugeMetric();
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount()));
    }

    private final void n(ad adVar) {
        if (adVar.hasTraceMetric()) {
            this.o.i(com.google.firebase.perf.e.a.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (adVar.hasNetworkRequestMetric()) {
            this.o.i(com.google.firebase.perf.e.a.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(ac acVar, i iVar) {
        if (!l()) {
            Map map = this.f10362c;
            Integer num = (Integer) map.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int iIntValue = num.intValue();
            Integer num2 = (Integer) map.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int iIntValue2 = num2.intValue();
            Integer num3 = (Integer) map.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int iIntValue3 = num3.intValue();
            if (acVar.hasTraceMetric() && iIntValue > 0) {
                map.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            } else if (acVar.hasNetworkRequestMetric() && iIntValue2 > 0) {
                map.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            } else {
                if (!acVar.hasGaugeMetric() || iIntValue3 <= 0) {
                    f10360a.c("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m(acVar), num, num2, num3);
                    return;
                }
                map.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            }
            f10360a.c("Transport is not initialized yet, %s will be queued for to be dispatched later", m(acVar));
            this.f10363d.add(new b(acVar, iVar));
            return;
        }
        p();
        com.google.firebase.perf.f.f fVarMo19742clone = this.p;
        fVarMo19742clone.e(iVar);
        if (acVar.hasTraceMetric() || acVar.hasNetworkRequestMetric()) {
            fVarMo19742clone = fVarMo19742clone.mo19743clone();
            if (this.f10366g == null && l()) {
                this.f10366g = com.google.firebase.perf.d.a();
            }
            com.google.firebase.perf.d dVar = this.f10366g;
            fVarMo19742clone.b(dVar != null ? dVar.b() : Collections.EMPTY_MAP);
        }
        acVar.a(fVarMo19742clone);
        ad adVarBuild = acVar.build();
        if (!this.m.u()) {
            f10360a.g("Performance collection is not enabled, dropping %s", m(adVarBuild));
            return;
        }
        if (!adVarBuild.getApplicationInfo().hasAppInstanceId()) {
            f10360a.j("App Instance ID is null or empty, dropping %s", m(adVarBuild));
            return;
        }
        if (!com.google.firebase.perf.metrics.a.e.d(adVarBuild, this.f10371l)) {
            f10360a.j("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m(adVarBuild));
            return;
        }
        if (!this.n.d(adVarBuild)) {
            n(adVarBuild);
            f10360a.g("Event dropped due to device sampling - %s", m(adVarBuild));
            return;
        }
        if (this.n.c(adVarBuild)) {
            n(adVarBuild);
            f10360a.g("Rate limited (per device) - %s", m(adVarBuild));
            return;
        }
        if (adVarBuild.hasTraceMetric()) {
            com.google.firebase.perf.c.a aVar = f10360a;
            String strM = m(adVarBuild);
            String name = adVarBuild.getTraceMetric().getName();
            boolean zStartsWith = name.startsWith("_st_");
            String str = this.r;
            aVar.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", strM, zStartsWith ? com.google.firebase.f.f.d(str, this.q, name) : com.google.firebase.f.f.b(str, this.q, name));
        } else {
            f10360a.g("Logging %s", m(adVarBuild));
        }
        this.f10369j.a(adVarBuild);
        SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
    }

    private final void p() {
        if (this.m.u()) {
            if (!this.p.a() || this.s) {
                String str = null;
                try {
                    str = (String) ag.g(this.f10367h.a(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    f10360a.e("Task to retrieve Installation Id is interrupted: %s", e2.getMessage());
                } catch (ExecutionException e3) {
                    f10360a.e("Unable to retrieve Installation Id: %s", e3.getMessage());
                } catch (TimeoutException e4) {
                    f10360a.e("Task to retrieve Installation Id is timed out: %s", e4.getMessage());
                }
                if (TextUtils.isEmpty(str)) {
                    f10360a.i("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                } else {
                    this.p.d(str);
                }
            }
        }
    }

    public final void h(com.google.firebase.e eVar, com.google.firebase.installations.d dVar, com.google.firebase.g.c cVar) {
        this.f10365f = eVar;
        this.r = eVar.d().e();
        this.f10367h = dVar;
        this.f10368i = cVar;
        this.f10370k.execute(new p(this, 15));
    }

    public final void i(r rVar, i iVar) {
        this.f10370k.execute(new n(this, rVar, iVar, 5, (byte[]) null));
    }

    public final void j(ab abVar, i iVar) {
        this.f10370k.execute(new n(this, abVar, iVar, 7, (byte[]) null));
    }

    public final void k(ao aoVar, i iVar) {
        this.f10370k.execute(new n(this, aoVar, iVar, 6, (byte[]) null));
    }

    public final boolean l() {
        return this.f10364e.get();
    }

    @Override // com.google.firebase.perf.a.b
    public final void onUpdateAppState(i iVar) {
        this.s = iVar == i.FOREGROUND;
        if (l()) {
            this.f10370k.execute(new p(this, 14));
        }
    }
}
