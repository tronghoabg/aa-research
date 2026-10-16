package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbmn extends zzbel implements zzbmp {
    public zzbmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzb(String str, InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final InterfaceC3876a zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return AbstractC0279p0.t(zzcZ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzd(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdB(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdC(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdD(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdE(zzbmi zzbmiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbmiVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzf(InterfaceC3876a interfaceC3876a, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeInt(i5);
        zzda(5, parcelZza);
    }
}
