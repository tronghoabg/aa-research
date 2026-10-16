package com.waze.rtalerts;

import com.google.android.gms.common.api.internal.z;
import com.waze.NativeManager;
import com.waze.c.e.cd;
import com.waze.c.e.ce;
import com.waze.jni.protos.rtalerts.RtAlertItem;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class RtAlertsNativeManager extends x {
    private static volatile RtAlertsNativeManager instance;
    private final com.waze.main_screen.ab.i popupsBridgeCompat = ((com.waze.main_screen.ab.h) com.waze.web.r.h(com.waze.main_screen.ab.h.class)).a();
    private final ce openAlternativeRoutesService = (ce) com.waze.web.r.h(ce.class);

    /* JADX INFO: Access modifiers changed from: private */
    public native RtAlertsCommentData[] GetRtAlertsCommentNTV(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PostCommentNTV, reason: merged with bridge method [inline-methods] */
    public native void lambda$postComment$0(int i2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean PostCommentValidateNTV(int i2);

    public static synchronized RtAlertsNativeManager getInstance() {
        if (instance == null) {
            instance = new RtAlertsNativeManager();
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native MapProblem[] getMapProblemsNTV();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportMapIssueNTV, reason: merged with bridge method [inline-methods] */
    public native void lambda$reportMapIssue$0(String str, int i2, boolean z);

    void SafetyAlertAltRouteButtonTap() {
        this.openAlternativeRoutesService.c(new cd());
    }

    public native String formatDistanceNTV(int i2);

    public void getAlertsCommentData(int i2, p pVar) {
        NativeManager.Post(new m(this, i2, pVar));
    }

    public void getMapProblems(q qVar) {
        NativeManager.Post(new n(this, qVar));
    }

    public native String getRelativeTimeNTV(long j2);

    protected native byte[] getReportLocationNTV();

    protected native byte[] getRtAlertsOnRouteNTV();

    public native void initNativeLayerNTV();

    protected native void onAlertReportedNTV(int i2, int i3);

    void openAlertPopup(RtAlertItem rtAlertItem, int i2) {
        this.popupsBridgeCompat.b(new com.waze.main_screen.ab.a(rtAlertItem, i2));
    }

    void openPingPopup(RtAlertItem rtAlertItem, boolean z, String str, int i2) {
        this.popupsBridgeCompat.b(new com.waze.main_screen.ab.e(rtAlertItem, z, str, i2));
    }

    public void postComment(int i2, String str) {
        NativeManager.Post(new z(this, i2, str, 4));
    }

    public void postCommentValidate(int i2, r rVar) {
        NativeManager.Post(new o(this, i2, rVar));
    }

    protected native void reportAbuseNTV(int i2, int i3);

    public void reportMapIssue(String str, int i2, boolean z) {
        NativeManager.Post(new com.waze.config.i(this, str, i2, z, 1));
    }

    protected native void sendCommentNTV(int i2);

    protected native byte[] setAndRetrieveReportLocationNTV();
}
