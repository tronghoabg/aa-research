package com.google.android.gms.auth.a.a;

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
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f4406a;

    /* renamed from: c, reason: collision with root package name */
    private static final u f4407c;

    static {
        f fVar = new f();
        f4406a = fVar;
        f4407c = new u("Blockstore.API", fVar);
    }

    public h(Context context) {
        super(context, f4407c, com.google.android.gms.common.api.e.f4696g, p.f4878a);
    }

    public final t a(com.google.android.gms.auth.a.a aVar) {
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.c.a.f4654g);
        bmVarB.c(new e(this, aVar, 1));
        bmVarB.d();
        bmVarB.f(DisplayStrings.DS_ETA_SCREEN_WAYPOINT_FINAL_ETA_TITLE);
        return q(bmVarB.b());
    }

    public final t b(com.google.android.gms.auth.a.d dVar) {
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.c.a.f4655h);
        bmVarB.c(new e(this, dVar, 2));
        bmVarB.d();
        bmVarB.f(DisplayStrings.DS_ETA_SCREEN_NO_EVENTS_ON_ROUTE);
        return o(bmVarB.b());
    }

    public final t c(com.google.android.gms.auth.a.h hVar) {
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.c.a.f4651d, com.google.android.gms.c.a.f4653f);
        bmVarB.c(new e(this, hVar, 0));
        bmVarB.f(DisplayStrings.DS_SEND_LOCATION_ASSISTANCE_EMAIL_BODY_PS_PS);
        bmVarB.d();
        return q(bmVarB.b());
    }
}
