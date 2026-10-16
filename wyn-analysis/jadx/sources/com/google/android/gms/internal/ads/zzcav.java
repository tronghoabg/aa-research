package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcav extends zzbel implements zzcax {
    public zzcav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zze(zzcbk zzcbkVar, zzcbb zzcbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzcbkVar);
        zzben.zze(parcelZza, zzcbbVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzf(zzcbk zzcbkVar, zzcbb zzcbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzcbkVar);
        zzben.zze(parcelZza, zzcbbVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzg(zzcbk zzcbkVar, zzcbb zzcbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzcbkVar);
        zzben.zze(parcelZza, zzcbbVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzh(String str, zzcbb zzcbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzcbbVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzj(zzcat zzcatVar, zzcbc zzcbcVar) throws RemoteException {
        throw null;
    }
}
