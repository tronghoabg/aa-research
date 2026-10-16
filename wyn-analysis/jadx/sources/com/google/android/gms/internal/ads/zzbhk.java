package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbhk extends zzbel implements IInterface {
    public zzbhk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbhf zze(zzbhi zzbhiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbhiVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzbhf zzbhfVar = (zzbhf) zzben.zzb(parcelZzcZ, zzbhf.CREATOR);
        parcelZzcZ.recycle();
        return zzbhfVar;
    }

    public final zzbhf zzf(zzbhi zzbhiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbhiVar);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        zzbhf zzbhfVar = (zzbhf) zzben.zzb(parcelZzcZ, zzbhf.CREATOR);
        parcelZzcZ.recycle();
        return zzbhfVar;
    }

    public final long zzg(zzbhi zzbhiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbhiVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j8 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j8;
    }
}
