package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.av;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab {
    public static v a(aa aaVar) {
        av.d(!((Status) aaVar).f(), "Status code must not be SUCCESS");
        w wVar = new w(aaVar);
        wVar.j(aaVar);
        return wVar;
    }

    public static i b(Status status) {
        return status.d() ? new y(status) : new i(status);
    }

    public static void c(Status status, com.google.android.gms.o.w wVar) {
        d(status, null, wVar);
    }

    public static void d(Status status, Object obj, com.google.android.gms.o.w wVar) {
        if (status.f()) {
            wVar.c(obj);
        } else {
            wVar.b(b(status));
        }
    }

    public static void e(Status status, Object obj, com.google.android.gms.o.w wVar, k kVar) {
        if (kVar != null) {
            com.google.android.gms.k.a.a.b();
        }
        d(status, obj, wVar);
    }
}
