package com.waze.insights_infra;

import com.waze.ap.b.n;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final n f24700a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24701b;

    /* renamed from: c, reason: collision with root package name */
    private final af f24702c;

    public d(n nVar, ab abVar, com.waze.shared_infra.i.e eVar) {
        x.f(nVar, "insightsServingGrpcService");
        x.f(abVar, "dispatcher");
        x.f(eVar, "logger");
        this.f24700a = nVar;
        this.f24701b = eVar;
        this.f24702c = aj.e(aj.Q().plus(abVar));
    }

    @Override // com.waze.insights_infra.a
    public final void a(l lVar) {
        x.f(lVar, "onResponse");
        aj.z(this.f24702c, null, null, new c(this, lVar, null), 3);
    }
}
