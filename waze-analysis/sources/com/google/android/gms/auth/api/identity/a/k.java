package com.google.android.gms.auth.api.identity.a;

import android.content.Context;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.o.t;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends q {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f4459a;

    /* renamed from: d, reason: collision with root package name */
    private static final u f4460d;

    /* renamed from: c, reason: collision with root package name */
    private final String f4461c;

    static {
        j jVar = new j();
        f4459a = jVar;
        f4460d = new u("Auth.Api.Identity.CredentialSaving.API", jVar);
    }

    public k(Context context, com.google.android.gms.auth.api.identity.q qVar) {
        super(context, f4460d, qVar, p.f4878a);
        this.f4461c = com.google.android.gms.i.a.a.a.a.a();
    }

    public final t a(com.google.android.gms.auth.api.identity.u uVar) {
        com.google.android.gms.auth.api.identity.t tVarA = com.google.android.gms.auth.api.identity.u.a(uVar);
        tVarA.b(this.f4461c);
        com.google.android.gms.auth.api.identity.u uVarA = tVarA.a();
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.b.a.f4641f);
        bmVarB.c(new i(this, uVarA, 0));
        bmVarB.d();
        bmVarB.f(DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE);
        return o(bmVarB.b());
    }
}
