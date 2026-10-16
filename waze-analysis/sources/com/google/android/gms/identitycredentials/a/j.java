package com.google.android.gms.identitycredentials.a;

import android.content.Context;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.q;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.p;
import com.google.android.gms.identitycredentials.w;
import com.google.android.gms.o.t;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends q implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5515a = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final e f5516c;

    /* renamed from: d, reason: collision with root package name */
    private static final u f5517d;

    static {
        e eVar = new e();
        f5516c = eVar;
        f5517d = new u("IdentityCredentials.API", eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context, f5517d, com.google.android.gms.common.api.f.f4696g, com.google.android.gms.common.api.p.f4878a);
        x.f(context, "context");
    }

    @Override // com.google.android.gms.identitycredentials.p
    public final t a(com.google.android.gms.identitycredentials.b bVar) {
        x.f(bVar, "request");
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.j.a.f5554f);
        bmVarB.c(new d(bVar, 3));
        bmVarB.f(32708);
        t tVarQ = q(bmVarB.b());
        x.e(tVarQ, "doWrite(...)");
        return tVarQ;
    }

    @Override // com.google.android.gms.identitycredentials.p
    public final t b(com.google.android.gms.identitycredentials.g gVar) {
        x.f(gVar, "request");
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.j.a.f5555g);
        bmVarB.c(new d(gVar, 2));
        bmVarB.f(32704);
        t tVarQ = q(bmVarB.b());
        x.e(tVarQ, "doWrite(...)");
        return tVarQ;
    }

    @Override // com.google.android.gms.identitycredentials.p
    public final t c(GetCredentialRequest getCredentialRequest) {
        x.f(getCredentialRequest, "request");
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.j.a.f5549a);
        bmVarB.c(new d(getCredentialRequest, 1));
        bmVarB.f(32701);
        t tVarO = o(bmVarB.b());
        x.e(tVarO, "doRead(...)");
        return tVarO;
    }

    @Override // com.google.android.gms.identitycredentials.p
    public final t d(w wVar) {
        x.f(wVar, "request");
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.j.a.f5559k);
        bmVarB.c(new d(wVar, 0));
        bmVarB.f(32709);
        t tVarQ = q(bmVarB.b());
        x.e(tVarQ, "doWrite(...)");
        return tVarQ;
    }
}
