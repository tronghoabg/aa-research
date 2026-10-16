package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ah;
import com.google.android.gms.common.api.internal.bk;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.v;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.a.a f4623a = new com.google.android.gms.common.a.a("GoogleSignInCommon");

    public static v a(t tVar, Context context, boolean z) {
        f4623a.b("Revoking access");
        String strD = q.c(context).d("refreshToken");
        c(context);
        if (z) {
            return a.a(strD);
        }
        g gVar = new g(tVar);
        tVar.d(gVar);
        return gVar;
    }

    public static v b(t tVar, Context context, boolean z) {
        f4623a.b("Signing out");
        c(context);
        if (!z) {
            e eVar = new e(tVar);
            tVar.d(eVar);
            return eVar;
        }
        Status status = Status.f4686a;
        bk bkVar = new bk(tVar);
        bkVar.j(status);
        return bkVar;
    }

    private static void c(Context context) {
        l.a(context).b();
        Iterator it = t.b().iterator();
        while (it.hasNext()) {
            ((t) it.next()).c();
        }
        ah.w();
    }
}
