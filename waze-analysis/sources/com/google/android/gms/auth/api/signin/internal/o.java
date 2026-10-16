package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends com.google.android.a.a implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(n nVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, nVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(103, parcelObtainAndWriteInterfaceToken);
    }

    public final void b(n nVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, nVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(102, parcelObtainAndWriteInterfaceToken);
    }
}
