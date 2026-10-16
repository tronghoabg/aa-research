package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzduj extends zzbmw {
    private final String zza;
    private final zzdpw zzb;
    private final zzdqb zzc;

    public zzduj(String str, zzdpw zzdpwVar, zzdqb zzdqbVar) {
        this.zza = str;
        this.zzb = zzdpwVar;
        this.zzc = zzdqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final InterfaceC3876a zzb() throws RemoteException {
        return new BinderC3877b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzc() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final List zzd() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zze() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbml zzf() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzg() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final double zzh() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzi() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzj() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final Bundle zzk() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzl() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final L0 zzm() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzn(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final boolean zzo(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbme zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final InterfaceC3876a zzr() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzs() throws RemoteException {
        return this.zza;
    }
}
