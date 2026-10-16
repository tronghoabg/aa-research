package com.waze.stats;

import com.google.v.eu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a {
    private final com.waze.native_managers.j wazeMainLooperDispatcher;

    public a(com.waze.native_managers.j jVar) {
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.wazeMainLooperDispatcher = jVar;
    }

    static final void reportAdEventJNI$lambda$0(a aVar, l.a.s sVar) {
        h.g.b.x.d(aVar, "null cannot be cast to non-null type com.waze.stats.AdEventsReporterNativeManager");
        h.g.b.x.c(sVar);
        ((AdEventsReporterNativeManager) aVar).reportAdEvent$third_party_waze_client_android_project_waze_src_main_java_com_waze_stats_isolated_ad_events_reporter_native_manager(sVar);
    }

    public final com.waze.native_managers.j getWazeMainLooperDispatcher() {
        return this.wazeMainLooperDispatcher;
    }

    protected final void reportAdEventJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "payload");
        try {
            this.wazeMainLooperDispatcher.post(new f(this, (l.a.s) l.a.s.parser().c(bArr), 1));
        } catch (eu unused) {
        }
    }
}
