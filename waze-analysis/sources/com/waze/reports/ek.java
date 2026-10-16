package com.waze.reports;

import com.google.v.eu;
import com.waze.jni.protos.JniProtoConstants;
import com.waze.jni.protos.reports.SosProviders;
import com.waze.native_managers.WazeNativeLooperDispatcher;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ek {
    private final com.waze.native_managers.j wazeMainLooperDispatcher;
    private final WazeNativeLooperDispatcher wazeNativeLooperDispatcher;

    public ek(com.waze.native_managers.j jVar, WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        h.g.b.x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.wazeMainLooperDispatcher = jVar;
        this.wazeNativeLooperDispatcher = wazeNativeLooperDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void calcAzimuth$default(ek ekVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calcAzimuth");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        ekVar.calcAzimuth(i2, i3, lVar);
    }

    static final int calcAzimuth$lambda$0(ek ekVar, int i2, int i3) {
        h.g.b.x.d(ekVar, "null cannot be cast to non-null type com.waze.reports.WazeReportNativeManager");
        return ((WazeReportNativeManager) ekVar).calcAzimuthNTV(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getSosProviders$default(ek ekVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSosProviders");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        ekVar.getSosProviders(i2, lVar);
    }

    static final h.ab getSosProviders$lambda$0(ek ekVar, int i2) {
        h.g.b.x.d(ekVar, "null cannot be cast to non-null type com.waze.reports.WazeReportNativeManager");
        ((WazeReportNativeManager) ekVar).getSosProvidersNTV(i2);
        return null;
    }

    static final void onGetSosProvidersJNI$lambda$0(ek ekVar, int i2, SosProviders sosProviders) {
        h.g.b.x.d(ekVar, "null cannot be cast to non-null type com.waze.reports.WazeReportNativeManager");
        h.g.b.x.c(sosProviders);
        ((WazeReportNativeManager) ekVar).onGetSosProviders$third_party_waze_client_android_project_waze_src_main_java_com_waze_reports_isolated_waze_report_native_manager(i2, sosProviders);
    }

    public static /* synthetic */ void reportClosure$default(ek ekVar, int i2, int i3, int i4, int i5, h.g.a.l lVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportClosure");
        }
        if ((i6 & 16) != 0) {
            lVar = null;
        }
        ekVar.reportClosure(i2, i3, i4, i5, lVar);
    }

    static final h.ab reportClosure$lambda$0(ek ekVar, int i2, int i3, int i4, int i5) {
        h.g.b.x.d(ekVar, "null cannot be cast to non-null type com.waze.reports.WazeReportNativeManager");
        ((WazeReportNativeManager) ekVar).reportClosureNTV(i2, i3, i4, i5);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportRealtimeTraffic$default(ek ekVar, JniProtoConstants.TrafficNotificationResponse trafficNotificationResponse, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportRealtimeTraffic");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        ekVar.reportRealtimeTraffic(trafficNotificationResponse, lVar);
    }

    static final h.ab reportRealtimeTraffic$lambda$0(ek ekVar, JniProtoConstants.TrafficNotificationResponse trafficNotificationResponse) {
        h.g.b.x.d(ekVar, "null cannot be cast to non-null type com.waze.reports.WazeReportNativeManager");
        ((WazeReportNativeManager) ekVar).reportRealtimeTrafficNTV(trafficNotificationResponse);
        return null;
    }

    public void calcAzimuth(final int i2, final int i3, h.g.a.l<? super Integer, h.ab> lVar) {
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new h.g.a.a() { // from class: com.waze.reports.eh
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(ek.calcAzimuth$lambda$0(this.f33915a, i2, i3));
            }
        }, lVar);
    }

    public void getSosProviders(final int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new h.g.a.a() { // from class: com.waze.reports.ei
            @Override // h.g.a.a
            public final Object invoke() {
                ek.getSosProviders$lambda$0(this.f33918a, i2);
                return null;
            }
        }, lVar);
    }

    public final com.waze.native_managers.j getWazeMainLooperDispatcher() {
        return this.wazeMainLooperDispatcher;
    }

    public final WazeNativeLooperDispatcher getWazeNativeLooperDispatcher() {
        return this.wazeNativeLooperDispatcher;
    }

    protected final void onGetSosProvidersJNI(final int i2, byte[] bArr) {
        h.g.b.x.f(bArr, "sosProviders");
        try {
            final SosProviders sosProviders = (SosProviders) SosProviders.parser().c(bArr);
            this.wazeMainLooperDispatcher.post(new Runnable() { // from class: com.waze.reports.ef
                @Override // java.lang.Runnable
                public final void run() {
                    ek.onGetSosProvidersJNI$lambda$0(this.f33907a, i2, sosProviders);
                }
            });
        } catch (eu unused) {
        }
    }

    public void reportClosure(final int i2, final int i3, final int i4, final int i5, h.g.a.l<? super h.ab, h.ab> lVar) {
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new h.g.a.a() { // from class: com.waze.reports.eg
            @Override // h.g.a.a
            public final Object invoke() {
                ek.reportClosure$lambda$0(this.f33910a, i2, i3, i4, i5);
                return null;
            }
        }, lVar);
    }

    public void reportRealtimeTraffic(final JniProtoConstants.TrafficNotificationResponse trafficNotificationResponse, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(trafficNotificationResponse, "value");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new h.g.a.a() { // from class: com.waze.reports.ej
            @Override // h.g.a.a
            public final Object invoke() {
                ek.reportRealtimeTraffic$lambda$0(this.f33920a, trafficNotificationResponse);
                return null;
            }
        }, lVar);
    }

    public final void calcAzimuth(int i2, int i3) {
        calcAzimuth$default(this, i2, i3, null, 4, null);
    }

    public final void getSosProviders(int i2) {
        getSosProviders$default(this, i2, null, 2, null);
    }

    public final void reportClosure(int i2, int i3, int i4, int i5) {
        reportClosure$default(this, i2, i3, i4, i5, null, 16, null);
    }

    public final void reportRealtimeTraffic(JniProtoConstants.TrafficNotificationResponse trafficNotificationResponse) {
        h.g.b.x.f(trafficNotificationResponse, "value");
        reportRealtimeTraffic$default(this, trafficNotificationResponse, null, 2, null);
    }
}
