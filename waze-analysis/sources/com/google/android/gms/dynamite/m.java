package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends com.google.android.a.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        int i2 = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i2;
    }

    public final com.google.android.gms.g.c b(com.google.android.gms.g.c cVar, int i2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(i2);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.g.c cVarA = com.google.android.gms.g.b.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return cVarA;
    }

    public final com.google.android.gms.g.c c(com.google.android.gms.g.c cVar, int i2, com.google.android.gms.g.c cVar2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(i2);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar2);
        Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.g.c cVarA = com.google.android.gms.g.b.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return cVarA;
    }

    public final com.google.android.gms.g.c d(com.google.android.gms.g.c cVar, int i2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(i2);
        Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.g.c cVarA = com.google.android.gms.g.b.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return cVarA;
    }

    public final int e(com.google.android.gms.g.c cVar, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        int i2 = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i2;
    }

    public final int f(com.google.android.gms.g.c cVar, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        int i2 = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i2;
    }

    public final com.google.android.gms.g.c g(com.google.android.gms.g.c cVar, boolean z, long j2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        parcelObtainAndWriteInterfaceToken.writeString("com.google.android.gms.googlecertificates");
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeLong(j2);
        Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.g.c cVarA = com.google.android.gms.g.b.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return cVarA;
    }
}
