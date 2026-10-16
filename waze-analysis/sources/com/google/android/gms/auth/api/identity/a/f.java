package com.google.android.gms.auth.api.identity.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.s;
import com.google.android.gms.common.api.internal.am;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.android.a.a implements IInterface {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void a(am amVar, String str, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, amVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    public final void b(d dVar, com.google.android.gms.auth.api.identity.m mVar, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, mVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }

    public final void c(d dVar, s sVar, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, sVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }
}
