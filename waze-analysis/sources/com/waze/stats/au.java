package com.waze.stats;

import com.google.v.eu;
import l.a.brf;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class au {
    private final com.waze.native_managers.j wazeMainLooperDispatcher;

    public au(com.waze.native_managers.j jVar) {
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.wazeMainLooperDispatcher = jVar;
    }

    static final void reportStatsJNI$lambda$0(au auVar, brf brfVar) {
        h.g.b.x.d(auVar, "null cannot be cast to non-null type com.waze.stats.StatsReporterNativeManager");
        h.g.b.x.c(brfVar);
        ((StatsReporterNativeManager) auVar).reportStats$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_stats_reporter_native_manager(brfVar);
    }

    static final void reportUnauthenticatedStatsJNI$lambda$0(au auVar, bri briVar) {
        h.g.b.x.d(auVar, "null cannot be cast to non-null type com.waze.stats.StatsReporterNativeManager");
        h.g.b.x.c(briVar);
        ((StatsReporterNativeManager) auVar).reportUnauthenticatedStats$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_stats_reporter_native_manager(briVar);
    }

    public final com.waze.native_managers.j getWazeMainLooperDispatcher() {
        return this.wazeMainLooperDispatcher;
    }

    protected final void reportStatsJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "payload");
        try {
            this.wazeMainLooperDispatcher.post(new f(this, (brf) brf.parser().c(bArr), 3));
        } catch (eu unused) {
        }
    }

    protected final void reportUnauthenticatedStatsJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "payload");
        try {
            this.wazeMainLooperDispatcher.post(new f(this, (bri) bri.parser().c(bArr), 2));
        } catch (eu unused) {
        }
    }
}
