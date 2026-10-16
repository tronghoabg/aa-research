package com.google.android.gms.auth.a.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends com.google.android.a.a implements IInterface {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void a(c cVar, com.google.android.gms.auth.a.d dVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, cVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, dVar);
        transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
    }

    public final void b(d dVar, com.google.android.gms.auth.a.h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, hVar);
        transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
    }

    public final void c(d dVar, com.google.android.gms.auth.a.a aVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, aVar);
        transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
    }
}
