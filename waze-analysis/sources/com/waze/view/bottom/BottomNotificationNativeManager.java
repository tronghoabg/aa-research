package com.waze.view.bottom;

import com.waze.main_screen.g.i;
import com.waze.main_screen.g.j;
import com.waze.realtime_report_feedback.ReportFeedbackServiceProvider;
import com.waze.reports_v2.b.ab;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class BottomNotificationNativeManager extends f {
    public static final int $stable = 8;
    private final bm<j> bottomNotificationFlow;
    private final ReportFeedbackServiceProvider reportFeedbackServiceProvider;

    public BottomNotificationNativeManager(ReportFeedbackServiceProvider reportFeedbackServiceProvider) {
        x.f(reportFeedbackServiceProvider, "reportFeedbackServiceProvider");
        this.reportFeedbackServiceProvider = reportFeedbackServiceProvider;
        this.bottomNotificationFlow = bu.e(0, 1, kotlinx.coroutines.a.a.f51272b, 1);
    }

    public final k<j> getNotificationDataFlow() {
        return ai.S(this.bottomNotificationFlow);
    }

    public final native void initNativeLayerNTV();

    /* JADX WARN: Multi-variable type inference failed */
    public final void postLongMessagePoints$third_party_waze_client_android_project_waze_src_main_waze(int i2, int i3) {
        this.reportFeedbackServiceProvider.onPointsAwarded(i3, (i2 < 0 || i2 >= ab.a().size()) ? ab.f34009a : (ab) ab.a().get(i2));
    }

    public final void postNearbyMessage$third_party_waze_client_android_project_waze_src_main_waze(String str, String str2, int i2, int i3) {
        x.f(str, "message");
        x.f(str2, "messageBody");
        i iVar = i.f26396a;
        i iVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : i.f26400e : i.f26399d : i.f26398c : i.f26397b : i.f26396a;
        if (iVar2 == null) {
            iVar2 = i.f26396a;
        }
        this.bottomNotificationFlow.c(new j(str, str2, iVar2, i3));
    }
}
