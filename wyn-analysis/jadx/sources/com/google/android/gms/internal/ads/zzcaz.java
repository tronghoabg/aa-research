package com.google.android.gms.internal.ads;

import G6.C0553q;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcaz extends zzbel implements zzcbb {
    public zzcaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(C0553q c0553q) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, c0553q);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, parcelFileDescriptor);
        zzben.zzc(parcelZza, zzcbkVar);
        zzda(3, parcelZza);
    }
}
