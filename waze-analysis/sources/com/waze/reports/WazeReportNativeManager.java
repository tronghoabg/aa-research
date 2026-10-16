package com.waze.reports;

import com.waze.jni.protos.JniProtoConstants;
import com.waze.jni.protos.reports.SosProviders;
import com.waze.native_managers.WazeNativeLooperDispatcher;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class WazeReportNativeManager extends ek {
    private final com.waze.native_managers.c<SosProviders> getSosProvidersCallbackWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeReportNativeManager(com.waze.native_managers.j jVar, WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        super(jVar, wazeNativeLooperDispatcher);
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        h.g.b.x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.getSosProvidersCallbackWrapper = new com.waze.native_managers.c<>();
    }

    public final native int calcAzimuthNTV(int i2, int i3);

    public final void getSosProviders(h.g.a.l<? super SosProviders, h.ab> lVar) {
        h.g.b.x.f(lVar, "callback");
        ek.getSosProviders$default(this, this.getSosProvidersCallbackWrapper.a(lVar), null, 2, null);
    }

    public final native void getSosProvidersNTV(int i2);

    public final native void initNativeLayerNTV();

    public final void onGetSosProviders$third_party_waze_client_android_project_waze_src_main_java_com_waze_reports_isolated_waze_report_native_manager(int i2, SosProviders sosProviders) {
        h.g.b.x.f(sosProviders, "sosProviders");
        h.g.a.l lVarB = this.getSosProvidersCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(sosProviders);
        }
    }

    public final native void reportClosureNTV(int i2, int i3, int i4, int i5);

    public final native void reportRealtimeTrafficNTV(JniProtoConstants.TrafficNotificationResponse trafficNotificationResponse);
}
