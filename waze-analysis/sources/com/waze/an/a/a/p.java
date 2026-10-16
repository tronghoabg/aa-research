package com.waze.an.a.a;

import com.waze.config.ConfigValues;
import com.waze.navigate.en;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p implements com.waze.an.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final en f14498a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14499b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f14500c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14501d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.be f14502e;

    public p(com.waze.reports_v2.presentation.be beVar, en enVar, com.waze.shared_infra.i.e eVar) {
        kotlinx.coroutines.b.k kVarK;
        h.g.b.x.f(beVar, "config");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(eVar, "logger");
        this.f14502e = beVar;
        this.f14498a = enVar;
        this.f14499b = eVar;
        bn bnVarB = ck.b(h.a.i.h());
        this.f14500c = bnVarB;
        if (beVar.d()) {
            h.g.b.aq aqVar = new h.g.b.aq();
            aqVar.f48105a = enVar.ag().d();
            kVarK = kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.r(bnVarB, beVar.c(), enVar.ag(), new m(aqVar, this, null))), new n(this, null));
        } else {
            eVar.e("FTE is disabled, returning empty flow");
            kVarK = kotlinx.coroutines.b.ai.E(new l(null));
        }
        this.f14501d = kVarK;
    }

    public static final /* synthetic */ void e(p pVar) {
        pVar.f14499b.e("Dismissing FTE insight");
        pVar.f14500c.e(h.a.i.h());
    }

    public static final /* synthetic */ void f(p pVar) {
        pVar.f14499b.e("FTE insight displayed");
        com.waze.reports_v2.presentation.be beVar = pVar.f14502e;
        ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_FTE_SHOWN.d(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j h() {
        return new j(new o(this, 1, null), new o(this, 0));
    }

    @Override // com.waze.an.a.ad
    public final kotlinx.coroutines.b.k a() {
        return this.f14501d;
    }

    @Override // com.waze.an.a.ad
    public final /* synthetic */ void close() {
    }

    public final void g() {
        this.f14500c.e(h.a.i.d(h()));
    }
}
