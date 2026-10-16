package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbgw extends zzbem implements zzbgx {
    public zzbgw() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            zzc();
        } else if (i5 == 2) {
            zzd();
        } else if (i5 == 3) {
            K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
            zzben.zzh(parcel);
            zze(k02);
        } else if (i5 == 4) {
            zzf();
        } else {
            if (i5 != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
