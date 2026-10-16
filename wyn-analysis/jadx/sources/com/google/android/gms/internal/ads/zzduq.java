package com.google.android.gms.internal.ads;

import D6.A0;
import D6.C0395s;
import D6.H0;
import D6.InterfaceC0391p0;
import D6.InterfaceC0396s0;
import D6.L0;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzduq extends zzbob {
    private final String zza;
    private final zzdpw zzb;
    private final zzdqb zzc;
    private final zzdzt zzd;

    public zzduq(String str, zzdpw zzdpwVar, zzdqb zzdqbVar, zzdzt zzdztVar) {
        this.zza = str;
        this.zzb = zzdpwVar;
        this.zzc = zzdqbVar;
        this.zzd = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final boolean zzA() throws RemoteException {
        zzdqb zzdqbVar = this.zzc;
        return (zzdqbVar.zzE().isEmpty() || zzdqbVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzB(InterfaceC0396s0 interfaceC0396s0) throws RemoteException {
        this.zzb.zzA(interfaceC0396s0);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzC(InterfaceC0391p0 interfaceC0391p0) throws RemoteException {
        this.zzb.zzB(interfaceC0391p0);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbmi zzF() throws RemoteException {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final H0 zzH() throws RemoteException {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhO)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzI(A0 a02) throws RemoteException {
        try {
            if (!a02.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzb.zzQ(a02);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzJ(Bundle bundle) throws JSONException {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoI)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final long zzK() {
        zzdpw zzdpwVar = this.zzb;
        if (zzdpwVar == null || zzdpwVar.zzo() == null) {
            return 0L;
        }
        return zzdpwVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzL(long j8) {
        zzdpw zzdpwVar = this.zzb;
        if (zzdpwVar == null || zzdpwVar.zzo() == null) {
            return;
        }
        zzdpwVar.zzo().zzb(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zze() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final List zzf() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbml zzh() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzi() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzj() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final double zzk() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzl() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzm() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final L0 zzn() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzo() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzp() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbme zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final InterfaceC3876a zzu() throws RemoteException {
        return new BinderC3877b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final InterfaceC3876a zzv() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzx(zzbnz zzbnzVar) throws RemoteException {
        this.zzb.zzy(zzbnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzy() throws RemoteException {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final List zzz() throws RemoteException {
        return zzA() ? this.zzc.zzE() : Collections.EMPTY_LIST;
    }
}
