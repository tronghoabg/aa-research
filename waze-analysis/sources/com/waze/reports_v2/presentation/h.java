package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class h extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35046a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(Object obj, int i2) {
        super(0, obj, com.waze.reports_v2.a.a.a.b.class, "onCancelButtonClicked", "onCancelButtonClicked()V", 0);
        this.f35046a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f35046a;
        if (i2 == 0) {
            ((com.waze.reports_v2.a.a.a.b) this.receiver).e();
            return h.ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 != 1) {
            ((ConversationalReportingNonFteHintStateHolder) obj).finishedShowingHint();
            return h.ab.f48028a;
        }
        ((com.waze.reports_v2.a.a.a.b) obj).f();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.reports_v2.a.a.a.b.class, "onDialogDismissRequest", "onDialogDismissRequest()V", 0);
        this.f35046a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(Object obj, int i2, char[] cArr) {
        super(0, obj, ConversationalReportingNonFteHintStateHolder.class, "finishedShowingHint", "finishedShowingHint()V", 0);
        this.f35046a = i2;
    }
}
