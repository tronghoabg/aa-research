package com.google.android.gms.internal.ads;

import D6.J0;
import D6.L0;
import D6.v1;
import D6.x1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbxg extends zzbel implements zzbxi {
    public zzbxg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze(InterfaceC3876a interfaceC3876a, String str, Bundle bundle, Bundle bundle2, x1 x1Var, zzbxl zzbxlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeString(str);
        zzben.zzc(parcelZza, bundle);
        zzben.zzc(parcelZza, bundle2);
        zzben.zzc(parcelZza, x1Var);
        zzben.zze(parcelZza, zzbxlVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final zzbxx zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final zzbxx zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final L0 zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        L0 l0Zzb = J0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return l0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzi(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbww zzbwwVar, zzbvp zzbvpVar, x1 x1Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbwwVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, x1Var);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzj(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbwz zzbwzVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbwzVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzk(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzl(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbxfVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzm(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzn(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxc zzbxcVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbxcVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzp(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbxfVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzq(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbww zzbwwVar, zzbvp zzbvpVar, x1 x1Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbwwVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, x1Var);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzr(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxc zzbxcVar, zzbvp zzbvpVar, zzbma zzbmaVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbxcVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, zzbmaVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzs(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbwt zzbwtVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbwtVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzt(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        Parcel parcelZzcZ = zzcZ(24, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
