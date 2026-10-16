package com.waze.br.c;

import com.waze.stats.ax;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.b.p f17401a;

    /* renamed from: b, reason: collision with root package name */
    private final ax f17402b;

    public p(com.waze.br.b.p pVar, ax axVar) {
        h.g.b.x.f(pVar, "searchMateControllerFactory");
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f17401a = pVar;
        this.f17402b = axVar;
    }

    @Override // com.waze.br.c.e
    public final kotlinx.coroutines.b.k a() {
        com.waze.br.b.w wVarA = this.f17401a.a();
        return ai.G(wVarA != null ? new t(wVarA, this.f17402b) : null);
    }
}
