package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public abstract class zzfzo extends zzbem implements zzfzp {
    public zzfzo() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 2:
                BinderC3877b.R(parcel.readStrongBinder());
                parcel.readString();
                zzben.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzben.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzben.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                zzben.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                zzben.zzh(parcel);
                break;
            case 8:
                BinderC3877b.R(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzben.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
