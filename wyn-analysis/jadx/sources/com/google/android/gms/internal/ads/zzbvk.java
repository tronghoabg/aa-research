package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.J0;
import D6.L0;
import D6.v1;
import D6.x1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbvk extends zzbel implements zzbvm {
    public zzbvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzA(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final L0 zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(26, zza());
        L0 l0Zzb = J0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return l0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvy zzC() throws RemoteException {
        zzbvy zzbvwVar;
        Parcel parcelZzcZ = zzcZ(27, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvwVar = iInterfaceQueryLocalInterface instanceof zzbvy ? (zzbvy) iInterfaceQueryLocalInterface : new zzbvw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzD(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzE(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzF(InterfaceC3876a interfaceC3876a, zzbsa zzbsaVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbsaVar);
        parcelZza.writeTypedList(list);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzG(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbxx zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(33, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbxx zzI() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzJ(InterfaceC3876a interfaceC3876a, x1 x1Var, v1 v1Var, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, x1Var);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvs zzK() throws RemoteException {
        zzbvs zzbvqVar;
        Parcel parcelZzcZ = zzcZ(36, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbvqVar = iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvq(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzL(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzM(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzN(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvu zzO() throws RemoteException {
        zzbvu zzbvuVar;
        Parcel parcelZzcZ = zzcZ(15, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvuVar = iInterfaceQueryLocalInterface instanceof zzbvu ? (zzbvu) iInterfaceQueryLocalInterface : new zzbvu(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvv zzP() throws RemoteException {
        zzbvv zzbvvVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvvVar = iInterfaceQueryLocalInterface instanceof zzbvv ? (zzbvv) iInterfaceQueryLocalInterface : new zzbvv(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(InterfaceC3876a interfaceC3876a, x1 x1Var, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final InterfaceC3876a zzf() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzj(InterfaceC3876a interfaceC3876a, x1 x1Var, v1 v1Var, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, x1Var);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzk(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzm() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzn(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzcch zzcchVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(null);
        zzben.zze(parcelZza, zzcchVar);
        parcelZza.writeString(str2);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzo(v1 v1Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzp() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzr(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, String str2, zzbvp zzbvpVar, zzbma zzbmaVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, v1Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, zzbmaVar);
        parcelZza.writeStringList(list);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzv(v1 v1Var, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzw(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final boolean zzx() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzy(InterfaceC3876a interfaceC3876a, zzcch zzcchVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzcchVar);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbnc zzz() throws RemoteException {
        throw null;
    }
}
