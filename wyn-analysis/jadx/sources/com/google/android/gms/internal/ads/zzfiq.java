package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.v1;
import D6.x1;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzfiq implements zzeua {
    private final Context zza;
    private final Executor zzb;
    private final zzcnq zzc;
    private final zzetk zzd;
    private final zzfjr zze;
    private zzbjs zzf;
    private final zzfqt zzg;
    private final zzflf zzh;
    private p8.p zzi;

    public zzfiq(Context context, Executor executor, zzcnq zzcnqVar, zzetk zzetkVar, zzfjr zzfjrVar, zzflf zzflfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnqVar;
        this.zzd = zzetkVar;
        this.zzh = zzflfVar;
        this.zze = zzfjrVar;
        this.zzg = zzcnqVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zza(v1 v1Var, String str, zzety zzetyVar, zzetz zzetzVar) throws JSONException {
        zzdno zzdnoVarZza;
        zzfqq zzfqqVarZzc;
        if (str == null) {
            int i5 = G6.L.f4523b;
            H6.l.c("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        zzbio zzbioVar = zzbix.zzdn;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            C0392q.a();
        }
        zzbio zzbioVar2 = zzbix.zzkv;
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue() && v1Var.f2509f) {
            this.zzc.zzw().zzc(true);
        }
        x1 x1Var = ((zzfij) zzetyVar).zza;
        Pair pair = new Pair(zzdzc.PUBLIC_API_CALL.zza(), Long.valueOf(v1Var.f2528z));
        String strZza = zzdzc.DYNAMITE_ENTER.zza();
        C6.n.f1857D.k.getClass();
        Bundle bundleZza = zzdze.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
        zzflf zzflfVar = this.zzh;
        zzflfVar.zzg(str);
        zzflfVar.zzc(x1Var);
        zzflfVar.zza(v1Var);
        zzflfVar.zzv(bundleZza);
        Context context = this.zza;
        zzflg zzflgVarZzB = zzflfVar.zzB();
        zzfqg zzfqgVarB = u.b(context, zzfqp.zzg(zzflgVarZzB), 4, v1Var);
        if (((Boolean) zzbivVar.zzd(zzbix.zzjC)).booleanValue()) {
            zzdnn zzdnnVarZzm = this.zzc.zzm();
            zzdci zzdciVar = new zzdci();
            zzdciVar.zza(context);
            zzdciVar.zzb(zzflgVarZzB);
            zzdnnVarZzm.zze(zzdciVar.zze());
            zzdiy zzdiyVar = new zzdiy();
            zzetk zzetkVar = this.zzd;
            Executor executor = this.zzb;
            zzdiyVar.zzm(zzetkVar, executor);
            zzdiyVar.zze(zzetkVar, executor);
            zzdnnVarZzm.zzf(zzdiyVar.zzn());
            zzdnnVarZzm.zzd(new zzerq(this.zzf));
            zzdnoVarZza = zzdnnVarZzm.zzh();
        } else {
            zzdiy zzdiyVar2 = new zzdiy();
            zzfjr zzfjrVar = this.zze;
            if (zzfjrVar != null) {
                Executor executor2 = this.zzb;
                zzdiyVar2.zza(zzfjrVar, executor2);
                zzdiyVar2.zzb(zzfjrVar, executor2);
                zzdiyVar2.zzc(zzfjrVar, executor2);
            }
            zzdnn zzdnnVarZzm2 = this.zzc.zzm();
            zzdci zzdciVar2 = new zzdci();
            zzdciVar2.zza(context);
            zzdciVar2.zzb(zzflgVarZzB);
            zzdnnVarZzm2.zze(zzdciVar2.zze());
            zzetk zzetkVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdiyVar2.zzm(zzetkVar2, executor3);
            zzdiyVar2.zza(zzetkVar2, executor3);
            zzdiyVar2.zzb(zzetkVar2, executor3);
            zzdiyVar2.zzc(zzetkVar2, executor3);
            zzdiyVar2.zzf(zzetkVar2, executor3);
            zzdiyVar2.zzg(zzetkVar2, executor3);
            zzdiyVar2.zze(zzetkVar2, executor3);
            zzdiyVar2.zzk(zzetkVar2, executor3);
            zzdiyVar2.zzd(zzetkVar2, executor3);
            zzdnnVarZzm2.zzf(zzdiyVar2.zzn());
            zzdnnVarZzm2.zzd(new zzerq(this.zzf));
            zzdnoVarZza = zzdnnVarZzm2.zzh();
        }
        zzdno zzdnoVar = zzdnoVarZza;
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzfqqVarZzc = zzdnoVar.zzc();
            zzfqqVarZzc.zzi(4);
            zzfqqVarZzc.zzc(v1Var.f2518p);
            zzfqqVarZzc.zzd(v1Var.f2515m);
        } else {
            zzfqqVarZzc = null;
        }
        zzfqq zzfqqVar = zzfqqVarZzc;
        zzcze zzczeVarZzb = zzdnoVar.zzb();
        p8.p pVarZzc = zzczeVarZzb.zzc(zzczeVarZzb.zzb());
        this.zzi = pVarZzc;
        zzhcf.zzr(pVarZzc, new zzfio(this, zzetzVar, zzfqqVar, zzfqgVarB, zzdnoVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        p8.p pVar = this.zzi;
        return (pVar == null || pVar.isDone()) ? false : true;
    }

    public final void zzc(zzbjs zzbjsVar) {
        this.zzf = zzbjsVar;
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzetk zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfjr zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzfqt zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(p8.p pVar) {
        this.zzi = null;
    }
}
