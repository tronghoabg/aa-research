package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbnk extends zzbel implements zzbnm {
    public zzbnk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zze(zzbnc zzbncVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbncVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
