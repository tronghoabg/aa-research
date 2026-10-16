package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzccf extends zzbel implements zzcch {
    public zzccf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zze(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzf(InterfaceC3876a interfaceC3876a, int i5) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzg(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzh(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzi(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzj(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzk(InterfaceC3876a interfaceC3876a, zzcci zzcciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, zzcciVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzl(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzm(InterfaceC3876a interfaceC3876a, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeInt(i5);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzn(InterfaceC3876a interfaceC3876a) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzo(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzp(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(13, parcelZza);
    }
}
