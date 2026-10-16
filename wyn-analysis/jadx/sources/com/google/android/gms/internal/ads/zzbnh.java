package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbnh extends zzbel implements zzbnj {
    public zzbnh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zze(zzbmz zzbmzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbmzVar);
        zzda(1, parcelZza);
    }
}
