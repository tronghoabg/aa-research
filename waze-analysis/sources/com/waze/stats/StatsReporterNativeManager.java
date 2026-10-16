package com.waze.stats;

import l.a.brf;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class StatsReporterNativeManager extends au {
    private final ax wazeStatsReporter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsReporterNativeManager(ax axVar, com.waze.native_managers.j jVar) {
        super(jVar);
        h.g.b.x.f(axVar, "wazeStatsReporter");
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.wazeStatsReporter = axVar;
    }

    public final native void initNativeLayerNTV();

    public final void reportStats$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_stats_reporter_native_manager(brf brfVar) {
        h.g.b.x.f(brfVar, "payload");
        com.waze.sharedui.utils.o.e(this.wazeStatsReporter, brfVar);
    }

    public final void reportUnauthenticatedStats$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_stats_reporter_native_manager(bri briVar) {
        h.g.b.x.f(briVar, "payload");
        com.waze.sharedui.utils.o.f(this.wazeStatsReporter, briVar);
    }
}
