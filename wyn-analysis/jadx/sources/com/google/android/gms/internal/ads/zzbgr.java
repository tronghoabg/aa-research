package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbgr extends zzbel implements zzbgt {
    public zzbgr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzb(zzbgq zzbgqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbgqVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzc(int i5) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzd(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(3, parcelZza);
    }
}
