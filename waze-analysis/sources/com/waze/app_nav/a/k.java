package com.waze.app_nav.a;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends com.waze.shared_infra.coordinators.s implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.w f15150a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f15151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.waze.app_nav.w wVar, com.waze.asks.ab abVar, kotlinx.coroutines.af afVar) {
        super(q.f15158a, afVar);
        h.g.b.x.f(wVar, "mainScreenFlowController");
        h.g.b.x.f(abVar, "wazeAsksCoordinatorAdapter");
        h.g.b.x.f(afVar, "scope");
        this.f15150a = wVar;
        this.f15151b = ck.b(com.waze.app_nav.g.f15205a);
        kotlinx.coroutines.aj.z(afVar, null, null, new i(this, (h.c.e) null, 0), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new c(abVar, this, (h.c.e) null, 2), 3);
    }

    public final LiveData a() {
        return FlowLiveDataConversions.asLiveData$default(this.f15151b, (h.c.j) null, 0L, 3, (Object) null);
    }

    public final void c() {
        this.f15150a.d();
        H(m.f15153a);
    }

    public final void d(String str, String str2, boolean z) {
        h.g.b.x.f(str, "model");
        H(new n(str, str2, z));
    }
}
