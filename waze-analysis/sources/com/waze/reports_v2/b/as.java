package com.waze.reports_v2.b;

import com.waze.realtime_report_feedback.ReportFeedbackServiceProvider;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34070a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f34071b;

    /* renamed from: c, reason: collision with root package name */
    private final bq f34072c;

    public as(ReportFeedbackServiceProvider reportFeedbackServiceProvider) {
        h.g.b.x.f(reportFeedbackServiceProvider, "nativeManagerFeedbacks");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ReportPointsProvider");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34070a = eVarD;
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.f34071b = bmVarC;
        this.f34072c = kotlinx.coroutines.b.ai.S(bmVarC);
        reportFeedbackServiceProvider.addPointsHandler(new ar(this));
    }

    @Override // com.waze.reports_v2.b.aq
    public final bq a() {
        return this.f34072c;
    }

    @Override // com.waze.reports_v2.b.aq
    public final void b(ap apVar) {
        h.g.b.x.f(apVar, "feedback");
        if (apVar.a() <= 0) {
            this.f34070a.g("add: Feedback added with zero points, ignoring");
        } else {
            this.f34071b.c(apVar);
        }
    }
}
