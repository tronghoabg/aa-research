package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class av extends com.google.android.a.a implements ax {
    av(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.ax
    public final com.google.android.gms.common.x a(com.google.android.gms.common.v vVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, vVar);
        Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.common.x xVar = (com.google.android.gms.common.x) com.google.android.a.c.a(parcelTransactAndReadException, com.google.android.gms.common.x.CREATOR);
        parcelTransactAndReadException.recycle();
        return xVar;
    }

    @Override // com.google.android.gms.common.internal.ax
    public final boolean b(com.google.android.gms.common.y yVar, com.google.android.gms.g.c cVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, yVar);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        boolean zD = com.google.android.a.c.d(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zD;
    }

    @Override // com.google.android.gms.common.internal.ax
    public final boolean c() {
        Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
        boolean zD = com.google.android.a.c.d(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zD;
    }
}
