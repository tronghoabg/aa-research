package com.google.android.gms.auth.a.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.az;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.p;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends ad {
    public a(Context context, Looper looper, p pVar, r rVar, az azVar) {
        super(context, looper, DisplayStrings.DS_TRIP_OVERVIEW_DEFAULT_SERVER_ERROR_PRIMARY_BUTTON_TITLE, pVar, rVar, azVar);
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.auth.blockstore.service.START";
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
        return com.google.android.gms.c.a.n;
    }
}
