package com.waze.rtalerts;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.rtalerts.ReportLocationProto;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.jni.protos.rtalerts.RtAlertItemList;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class x {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getReportLocation$default(x xVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReportLocation");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        xVar.getReportLocation(lVar);
    }

    static final byte[] getReportLocation$lambda$0(x xVar) {
        h.g.b.x.d(xVar, "null cannot be cast to non-null type com.waze.rtalerts.RtAlertsNativeManager");
        return ((RtAlertsNativeManager) xVar).getReportLocationNTV();
    }

    static final void getReportLocation$lambda$1(h.g.a.l lVar, byte[] bArr) {
        ReportLocationProto reportLocationProto = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                reportLocationProto = (ReportLocationProto) ReportLocationProto.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(reportLocationProto);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRtAlertsOnRoute$default(x xVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRtAlertsOnRoute");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        xVar.getRtAlertsOnRoute(lVar);
    }

    static final byte[] getRtAlertsOnRoute$lambda$0(x xVar) {
        h.g.b.x.d(xVar, "null cannot be cast to non-null type com.waze.rtalerts.RtAlertsNativeManager");
        return ((RtAlertsNativeManager) xVar).getRtAlertsOnRouteNTV();
    }

    static final void getRtAlertsOnRoute$lambda$1(h.g.a.l lVar, byte[] bArr) {
        RtAlertItemList rtAlertItemList = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                rtAlertItemList = (RtAlertItemList) RtAlertItemList.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(rtAlertItemList);
            }
        }
    }

    static final void openAlertPopupJNI$lambda$0(x xVar, RtAlertItem rtAlertItem, int i2) {
        h.g.b.x.d(xVar, "null cannot be cast to non-null type com.waze.rtalerts.RtAlertsNativeManager");
        ((RtAlertsNativeManager) xVar).openAlertPopup(rtAlertItem, i2);
    }

    static final void openPingPopupJNI$lambda$0(x xVar, RtAlertItem rtAlertItem, boolean z, String str, int i2) {
        h.g.b.x.d(xVar, "null cannot be cast to non-null type com.waze.rtalerts.RtAlertsNativeManager");
        ((RtAlertsNativeManager) xVar).openPingPopup(rtAlertItem, z, str, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportAbuse$default(x xVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportAbuse");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        xVar.reportAbuse(i2, i3, lVar);
    }

    static final ab reportAbuse$lambda$0(x xVar, int i2, int i3) {
        h.g.b.x.d(xVar, "null cannot be cast to non-null type com.waze.rtalerts.RtAlertsNativeManager");
        ((RtAlertsNativeManager) xVar).reportAbuseNTV(i2, i3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendComment$default(x xVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendComment");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        xVar.sendComment(i2, lVar);
    }

    static final ab sendComment$lambda$0(x xVar, int i2) {
        h.g.b.x.d(xVar, "null cannot be cast to non-null type com.waze.rtalerts.RtAlertsNativeManager");
        ((RtAlertsNativeManager) xVar).sendCommentNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAndRetrieveReportLocation$default(x xVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAndRetrieveReportLocation");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        xVar.setAndRetrieveReportLocation(lVar);
    }

    static final byte[] setAndRetrieveReportLocation$lambda$0(x xVar) {
        h.g.b.x.d(xVar, "null cannot be cast to non-null type com.waze.rtalerts.RtAlertsNativeManager");
        return ((RtAlertsNativeManager) xVar).setAndRetrieveReportLocationNTV();
    }

    static final void setAndRetrieveReportLocation$lambda$1(h.g.a.l lVar, byte[] bArr) {
        ReportLocationProto reportLocationProto = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                reportLocationProto = (ReportLocationProto) ReportLocationProto.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(reportLocationProto);
            }
        }
    }

    protected final void SafetyAlertAltRouteButtonTapJNI() {
        ((RtAlertsNativeManager) this).SafetyAlertAltRouteButtonTap();
    }

    public void getReportLocation(h.g.a.l<? super ReportLocationProto, ab> lVar) {
        NativeManager.runNativeTask(new t(this, 3), new c(lVar, 5));
    }

    public void getRtAlertsOnRoute(h.g.a.l<? super RtAlertItemList, ab> lVar) {
        NativeManager.runNativeTask(new t(this, 0), new c(lVar, 2));
    }

    public void onAlertReported(int i2, int i3) {
        ((RtAlertsNativeManager) this).onAlertReportedNTV(i2, i3);
    }

    protected final void openAlertPopupJNI(byte[] bArr, final int i2) {
        h.g.b.x.f(bArr, "alertData");
        try {
            final RtAlertItem rtAlertItem = (RtAlertItem) RtAlertItem.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.rtalerts.s
                @Override // java.lang.Runnable
                public final void run() {
                    x.openAlertPopupJNI$lambda$0(this.f35150a, rtAlertItem, i2);
                }
            });
        } catch (eu unused) {
        }
    }

    protected final void openPingPopupJNI(byte[] bArr, final boolean z, final String str, final int i2) {
        h.g.b.x.f(bArr, "alertData");
        try {
            final RtAlertItem rtAlertItem = (RtAlertItem) RtAlertItem.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.rtalerts.v
                @Override // java.lang.Runnable
                public final void run() {
                    x.openPingPopupJNI$lambda$0(this.f35158a, rtAlertItem, z, str, i2);
                }
            });
        } catch (eu unused) {
        }
    }

    public void reportAbuse(final int i2, final int i3, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.rtalerts.u
            @Override // com.waze.hw
            public final Object a() {
                x.reportAbuse$lambda$0(this.f35155a, i2, i3);
                return null;
            }
        }, lVar != null ? new c(lVar, 3) : null);
    }

    public void sendComment(int i2, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new w(this, i2, 0), lVar != null ? new c(lVar, 6) : null);
    }

    public void setAndRetrieveReportLocation(h.g.a.l<? super ReportLocationProto, ab> lVar) {
        NativeManager.runNativeTask(new t(this, 2), new c(lVar, 4));
    }

    public final void getReportLocation() {
        getReportLocation$default(this, null, 1, null);
    }

    public final void getRtAlertsOnRoute() {
        getRtAlertsOnRoute$default(this, null, 1, null);
    }

    public final void setAndRetrieveReportLocation() {
        setAndRetrieveReportLocation$default(this, null, 1, null);
    }

    public final void reportAbuse(int i2, int i3) {
        reportAbuse$default(this, i2, i3, null, 4, null);
    }

    public final void sendComment(int i2) {
        sendComment$default(this, i2, null, 2, null);
    }
}
