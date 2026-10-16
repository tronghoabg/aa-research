package com.google.android.gms.identitycredentials.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends com.google.android.a.a implements IInterface {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
    }

    public final void a(a aVar, com.google.android.gms.identitycredentials.b bVar, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, aVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, bVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
    }

    public final void b(a aVar, com.google.android.gms.identitycredentials.g gVar, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, aVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, gVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
    }

    public final void c(a aVar, GetCredentialRequest getCredentialRequest, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, aVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, getCredentialRequest);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }

    public final void d(a aVar, w wVar, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, aVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, wVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
    }
}
