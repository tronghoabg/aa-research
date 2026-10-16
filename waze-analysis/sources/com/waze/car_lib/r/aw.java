package com.waze.car_lib.r;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20981a;

    public aw() {
        this.f20981a = kotlinx.coroutines.b.ck.b(false);
    }

    public final LiveData a() {
        return FlowLiveDataConversions.asLiveData$default((kotlinx.coroutines.b.k) this.f20981a, (h.c.j) null, 0L, 3, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void b(boolean z) {
        this.f20981a.e(Boolean.valueOf(z));
    }

    public final /* synthetic */ com.waze.ak.o c() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f20981a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (com.waze.ak.o) duVarBuild;
    }

    public final void d(com.waze.ak.f fVar) {
        h.g.b.x.f(fVar, "value");
        ((com.waze.ak.m) this.f20981a).a(fVar);
    }

    public final void e(com.waze.ak.u uVar) {
        h.g.b.x.f(uVar, "value");
        ((com.waze.ak.m) this.f20981a).b(uVar);
    }

    public final void f(com.waze.ak.ak akVar) {
        h.g.b.x.f(akVar, "value");
        ((com.waze.ak.m) this.f20981a).c(akVar);
    }

    public /* synthetic */ aw(com.waze.ak.m mVar) {
        this.f20981a = mVar;
    }
}
