package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzcct extends zzbel implements IInterface {
    public zzcct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(InterfaceC3876a interfaceC3876a, String str, zzbvj zzbvjVar, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}
