package com.waze.uid.state_impl.b;

import android.content.Context;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.o.t;
import com.waze.authentication.au;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f44606a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AuthorizationRequest f44607b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f44608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(Context context, AuthorizationRequest authorizationRequest, n nVar, h.c.e eVar) {
        super(2, eVar);
        this.f44606a = context;
        this.f44607b = authorizationRequest;
        this.f44608c = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f44606a, this.f44607b, this.f44608c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        t tVarA = new com.google.android.gms.auth.api.identity.a.h(this.f44606a, new com.google.android.gms.auth.api.identity.a()).a(this.f44607b);
        n nVar = this.f44608c;
        tVarA.r(new com.google.firebase.messaging.n(new g(nVar), 9));
        tVarA.o(new au(nVar, 3));
        return ab.f48028a;
    }
}
