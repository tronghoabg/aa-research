package com.google.android.gms.location.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.a.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void a(com.google.android.gms.location.e eVar, b bVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, eVar);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, bVar);
        parcelObtainAndWriteInterfaceToken.writeString(null);
        transactAndReadExceptionReturnVoid(63, parcelObtainAndWriteInterfaceToken);
    }
}
