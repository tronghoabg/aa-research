package com.google.android.gms.auth.a.b.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends com.google.android.a.a implements IInterface {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
    }

    public final void a(com.google.android.gms.auth.a.b.b bVar, a aVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, bVar);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, aVar);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }

    public final void b(com.google.android.gms.auth.a.b.a aVar, a aVar2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, aVar);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, aVar2);
        transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
    }

    public final void c(com.google.android.gms.auth.a.b.d dVar, a aVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, aVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }
}
