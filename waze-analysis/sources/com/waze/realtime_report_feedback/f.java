package com.waze.realtime_report_feedback;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReportFeedbackServiceProvider f33522a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33523b;

    f(ReportFeedbackServiceProvider reportFeedbackServiceProvider, int i2) {
        this.f33523b = i2;
        this.f33522a = reportFeedbackServiceProvider;
    }

    @Override // com.waze.realtime_report_feedback.b
    public final void a(int i2) {
        int i3 = this.f33523b;
        ReportFeedbackServiceProvider reportFeedbackServiceProvider = this.f33522a;
        if (i3 != 0) {
            reportFeedbackServiceProvider.onThumbsRequestSuccess(i2);
        } else {
            reportFeedbackServiceProvider.onThumbsRequestSuccess(i2);
        }
    }
}
