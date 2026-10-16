package com.waze.network.d;

import e.a.cm;
import e.a.dk;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends dk {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f32215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(com.waze.uid.f fVar, q qVar) {
        super(fVar);
        this.f32215a = qVar;
    }

    @Override // e.a.dk, com.waze.uid.f
    public final void u(cm cmVar) {
        x.f(cmVar, "headers");
        this.f32215a.f32219c.a("gRPC headers received from server");
        super.u(cmVar);
    }
}
