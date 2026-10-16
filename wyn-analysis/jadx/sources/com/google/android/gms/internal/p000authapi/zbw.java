package com.google.android.gms.internal.p000authapi;

import X6.f;
import X6.i;
import X6.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1697k;

/* loaded from: classes3.dex */
public final class zbw extends zba implements IInterface {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, f fVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbmVar);
        zbc.zbc(parcelZba, fVar);
        zbb(1, parcelZba);
    }

    public final void zbd(zbp zbpVar, i iVar, String str) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbpVar);
        zbc.zbc(parcelZba, iVar);
        parcelZba.writeString(str);
        zbb(4, parcelZba);
    }

    public final void zbe(zbr zbrVar, j jVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbrVar);
        zbc.zbc(parcelZba, jVar);
        zbb(3, parcelZba);
    }

    public final void zbf(InterfaceC1697k interfaceC1697k, String str) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, interfaceC1697k);
        parcelZba.writeString(str);
        zbb(2, parcelZba);
    }
}
