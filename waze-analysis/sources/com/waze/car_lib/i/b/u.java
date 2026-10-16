package com.waze.car_lib.i.b;

import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bv.i f20030a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f20031b;

    public u(com.waze.bv.i iVar) {
        h.g.b.x.f(iVar, "speedometerController");
        this.f20030a = iVar;
        this.f20031b = ck.b(false);
    }

    public final kotlinx.coroutines.b.k a() {
        com.waze.bv.i iVar = this.f20030a;
        iVar.b();
        return ai.q(iVar.a(), this.f20031b, new t(null, 0));
    }

    public final void b(boolean z) {
        this.f20031b.e(Boolean.valueOf(z));
    }
}
