package com.google.android.gms.internal.ads;

import G6.C0553q;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcbc extends zzbel implements IInterface {
    public zzcbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzcat zzcatVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zzc(parcelZza, zzcatVar);
        zzda(1, parcelZza);
    }

    public final void zzf(C0553q c0553q) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, c0553q);
        zzda(2, parcelZza);
    }
}
