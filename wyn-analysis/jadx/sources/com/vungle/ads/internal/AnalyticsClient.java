package com.vungle.ads.internal;

import android.os.Build;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import r9.RunnableC3954k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AnalyticsClient;", "", "<init>", "()V", "Lef/C;", "report", "com/vungle/ads/internal/w", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class AnalyticsClient {

    /* renamed from: e, reason: collision with root package name */
    public static VungleApiClient f32897e;

    /* renamed from: f, reason: collision with root package name */
    public static com.vungle.ads.internal.executor.j f32898f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f32899g;

    @NotNull
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedBlockingQueue f32893a = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedBlockingQueue f32894b = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedBlockingQueue f32895c = new LinkedBlockingQueue();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedBlockingQueue f32896d = new LinkedBlockingQueue();

    /* renamed from: h, reason: collision with root package name */
    public static int f32900h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f32901i = true;

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicBoolean f32902j = new AtomicBoolean(false);

    private AnalyticsClient() {
    }

    public static void a(AnalyticsClient analyticsClient, t1 t1Var, com.vungle.ads.internal.util.s sVar) throws Throwable {
        analyticsClient.a(t1Var, sVar, t1Var.f33018b);
    }

    public static final void b(Sdk.SDKError.Reason reason, String message, com.vungle.ads.internal.util.s sVar) {
        AbstractC3340k.e(reason, "$reason");
        AbstractC3340k.e(message, "$message");
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (f32900h != 1) {
                try {
                    Sdk.SDKError.Builder builderA = a(reason, message, sVar);
                    LinkedBlockingQueue linkedBlockingQueue = f32893a;
                    linkedBlockingQueue.put(builderA);
                    boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new z(reason, message, builderA));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e7) {
                    boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError", e7);
                }
            }
        }
    }

    private final synchronized void report() {
        VungleApiClient vungleApiClient;
        VungleApiClient vungleApiClient2;
        try {
            if (f32900h != 1) {
                LinkedBlockingQueue linkedBlockingQueue = f32893a;
                if (linkedBlockingQueue.size() > 0) {
                    boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                    StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    sbA.append(linkedBlockingQueue.size());
                    sbA.append(" errors");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
                    LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
                    linkedBlockingQueue.drainTo(linkedBlockingQueue2);
                    if (!linkedBlockingQueue2.isEmpty() && (vungleApiClient2 = f32897e) != null) {
                        vungleApiClient2.a(linkedBlockingQueue2, new x(linkedBlockingQueue2));
                    }
                }
            }
            if (f32899g) {
                LinkedBlockingQueue linkedBlockingQueue3 = f32894b;
                if (linkedBlockingQueue3.size() > 0) {
                    boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                    StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    sbA2.append(linkedBlockingQueue3.size());
                    sbA2.append(" metrics");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA2.toString());
                    LinkedBlockingQueue linkedBlockingQueue4 = new LinkedBlockingQueue();
                    linkedBlockingQueue3.drainTo(linkedBlockingQueue4);
                    if (!linkedBlockingQueue4.isEmpty() && (vungleApiClient = f32897e) != null) {
                        vungleApiClient.a(linkedBlockingQueue4, new y(linkedBlockingQueue4));
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void c(Sdk.SDKError.Reason reason, String message, com.vungle.ads.internal.util.s sVar) {
        com.vungle.ads.internal.executor.j jVar;
        AbstractC3340k.e(reason, "reason");
        AbstractC3340k.e(message, "message");
        try {
            jVar = f32898f;
        } catch (Exception e7) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError " + reason + ", " + message + ", " + sVar, e7);
        }
        if (jVar != null) {
            jVar.execute(new RunnableC3954k(reason, message, sVar, 5));
        } else {
            f32895c.put(a(reason, message, sVar));
        }
    }

    public final synchronized void a(VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.j executor, int i5, boolean z2) {
        try {
            AbstractC3340k.e(vungleApiClient, "vungleApiClient");
            AbstractC3340k.e(executor, "executor");
            f32900h = t.a(i5);
            f32899g = z2;
            if (i5 == u.a(3)) {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.u.f33874a = true;
            } else if (i5 == u.a(2) || i5 == u.a(1)) {
                boolean z11 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.u.f33874a = false;
            }
            if (f32902j.getAndSet(true)) {
                boolean z12 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "AnalyticsClient already initialized");
                return;
            }
            f32898f = executor;
            f32897e = vungleApiClient;
            try {
                LinkedBlockingQueue linkedBlockingQueue = f32895c;
                if (!linkedBlockingQueue.isEmpty()) {
                    linkedBlockingQueue.drainTo(f32893a);
                }
            } catch (Exception e7) {
                boolean z13 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingErrors to errors queue.", e7);
            }
            try {
                LinkedBlockingQueue linkedBlockingQueue2 = f32896d;
                if (!linkedBlockingQueue2.isEmpty()) {
                    linkedBlockingQueue2.drainTo(f32894b);
                }
            } catch (Exception e10) {
                boolean z14 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingMetrics to metrics queue.", e10);
            }
            if (f32901i) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Bb.a(executor, 3), 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Sdk.SDKMetric.SDKMetricType metricType, long j8, com.vungle.ads.internal.util.s sVar, String str) {
        Sdk.SDKMetric.SDKMetricType sDKMetricType;
        long j10;
        com.vungle.ads.internal.util.s sVar2;
        String str2;
        com.vungle.ads.internal.executor.j jVar;
        AbstractC3340k.e(metricType, "metricType");
        try {
            jVar = f32898f;
        } catch (Exception e7) {
            e = e7;
            sDKMetricType = metricType;
            j10 = j8;
            sVar2 = sVar;
            str2 = str;
        }
        if (jVar == null) {
            f32896d.put(a(metricType, j8, sVar, str));
            return;
        }
        sDKMetricType = metricType;
        j10 = j8;
        sVar2 = sVar;
        str2 = str;
        try {
            jVar.execute(new Yc.b(sDKMetricType, j10, sVar2, str2));
        } catch (Exception e10) {
            e = e10;
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetric " + sDKMetricType + ", " + j10 + ", " + sVar2 + ", " + str2, e);
        }
    }

    public static final void b(Sdk.SDKMetric.SDKMetricType metricType, long j8, com.vungle.ads.internal.util.s sVar, String str) {
        AbstractC3340k.e(metricType, "$metricType");
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (f32899g) {
                try {
                    Sdk.SDKMetric.Builder builderA = a(metricType, j8, sVar, str);
                    LinkedBlockingQueue linkedBlockingQueue = f32894b;
                    linkedBlockingQueue.put(builderA);
                    boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new a0(metricType, j8, sVar, builderA));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e7) {
                    boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetrics", e7);
                }
            }
        }
    }

    public static final void a(com.vungle.ads.internal.executor.j executor) {
        AbstractC3340k.e(executor, "$executor");
        executor.execute(new Rc.b(5));
    }

    public static final void a() {
        INSTANCE.report();
    }

    public static Sdk.SDKError.Builder a(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        String strL;
        String strG;
        String strH;
        String strC;
        String strM;
        String strD;
        String string;
        String strI;
        Long lA;
        Boolean boolB;
        Boolean boolF;
        Boolean boolK;
        String strE;
        h hVarD;
        Sdk.SDKError.Builder builderNewBuilder = Sdk.SDKError.newBuilder();
        String str2 = Build.MANUFACTURER;
        Sdk.SDKError.Builder at = builderNewBuilder.setOs("Amazon".equals(str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str2).setModel(Build.MODEL).setReason(reason).setMessage(str).setAt(System.currentTimeMillis());
        String str3 = "";
        if (sVar == null || (strL = sVar.l()) == null) {
            strL = "";
        }
        Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(strL);
        if (sVar == null || (strG = sVar.g()) == null) {
            strG = "";
        }
        Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(strG);
        if (sVar == null || (strH = sVar.h()) == null) {
            strH = "";
        }
        Sdk.SDKError.Builder eventId = creativeId.setEventId(strH);
        if (sVar == null || (strC = sVar.c()) == null) {
            strC = "";
        }
        Sdk.SDKError.Builder adSource = eventId.setAdSource(strC);
        if (sVar == null || (strM = sVar.m()) == null) {
            strM = "";
        }
        Sdk.SDKError.Builder vmVersion = adSource.setVmVersion(strM);
        if (sVar == null || (strD = sVar.j()) == null) {
            strD = com.vungle.ads.internal.network.d0.d();
        }
        Sdk.SDKError.Builder mediationName = vmVersion.setMediationName(strD);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        Sdk.SDKError.Builder appState = mediationName.setAppState(com.vungle.ads.internal.util.a.a() ? 0L : 2L);
        if (sVar == null || (hVarD = sVar.d()) == null || (string = hVarD.toString()) == null) {
            string = "";
        }
        Sdk.SDKError.Builder adState = appState.setAdState(string);
        if (sVar == null || (strI = sVar.i()) == null) {
            strI = "";
        }
        Sdk.SDKError.Builder experiments = adState.setExperiments(strI);
        if (sVar != null && (strE = sVar.e()) != null) {
            str3 = strE;
        }
        Sdk.SDKError.Builder adapterAdFormat = experiments.setAdapterAdFormat(str3);
        if (sVar != null && (boolK = sVar.k()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(boolK.booleanValue());
        }
        if (sVar != null && (boolF = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(boolF.booleanValue());
        }
        if (sVar != null && (boolB = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(boolB.booleanValue());
        }
        if (sVar != null && (lA = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(lA.longValue());
        }
        AbstractC3340k.d(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    public static /* synthetic */ void a(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j8, com.vungle.ads.internal.util.s sVar, String str, int i5) {
        if ((i5 & 2) != 0) {
            j8 = 0;
        }
        analyticsClient.c(sDKMetricType, j8, (i5 & 4) != 0 ? null : sVar, (i5 & 8) != 0 ? null : str);
    }

    public static Sdk.SDKMetric.Builder a(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j8, com.vungle.ads.internal.util.s sVar, String str) {
        String strL;
        String strG;
        String strH;
        String strD;
        String strC;
        String strM;
        String string;
        String strI;
        Long lA;
        Boolean boolB;
        Boolean boolF;
        Boolean boolK;
        String strE;
        h hVarD;
        Sdk.SDKMetric.Builder value = Sdk.SDKMetric.newBuilder().setType(sDKMetricType).setValue(j8);
        String str2 = Build.MANUFACTURER;
        Sdk.SDKMetric.Builder osVersion = value.setMake(str2).setModel(Build.MODEL).setOs("Amazon".equals(str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str3 = "";
        if (sVar == null || (strL = sVar.l()) == null) {
            strL = "";
        }
        Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(strL);
        if (sVar == null || (strG = sVar.g()) == null) {
            strG = "";
        }
        Sdk.SDKMetric.Builder creativeId = placementReferenceId.setCreativeId(strG);
        if (sVar == null || (strH = sVar.h()) == null) {
            strH = "";
        }
        Sdk.SDKMetric.Builder eventId = creativeId.setEventId(strH);
        if (str == null) {
            str = "";
        }
        Sdk.SDKMetric.Builder meta = eventId.setMeta(str);
        if (sVar == null || (strD = sVar.j()) == null) {
            strD = com.vungle.ads.internal.network.d0.d();
        }
        Sdk.SDKMetric.Builder mediationName = meta.setMediationName(strD);
        if (sVar == null || (strC = sVar.c()) == null) {
            strC = "";
        }
        Sdk.SDKMetric.Builder adSource = mediationName.setAdSource(strC);
        if (sVar == null || (strM = sVar.m()) == null) {
            strM = "";
        }
        Sdk.SDKMetric.Builder vmVersion = adSource.setVmVersion(strM);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        Sdk.SDKMetric.Builder appState = vmVersion.setAppState(com.vungle.ads.internal.util.a.a() ? 0L : 2L);
        if (sVar == null || (hVarD = sVar.d()) == null || (string = hVarD.toString()) == null) {
            string = "";
        }
        Sdk.SDKMetric.Builder adState = appState.setAdState(string);
        if (sVar == null || (strI = sVar.i()) == null) {
            strI = "";
        }
        Sdk.SDKMetric.Builder experiments = adState.setExperiments(strI);
        if (sVar != null && (strE = sVar.e()) != null) {
            str3 = strE;
        }
        Sdk.SDKMetric.Builder adapterAdFormat = experiments.setAdapterAdFormat(str3);
        if (sVar != null && (boolK = sVar.k()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(boolK.booleanValue());
        }
        if (sVar != null && (boolF = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(boolF.booleanValue());
        }
        if (sVar != null && (boolB = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(boolB.booleanValue());
        }
        if (sVar != null && (lA = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(lA.longValue());
        }
        AbstractC3340k.d(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    public static void a(AnalyticsClient analyticsClient, m2 singleValueMetric, com.vungle.ads.internal.util.s sVar, int i5) throws Throwable {
        AnalyticsClient analyticsClient2;
        com.vungle.ads.internal.util.s sVar2 = (i5 & 2) != 0 ? null : sVar;
        String strA = (i5 & 4) != 0 ? singleValueMetric.a() : null;
        synchronized (analyticsClient) {
            try {
                AbstractC3340k.e(singleValueMetric, "singleValueMetric");
                analyticsClient2 = analyticsClient;
                try {
                    analyticsClient2.c(singleValueMetric.b(), singleValueMetric.c(), sVar2, strA);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                analyticsClient2 = analyticsClient;
            }
        }
    }

    public final synchronized void a(m2 singleValueMetric, com.vungle.ads.internal.util.s sVar, String str) throws Throwable {
        try {
            try {
                AbstractC3340k.e(singleValueMetric, "singleValueMetric");
                c(singleValueMetric.b(), singleValueMetric.c(), sVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static void a(AnalyticsClient analyticsClient, s1 s1Var, com.vungle.ads.internal.util.s sVar) throws Throwable {
        AnalyticsClient analyticsClient2;
        String strA = s1Var.a();
        synchronized (analyticsClient) {
            try {
                if (s1Var.d()) {
                    analyticsClient2 = analyticsClient;
                } else {
                    try {
                        synchronized (analyticsClient) {
                            try {
                                analyticsClient2 = analyticsClient;
                                try {
                                    analyticsClient2.c(s1Var.b(), s1Var.c(), sVar, strA);
                                    s1Var.e();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                analyticsClient2 = analyticsClient;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                return;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        throw th;
    }

    public static void a(AnalyticsClient analyticsClient, n2 timeIntervalMetric, com.vungle.ads.internal.util.s sVar, int i5) throws Throwable {
        AnalyticsClient analyticsClient2;
        com.vungle.ads.internal.util.s sVar2 = (i5 & 2) != 0 ? null : sVar;
        String strA = (i5 & 4) != 0 ? timeIntervalMetric.a() : null;
        synchronized (analyticsClient) {
            try {
                AbstractC3340k.e(timeIntervalMetric, "timeIntervalMetric");
                analyticsClient2 = analyticsClient;
                try {
                    analyticsClient2.c(timeIntervalMetric.b(), timeIntervalMetric.c(), sVar2, strA);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                analyticsClient2 = analyticsClient;
            }
        }
    }

    public final synchronized void a(n2 timeIntervalMetric, com.vungle.ads.internal.util.s sVar, String str) throws Throwable {
        try {
            try {
                AbstractC3340k.e(timeIntervalMetric, "timeIntervalMetric");
                c(timeIntervalMetric.b(), timeIntervalMetric.c(), sVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void a(t1 oneShotTimeIntervalMetric, com.vungle.ads.internal.util.s sVar, String str) throws Throwable {
        try {
            try {
                AbstractC3340k.e(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
                if (!oneShotTimeIntervalMetric.f()) {
                    synchronized (this) {
                        try {
                            try {
                                c(oneShotTimeIntervalMetric.b(), oneShotTimeIntervalMetric.c(), sVar, str);
                                oneShotTimeIntervalMetric.g();
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
