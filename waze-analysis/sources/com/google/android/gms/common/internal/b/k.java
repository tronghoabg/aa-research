package com.google.android.gms.common.internal.b;

import android.content.Context;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.bi;
import com.google.android.gms.common.internal.bk;
import com.google.android.gms.o.t;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends q {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f5012a;

    /* renamed from: c, reason: collision with root package name */
    private static final u f5013c;

    static {
        j jVar = new j();
        f5012a = jVar;
        f5013c = new u("ClientTelemetry.API", jVar);
    }

    public k(Context context, bk bkVar) {
        super(context, f5013c, bkVar, p.f4878a);
    }

    public final t a(bi biVar) {
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.e.a.f5202a);
        bmVarB.d();
        bmVarB.c(new com.google.android.gms.auth.a.b.a.c(biVar, 6));
        return n(bmVarB.b());
    }
}
