package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class AdEventsReporterNativeManager extends a {
    private final ax wazeStatsReporter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdEventsReporterNativeManager(ax axVar, com.waze.native_managers.j jVar) {
        super(jVar);
        h.g.b.x.f(axVar, "wazeStatsReporter");
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.wazeStatsReporter = axVar;
    }

    public final native void initNativeLayerNTV();

    public final void reportAdEvent$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_ad_events_reporter_native_manager(l.a.s sVar) {
        h.g.b.x.f(sVar, "payload");
        ax axVar = this.wazeStatsReporter;
        h.g.b.x.f(axVar, "<this>");
        h.g.b.x.f(sVar, "payload");
        axVar.d(new ao(sVar));
    }
}
