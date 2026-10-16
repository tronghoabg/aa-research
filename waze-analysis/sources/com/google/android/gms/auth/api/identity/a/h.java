package com.google.android.gms.auth.api.identity.a;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.o.t;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f4453a;

    /* renamed from: d, reason: collision with root package name */
    private static final u f4454d;

    /* renamed from: c, reason: collision with root package name */
    private final String f4455c;

    static {
        g gVar = new g();
        f4453a = gVar;
        f4454d = new u("Auth.Api.Identity.Authorization.API", gVar);
    }

    public h(Activity activity, com.google.android.gms.auth.api.identity.a aVar) {
        super(activity, f4454d, (com.google.android.gms.common.api.f) aVar, p.f4878a);
        this.f4455c = com.google.android.gms.i.a.a.a.a.a();
    }

    public final t a(AuthorizationRequest authorizationRequest) {
        com.google.android.gms.auth.api.identity.b bVarA = AuthorizationRequest.a(authorizationRequest);
        bVarA.j(this.f4455c);
        AuthorizationRequest authorizationRequestA = bVarA.a();
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.b.a.f4638c);
        bmVarB.c(new i(this, authorizationRequestA, 1));
        bmVarB.d();
        bmVarB.f(DisplayStrings.DS_MAP_POPUP_MY_LOCATION_TITLE);
        return o(bmVarB.b());
    }

    public h(Context context, com.google.android.gms.auth.api.identity.a aVar) {
        super(context, f4454d, aVar, p.f4878a);
        this.f4455c = com.google.android.gms.i.a.a.a.a.a();
    }
}
