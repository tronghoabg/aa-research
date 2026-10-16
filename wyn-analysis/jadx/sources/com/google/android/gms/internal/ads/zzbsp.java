package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbsp extends zzbel implements zzbsr {
    public zzbsp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zze(zzbsl zzbslVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbslVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(int i5) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzg(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(3, parcelZza);
    }
}
