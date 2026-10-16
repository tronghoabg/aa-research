package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcca extends zzbel implements zzccc {
    public zzcca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzi(zzcbw zzcbwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzcbwVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzk(int i5) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }
}
