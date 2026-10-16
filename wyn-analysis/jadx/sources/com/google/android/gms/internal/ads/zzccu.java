package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzccu extends zzbel implements zzccw {
    public zzccu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i5) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(3, parcelZza);
    }
}
