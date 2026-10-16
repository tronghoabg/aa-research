package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbmq extends zzbel implements zzbms {
    public zzbmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final IBinder zze(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, InterfaceC3876a interfaceC3876a3, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, interfaceC3876a2);
        zzben.zze(parcelZza, interfaceC3876a3);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}
