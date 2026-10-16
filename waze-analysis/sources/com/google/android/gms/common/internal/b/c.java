package com.google.android.gms.common.internal.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends com.google.android.a.a implements IInterface {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    public final void a(n nVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, nVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
