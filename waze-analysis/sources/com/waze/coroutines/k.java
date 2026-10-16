package com.waze.coroutines;

import h.g.b.x;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23193a;

    public k(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f23193a = eVar;
    }

    @Override // com.waze.coroutines.i
    public final h.c.j a() {
        return av.a().plus(aj.Q()).plus(new j(CoroutineExceptionHandler.f51269c, this, new RuntimeException()));
    }

    @Override // com.waze.coroutines.i
    public final af b() {
        return aj.e(a());
    }
}
