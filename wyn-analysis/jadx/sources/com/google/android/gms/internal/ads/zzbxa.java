package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbxa extends zzbel implements zzbxc {
    public zzbxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zze(zzbvy zzbvyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbvyVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzg(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(3, parcelZza);
    }
}
