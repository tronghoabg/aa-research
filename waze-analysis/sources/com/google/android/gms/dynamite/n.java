package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends com.google.android.a.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.g.c a(com.google.android.gms.g.c cVar, int i2, com.google.android.gms.g.c cVar2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(i2);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar2);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.g.c cVarA = com.google.android.gms.g.b.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return cVarA;
    }

    public final com.google.android.gms.g.c b(com.google.android.gms.g.c cVar, int i2, com.google.android.gms.g.c cVar2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(i2);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar2);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.g.c cVarA = com.google.android.gms.g.b.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return cVarA;
    }
}
