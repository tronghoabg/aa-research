package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbyz extends zzbel implements zzbzb {
    public zzbyz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zze(Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, intent);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzf(InterfaceC3876a interfaceC3876a, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzh(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzi(String[] strArr, int[] iArr, InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzj(InterfaceC3876a interfaceC3876a, E6.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, aVar);
        zzda(6, parcelZza);
    }
}
