package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzfyx extends zzbel implements IInterface {
    public zzfyx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfyv zze(zzfyt zzfytVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzfytVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzfyv zzfyvVar = (zzfyv) zzben.zzb(parcelZzcZ, zzfyv.CREATOR);
        parcelZzcZ.recycle();
        return zzfyvVar;
    }

    public final void zzf(zzfyq zzfyqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzfyqVar);
        zzda(2, parcelZza);
    }

    public final zzfze zzg(zzfzc zzfzcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzfzcVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzfze zzfzeVar = (zzfze) zzben.zzb(parcelZzcZ, zzfze.CREATOR);
        parcelZzcZ.recycle();
        return zzfzeVar;
    }
}
