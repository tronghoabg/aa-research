package com.waze.shared_infra.r;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class k implements kotlinx.coroutines.b.l, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f37975a;

    k(h.g.a.l lVar) {
        this.f37975a = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        this.f37975a.invoke((q) obj);
        ab abVar = ab.f48028a;
        h.c.a.a aVar = h.c.a.a.f48038a;
        return abVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kotlinx.coroutines.b.l) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(2, this.f37975a, h.g.b.w.class, "suspendConversion0", "waitForLoggedInFromAnotherDeviceError$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/waze/shared_infra/user/UserState$LoginError$LoggedInFromAnotherDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
