package com.google.android.gms.common.internal.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.android.a.a implements IInterface {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService");
    }

    public final void a(r rVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, rVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
