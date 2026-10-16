package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbne extends zzbel implements zzbng {
    public zzbne(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zze(zzbmx zzbmxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbmxVar);
        zzda(1, parcelZza);
    }
}
