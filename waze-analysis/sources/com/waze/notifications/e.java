package com.waze.notifications;

import com.waze.jni.protos.JniProtoConstants;
import com.waze.reports.WazeReportNativeManager;
import com.waze.reports_v2.c.dh;
import com.waze.reports_v2.c.dj;
import com.waze.reports_v2.c.dk;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements a {
    @Override // com.waze.notifications.a
    public final void a(com.waze.notifications.b.c cVar) {
        WazeReportNativeManager wazeReportNativeManager = (WazeReportNativeManager) r.h(WazeReportNativeManager.class);
        com.waze.notifications.b.c cVar2 = com.waze.notifications.b.c.f32546a;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 2) {
            wazeReportNativeManager.reportRealtimeTraffic(JniProtoConstants.TrafficNotificationResponse.TRAFFIC_VALUE_YES);
            ((dk) r.h(dk.class)).b(new dh(dj.f34410b, null));
        } else if (iOrdinal == 3) {
            wazeReportNativeManager.reportRealtimeTraffic(JniProtoConstants.TrafficNotificationResponse.TRAFFIC_VALUE_NO);
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            wazeReportNativeManager.reportRealtimeTraffic(JniProtoConstants.TrafficNotificationResponse.TRAFFIC_VALUE_NO_ANSWER);
        }
    }
}
