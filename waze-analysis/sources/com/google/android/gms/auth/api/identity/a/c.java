package com.google.android.gms.auth.api.identity.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends com.google.android.a.a implements IInterface {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void a(d dVar, AuthorizationRequest authorizationRequest, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, authorizationRequest);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }
}
