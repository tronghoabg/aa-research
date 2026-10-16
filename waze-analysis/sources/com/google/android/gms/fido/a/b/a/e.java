package com.google.android.gms.fido.a.b.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.a.a.a.al;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.android.a.a implements IInterface {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    public final void a(d dVar, al alVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, dVar);
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, alVar);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }
}
