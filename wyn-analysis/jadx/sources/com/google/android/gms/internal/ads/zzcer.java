package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzcer extends zzbel implements zzcet {
    public zzcer(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zze(InterfaceC3876a interfaceC3876a, zzcex zzcexVar, zzceq zzceqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, zzcexVar);
        zzben.zze(parcelZza, zzceqVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzf(InterfaceC3876a interfaceC3876a) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzg(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzh(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzi(zzcaa zzcaaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzj(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzk(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzl(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final InterfaceC3876a zzm(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, String str, InterfaceC3876a interfaceC3876a3) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, interfaceC3876a2);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, interfaceC3876a3);
        return AbstractC0279p0.t(zzcZ(11, parcelZza));
    }
}
