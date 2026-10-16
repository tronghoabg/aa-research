package com.google.android.gms.a.a.a;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.a.a implements c {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.a.a.a.c
    public final String a() {
        Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        String string = parcelTransactAndReadException.readString();
        parcelTransactAndReadException.recycle();
        return string;
    }

    @Override // com.google.android.gms.a.a.a.c
    public final boolean b() {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        int i2 = com.google.android.a.c.f3833a;
        parcelObtainAndWriteInterfaceToken.writeInt(1);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        boolean zD = com.google.android.a.c.d(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zD;
    }
}
