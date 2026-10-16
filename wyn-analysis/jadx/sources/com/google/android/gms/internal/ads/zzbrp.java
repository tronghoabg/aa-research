package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbrp extends zzbel implements IInterface {
    public zzbrp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbrj zzbrjVar, zzbro zzbroVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbrjVar);
        zzben.zze(parcelZza, zzbroVar);
        zzdb(2, parcelZza);
    }
}
