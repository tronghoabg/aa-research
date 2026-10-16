package com.waze.app_nav;

import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements com.waze.app_nav.hub.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final w f15427a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.c.a f15428b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f15429c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15430d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f15431e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f15432f;

    public o(w wVar, com.waze.app_nav.c.a aVar, kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(wVar, "flowController");
        h.g.b.x.f(aVar, "featureEntry");
        h.g.b.x.f(afVar, "coroutineScope");
        h.g.b.x.f(eVar, "logger");
        this.f15427a = wVar;
        this.f15428b = aVar;
        this.f15429c = afVar;
        this.f15430d = eVar;
        bn bnVarB = ck.b(com.waze.app_nav.hub.c.a.f15291a);
        this.f15431e = bnVarB;
        this.f15432f = ai.U(bnVarB);
    }

    @Override // com.waze.app_nav.hub.c.b
    public final /* synthetic */ kotlinx.coroutines.b.k a() {
        return this.f15432f;
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void b() {
        this.f15430d.e("Fragment " + ((h) this.f15428b.a()).a().c() + " changed state to NOT_PRESENTED ");
        this.f15431e.e(com.waze.app_nav.hub.c.a.f15293c);
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void c() {
        p pVarA = ((h) this.f15428b.a()).a();
        this.f15430d.e("Fragment " + pVarA.c() + " changed state to PRESENTED");
        this.f15431e.e(com.waze.app_nav.hub.c.a.f15292b);
        aj.y(this.f15429c, null, null, new n(this.f15427a.a(new m(pVarA, new ah(false, null, null, 6))), this, null), 3);
    }

    public final String toString() {
        return "WazeFragmentPresenter(#TODO:Identify here)";
    }
}
