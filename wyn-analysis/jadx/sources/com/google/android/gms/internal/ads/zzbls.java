package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbls extends zzbel implements IInterface {
    public zzbls(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzcal zzcalVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzcalVar);
        zzda(1, parcelZza);
    }
}
