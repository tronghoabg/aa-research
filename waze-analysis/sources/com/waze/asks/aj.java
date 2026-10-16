package com.waze.asks;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj implements w {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ap.b.n f15502a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15503b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f15504c;

    public aj(com.waze.ap.b.n nVar, kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(nVar, "insightsServingGrpcService");
        h.g.b.x.f(abVar, "dispatcher");
        h.g.b.x.f(eVar, "logger");
        this.f15502a = nVar;
        this.f15503b = eVar;
        this.f15504c = kotlinx.coroutines.aj.e(kotlinx.coroutines.aj.Q().plus(abVar));
    }

    @Override // com.waze.asks.w
    public final void a(i iVar, String str, h.g.a.l lVar) {
        h.g.b.x.f(iVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(str, "insightId");
        h.g.b.x.f(lVar, "onResponse");
        kotlinx.coroutines.aj.z(this.f15504c, null, null, new ai(this, lVar, str, iVar, null), 3);
    }
}
