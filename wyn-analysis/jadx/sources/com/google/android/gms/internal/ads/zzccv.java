package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzccv extends zzbem implements zzccw {
    public zzccv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            zze();
        } else if (i5 == 2) {
            int i11 = parcel.readInt();
            zzben.zzh(parcel);
            zzf(i11);
        } else {
            if (i5 != 3) {
                return false;
            }
            K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
            zzben.zzh(parcel);
            zzg(k02);
        }
        parcel2.writeNoException();
        return true;
    }
}
