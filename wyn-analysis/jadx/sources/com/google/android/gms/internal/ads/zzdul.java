package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzdul extends zzbmy {
    private final String zza;
    private final zzdpw zzb;
    private final zzdqb zzc;

    public zzdul(String str, zzdpw zzdpwVar, zzdqb zzdqbVar) {
        this.zza = str;
        this.zzb = zzdpwVar;
        this.zzc = zzdqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final InterfaceC3876a zzb() throws RemoteException {
        return new BinderC3877b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final String zzc() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final List zzd() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final String zze() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final zzbml zzf() throws RemoteException {
        return this.zzc.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final String zzg() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final String zzh() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final Bundle zzi() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzj() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final L0 zzk() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzl(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final boolean zzm(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzn(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final zzbme zzo() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final InterfaceC3876a zzp() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final String zzq() throws RemoteException {
        return this.zza;
    }
}
