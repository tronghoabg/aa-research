package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbvq extends zzbel implements zzbvs {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final InterfaceC3876a zze() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
