package com.google.android.gms.common.internal.b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.az;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.bk;
import com.google.android.gms.common.internal.p;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l extends ad {

    /* renamed from: e, reason: collision with root package name */
    private final bk f5014e;

    public l(Context context, Looper looper, p pVar, bk bkVar, r rVar, az azVar) {
        super(context, looper, DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN, pVar, rVar, azVar);
        this.f5014e = bkVar;
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final Bundle b() {
        return this.f5014e.a();
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.m
    public final com.google.android.gms.common.f[] h() {
        return com.google.android.gms.e.a.f5205d;
    }
}
