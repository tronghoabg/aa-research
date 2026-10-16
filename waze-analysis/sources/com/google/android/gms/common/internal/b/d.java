package com.google.android.gms.common.internal.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.bi;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.a.a implements IInterface {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void a(bi biVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, biVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
