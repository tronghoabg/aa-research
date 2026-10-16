package com.google.android.libraries.f.a.a.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.aj;
import com.google.android.gms.common.internal.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends m {
    g(h hVar, i iVar, Context context, Looper looper) {
        super(context, looper, aj.b(context), com.google.android.gms.common.i.o(), 8, hVar, iVar, null);
    }

    @Override // com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 243300000;
    }

    @Override // com.google.android.gms.common.internal.m
    public final /* bridge */ /* synthetic */ IInterface c(IBinder iBinder) {
        x.f(iBinder, "binder");
        return com.google.android.gms.a.b.a.c.b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.ads.service.START";
    }
}
