package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzceu extends zzbel implements zzcew {
    public zzceu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcew
    public final zzcet zze(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) throws RemoteException {
        zzcet zzcerVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcerVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcerVar = iInterfaceQueryLocalInterface instanceof zzcet ? (zzcet) iInterfaceQueryLocalInterface : new zzcer(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcerVar;
    }
}
