package com.waze.uid.state_impl.b;

import h.ab;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class g extends u implements h.g.a.l {
    g(Object obj) {
        super(1, obj, n.class, "processAuthorizationResult", "processAuthorizationResult(Lcom/google/android/gms/auth/api/identity/AuthorizationResult;)V", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) obj;
        x.f(dVar, "p0");
        ((n) this.receiver).m(dVar);
        return ab.f48028a;
    }
}
