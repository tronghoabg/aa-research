package com.google.android.gms.auth.a.b.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.az;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.p;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends ad {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, Looper looper, p pVar, r rVar, az azVar) {
        super(context, looper, DisplayStrings.DS_UNREAD, pVar, rVar, azVar);
        x.f(context, "context");
        x.f(looper, "looper");
        x.f(pVar, "clientSettings");
        x.f(rVar, "connectionCallbacks");
        x.f(azVar, "connectionFailedListener");
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.m
    public final /* bridge */ /* synthetic */ IInterface c(IBinder iBinder) {
        b bVar;
        x.f(iBinder, "binder");
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            bVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(iBinder);
        }
        x.e(bVar, "asInterface(...)");
        return bVar;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.m
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.m
    public final com.google.android.gms.common.f[] h() {
        com.google.android.gms.common.f[] fVarArr = com.google.android.gms.c.a.n;
        x.e(fVarArr, "ALL_FEATURES");
        return fVarArr;
    }
}
