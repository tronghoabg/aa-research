package com.waze.stats;

import com.google.v.eu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class g {
    private final com.waze.native_managers.j wazeMainLooperDispatcher;

    public g(com.waze.native_managers.j jVar) {
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.wazeMainLooperDispatcher = jVar;
    }

    static final void reportMetricJNI$lambda$0(g gVar, l.b.c cVar) {
        h.g.b.x.d(gVar, "null cannot be cast to non-null type com.waze.stats.MetricsReporterNativeManager");
        h.g.b.x.c(cVar);
        ((MetricsReporterNativeManager) gVar).reportMetric$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_metrics_reporter_native_manager(cVar);
    }

    public final com.waze.native_managers.j getWazeMainLooperDispatcher() {
        return this.wazeMainLooperDispatcher;
    }

    protected final void reportMetricJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "stat");
        try {
            this.wazeMainLooperDispatcher.post(new f(this, (l.b.c) l.b.c.parser().c(bArr), 0));
        } catch (eu unused) {
        }
    }
}
