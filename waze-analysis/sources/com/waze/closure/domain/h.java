package com.waze.closure.domain;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final ClosureNativeManager f22504a;

    /* renamed from: b, reason: collision with root package name */
    private final a f22505b;

    public h(ClosureNativeManager closureNativeManager, a aVar) {
        x.f(closureNativeManager, "nativeManager");
        x.f(aVar, "closureApi");
        this.f22504a = closureNativeManager;
        this.f22505b = aVar;
    }

    @Override // com.waze.closure.domain.g
    public final void a(com.waze.closure.a.a aVar) {
        x.f(aVar, "candidate");
        this.f22505b.a(aVar.d(), aVar.b(), aVar.c());
    }

    @Override // com.waze.closure.domain.g
    public final Object b(h.c.e eVar) {
        return this.f22504a.getClosureCandidates(3, (h.c.e<? super List<com.waze.closure.a.a>>) eVar);
    }
}
