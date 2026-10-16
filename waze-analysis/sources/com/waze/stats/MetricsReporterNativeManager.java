package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class MetricsReporterNativeManager extends g {
    private final ax wazeStatsReporter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricsReporterNativeManager(ax axVar, com.waze.native_managers.j jVar) {
        super(jVar);
        h.g.b.x.f(axVar, "wazeStatsReporter");
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.wazeStatsReporter = axVar;
    }

    public final native void initNativeLayerNTV();

    public final void reportMetric$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_metrics_reporter_native_manager(l.b.c cVar) {
        h.g.b.x.f(cVar, "stat");
        this.wazeStatsReporter.d(new aq(cVar));
    }
}
