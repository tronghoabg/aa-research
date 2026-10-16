package com.waze.reports_v2.presentation;

import com.waze.navigate.eo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final eo f35053a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.c.ao f35054b;

    public m(eo eoVar, com.waze.reports_v2.c.ao aoVar) {
        h.g.b.x.f(eoVar, "navigationState");
        h.g.b.x.f(aoVar, "config");
        this.f35053a = eoVar;
        this.f35054b = aoVar;
    }

    public final ConversationalReportingNonFteHintStateHolder a() {
        com.waze.reports_v2.c.ao aoVar = this.f35054b;
        if ((true != aoVar.o() ? null : aoVar) != null) {
            return new ConversationalReportingNonFteHintStateHolder(this.f35053a, aoVar);
        }
        return null;
    }
}
