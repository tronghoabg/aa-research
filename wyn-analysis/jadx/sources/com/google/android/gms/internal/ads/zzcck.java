package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcck extends zzbel implements zzccm {
    public zzcck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final int zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        int i5 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i5;
    }
}
