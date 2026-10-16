package com.google.android.gms.internal.ads;

import D6.A0;
import D6.G0;
import D6.H0;
import D6.InterfaceC0408y0;
import D6.v1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzccn extends zzbel implements zzccp {
    public zzccn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzb(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzc(v1 v1Var, zzccw zzccwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, zzccwVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzd(v1 v1Var, zzccw zzccwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, zzccwVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze(zzccs zzccsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzccsVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(InterfaceC0408y0 interfaceC0408y0) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC0408y0);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final Bundle zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzh(zzcdd zzcddVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzcddVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzk(InterfaceC3876a interfaceC3876a, boolean z2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final zzccm zzl() throws RemoteException {
        zzccm zzcckVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcckVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcckVar = iInterfaceQueryLocalInterface instanceof zzccm ? (zzccm) iInterfaceQueryLocalInterface : new zzcck(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final H0 zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        H0 h0Zzb = G0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return h0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzo(A0 a02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, a02);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzp(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final long zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        long j8 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzr(long j8) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j8);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzs(zzccx zzccxVar) throws RemoteException {
        throw null;
    }
}
