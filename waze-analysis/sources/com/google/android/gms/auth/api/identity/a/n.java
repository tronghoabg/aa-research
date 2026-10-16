package com.google.android.gms.auth.api.identity.a;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.r;
import com.google.android.gms.auth.api.identity.s;
import com.google.android.gms.auth.api.identity.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.o.t;
import com.google.android.gms.o.w;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f4463a;

    /* renamed from: d, reason: collision with root package name */
    private static final u f4464d;

    /* renamed from: c, reason: collision with root package name */
    private final String f4465c;

    static {
        l lVar = new l();
        f4463a = lVar;
        f4464d = new u("Auth.Api.Identity.SignIn.API", lVar);
    }

    public n(Context context, x xVar) {
        super(context, f4464d, xVar, p.f4878a);
        this.f4465c = com.google.android.gms.i.a.a.a.a.a();
    }

    public static /* synthetic */ void c(n nVar, o oVar, w wVar) {
        m mVar = new m(nVar, wVar);
        f fVar = (f) oVar.y();
        oVar.x();
        fVar.a(mVar, nVar.f4465c, com.google.android.gms.identitycredentials.a.k.c());
    }

    public static final com.google.android.gms.auth.api.identity.w d(Intent intent) throws com.google.android.gms.common.api.i {
        if (intent == null) {
            throw new com.google.android.gms.common.api.i(Status.f4688c);
        }
        Status status = (Status) a.a.S(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.i(Status.f4690e);
        }
        if (!status.f()) {
            throw new com.google.android.gms.common.api.i(status);
        }
        com.google.android.gms.auth.api.identity.w wVar = (com.google.android.gms.auth.api.identity.w) a.a.S(intent, "sign_in_credential", com.google.android.gms.auth.api.identity.w.CREATOR);
        if (wVar != null) {
            return wVar;
        }
        throw new com.google.android.gms.common.api.i(Status.f4688c);
    }

    public final t a(com.google.android.gms.auth.api.identity.m mVar) {
        com.google.android.gms.auth.api.identity.e eVarA = com.google.android.gms.auth.api.identity.m.a(mVar);
        eVarA.h(this.f4465c);
        com.google.android.gms.auth.api.identity.m mVarA = eVarA.a();
        bm bmVarB = bn.b();
        bmVarB.e(new com.google.android.gms.common.f("auth_api_credentials_begin_sign_in", -1, 8L, false));
        bmVarB.c(new i(this, mVarA, 2));
        bmVarB.d();
        bmVarB.f(DisplayStrings.DS_MAP_POPUP_USER_MEGA_POINTS);
        return o(bmVarB.b());
    }

    public final t b(s sVar) {
        r rVarA = s.a(sVar);
        rVarA.g(this.f4465c);
        s sVarA = rVarA.a();
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.b.a.f4642g);
        bmVarB.c(new i(this, sVarA, 3));
        bmVarB.f(DisplayStrings.DS_MAP_POPUP_SEARCH_INFO_BUTTON);
        return o(bmVarB.b());
    }
}
