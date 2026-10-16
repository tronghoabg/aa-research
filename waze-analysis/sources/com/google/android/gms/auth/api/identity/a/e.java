package com.google.android.gms.auth.api.identity.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.android.a.a implements IInterface {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void a(d dVar, u uVar, com.google.android.gms.common.api.k kVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, uVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, kVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }
}
