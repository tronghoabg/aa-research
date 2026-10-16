package com.waze.uid.state_impl.b;

import android.content.Context;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.waze.uid.b.t;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f44609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AuthorizationRequest f44610b;

    i(n nVar, AuthorizationRequest authorizationRequest) {
        this.f44609a = nVar;
        this.f44610b = authorizationRequest;
    }

    @Override // com.waze.uid.b.t
    public final void a(Context context) {
        x.f(context, "context");
        aj.z(com.waze.uid.b.m.t().d(), null, null, new h(context, this.f44610b, this.f44609a, null), 3);
    }
}
