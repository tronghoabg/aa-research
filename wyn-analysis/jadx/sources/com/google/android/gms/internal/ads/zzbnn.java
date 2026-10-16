package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbnn extends zzbel implements zzbnp {
    public zzbnn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnp
    public final void zze(zzbnc zzbncVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbncVar);
        zzda(1, parcelZza);
    }
}
