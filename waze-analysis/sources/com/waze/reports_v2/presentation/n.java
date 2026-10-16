package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35055a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConversationalReportingNonFteHintStateHolder f35056b;

    /* renamed from: c, reason: collision with root package name */
    int f35057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(ConversationalReportingNonFteHintStateHolder conversationalReportingNonFteHintStateHolder, h.c.e eVar) {
        super(eVar);
        this.f35056b = conversationalReportingNonFteHintStateHolder;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35055a = obj;
        this.f35057c |= Integer.MIN_VALUE;
        return this.f35056b.awaitNavigationWithDelay(this);
    }
}
