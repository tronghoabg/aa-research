package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbws extends zzbem implements zzbwt {
    public zzbws() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 2) {
            zze();
        } else if (i5 == 3) {
            String string = parcel.readString();
            zzben.zzh(parcel);
            zzf(string);
        } else {
            if (i5 != 4) {
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
