package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.dynamite.l;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    static int f4596a = 1;

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        u uVar = com.google.android.gms.auth.api.b.f4436a;
        o oVar = new o();
        oVar.b(new com.google.android.datatransport.cct.e());
        super(context, uVar, googleSignInOptions, oVar.a());
    }

    private final synchronized int c() {
        int i2;
        i2 = f4596a;
        if (i2 == 1) {
            Context contextF = f();
            h hVarB = h.b();
            int iM = hVarB.m(contextF, 12451000);
            if (iM == 0) {
                i2 = 4;
                f4596a = 4;
            } else if (hVarB.n(contextF, iM, null) != null || l.a(contextF, "com.google.android.gms.auth.api.fallback") == 0) {
                i2 = 2;
                f4596a = 2;
            } else {
                i2 = 3;
                f4596a = 3;
            }
        }
        return i2;
    }

    public final void a() {
        bb.a(i.a(i(), f(), c() == 3));
    }

    public final void b() {
        bb.a(i.b(i(), f(), c() == 3));
    }
}
