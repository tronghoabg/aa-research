package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbvn extends zzbel implements zzbvp {
    public zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(int i5) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzm(zzbnc zzbncVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbncVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzn() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzo() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzp(zzcci zzcciVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzq() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzr(zzccm zzccmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzccmVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzs(int i5) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzt() throws RemoteException {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzu() throws RemoteException {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzv(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzw(int i5, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzx(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzy(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzz() throws RemoteException {
        zzda(25, zza());
    }
}
