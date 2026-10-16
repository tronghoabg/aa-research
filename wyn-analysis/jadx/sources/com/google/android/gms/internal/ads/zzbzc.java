package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbzc extends zzbel implements zzbze {
    public zzbzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final zzbzb zze(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) throws RemoteException {
        zzbzb zzbyzVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbyzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbyzVar = iInterfaceQueryLocalInterface instanceof zzbzb ? (zzbzb) iInterfaceQueryLocalInterface : new zzbyz(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbyzVar;
    }
}
