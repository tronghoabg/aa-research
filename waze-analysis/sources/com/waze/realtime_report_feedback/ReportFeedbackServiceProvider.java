package com.waze.realtime_report_feedback;

import com.waze.bg.a.ay;
import com.waze.bg.a.az;
import com.waze.bg.a.bc;
import com.waze.bg.a.bd;
import com.waze.reports_v2.b.ab;
import com.waze.sharedui.f.k;
import h.g.b.x;
import i.b.l.cc;
import i.b.l.cd;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ReportFeedbackServiceProvider extends j {
    private final c feedbackService;
    private final ArrayList<a> pointsHandlers = new ArrayList<>();
    public static final e Companion = new e();
    public static final int $stable = 8;
    private static final h.f<ReportFeedbackServiceProvider> instance$delegate = h.g.a(new d());

    private ReportFeedbackServiceProvider() {
        j.initNativeLayer$default(this, null, 1, null);
        this.feedbackService = new c();
    }

    public static final ReportFeedbackServiceProvider getInstance() {
        return e.a();
    }

    static final ReportFeedbackServiceProvider instance_delegate$lambda$0() {
        return new ReportFeedbackServiceProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onThumbsRequestSuccess(int i2) {
        onPointsAwarded(i2, ab.f34009a);
    }

    public final void addPointsHandler(a aVar) {
        x.f(aVar, "handler");
        this.pointsHandlers.add(aVar);
    }

    public final native void initNativeLayerNTV();

    public final void onPointsAwarded(int i2, ab abVar) {
        x.f(abVar, "source");
        if (i2 > 0) {
            Iterator<T> it = this.pointsHandlers.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(i2, abVar);
            }
        }
    }

    @Override // com.waze.realtime_report_feedback.j
    public void sendThumbsDown(int i2, String str) {
        x.f(str, "alertUuid");
        f fVar = new f(this, 1);
        x.f(str, "alertUuid");
        x.f(fVar, "callback");
        cc ccVarNewBuilder = cd.newBuilder();
        x.e(ccVarNewBuilder, "newBuilder(...)");
        ay ayVarNewBuilder = az.newBuilder();
        ayVarNewBuilder.a(i2);
        ayVarNewBuilder.b(str);
        ccVarNewBuilder.L(ayVarNewBuilder.build());
        cd cdVarBuild = ccVarNewBuilder.build();
        x.e(cdVarBuild, "build(...)");
        k kVarE = com.waze.shared_infra.l.b.e();
        int i3 = com.waze.sharedui.api.a.f38785a;
        kVarE.g(com.waze.sharedui.api.a.B(), cdVarBuild, new com.waze.ac.b.f(fVar, 2));
    }

    @Override // com.waze.realtime_report_feedback.j
    public void sendThumbsUp(int i2, String str) {
        x.f(str, "alertUuid");
        f fVar = new f(this, 0);
        x.f(str, "alertUuid");
        x.f(fVar, "callback");
        cc ccVarNewBuilder = cd.newBuilder();
        x.e(ccVarNewBuilder, "newBuilder(...)");
        bc bcVarNewBuilder = bd.newBuilder();
        bcVarNewBuilder.a(i2);
        bcVarNewBuilder.b(str);
        ccVarNewBuilder.M(bcVarNewBuilder.build());
        cd cdVarBuild = ccVarNewBuilder.build();
        x.e(cdVarBuild, "build(...)");
        k kVarE = com.waze.shared_infra.l.b.e();
        int i3 = com.waze.sharedui.api.a.f38785a;
        kVarE.g(com.waze.sharedui.api.a.C(), cdVarBuild, new com.waze.ac.b.f(fVar, 1));
    }
}
