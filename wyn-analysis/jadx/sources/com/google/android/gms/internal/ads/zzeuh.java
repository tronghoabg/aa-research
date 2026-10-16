package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.InterfaceC0362b0;
import D6.v1;
import G6.U;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzeuh implements zzeua {
    private final zzflf zza;
    private final zzcnq zzb;
    private final Context zzc;
    private final zzetx zzd;
    private final zzfqt zze;
    private zzcyp zzf;

    public zzeuh(zzcnq zzcnqVar, Context context, zzetx zzetxVar, zzflf zzflfVar) {
        this.zzb = zzcnqVar;
        this.zzc = context;
        this.zzd = zzetxVar;
        this.zza = zzflfVar;
        this.zze = zzcnqVar.zzx();
        zzflfVar.zzt(zzetxVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zza(v1 v1Var, String str, zzety zzetyVar, zzetz zzetzVar) throws JSONException, RemoteException {
        zzbio zzbioVar = zzbix.zzdn;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            C0392q.a();
        }
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        Context context = this.zzc;
        if (U.h(context) && v1Var.f2521s == null) {
            int i5 = G6.L.f4523b;
            H6.l.c("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeug
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i10 = G6.L.f4523b;
            H6.l.c("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        boolean z2 = v1Var.f2509f;
        zzfmd.zzb(context, z2);
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkv)).booleanValue() && z2) {
            this.zzb.zzw().zzc(true);
        }
        int i11 = ((zzeub) zzetyVar).zza;
        nVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzdzc.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdze.zza(new Pair(strZza, lValueOf), new Pair(zzdzc.DYNAMITE_ENTER.zza(), lValueOf));
        zzflf zzflfVar = this.zza;
        zzflfVar.zza(v1Var);
        zzflfVar.zzv(bundleZza);
        zzflfVar.zzl(i11);
        zzflg zzflgVarZzB = zzflfVar.zzB();
        zzfqg zzfqgVarB = u.b(context, zzfqp.zzg(zzflgVarZzB), 8, v1Var);
        InterfaceC0362b0 interfaceC0362b0 = zzflgVarZzB.zzo;
        if (interfaceC0362b0 != null) {
            this.zzd.zzc().zzo(interfaceC0362b0);
        }
        zzcnq zzcnqVar = this.zzb;
        zzdoj zzdojVarZzo = zzcnqVar.zzo();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zza(context);
        zzdciVar.zzb(zzflgVarZzB);
        zzdojVarZzo.zzf(zzdciVar.zze());
        zzdiy zzdiyVar = new zzdiy();
        zzetx zzetxVar = this.zzd;
        zzdiyVar.zze(zzetxVar.zzc(), zzcnqVar.zzb());
        zzdojVarZzo.zzg(zzdiyVar.zzn());
        zzdojVarZzo.zze(zzetxVar.zzb());
        zzfqq zzfqqVarZzc = null;
        zzdojVarZzo.zzd(new zzcvp(null));
        zzdok zzdokVarZza = zzdojVarZzo.zza();
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzfqqVarZzc = zzdokVarZza.zzc();
            zzfqqVarZzc.zzi(8);
            zzfqqVarZzc.zzc(v1Var.f2518p);
            zzfqqVarZzc.zzd(v1Var.f2515m);
        }
        zzcnqVar.zzv().zza(1);
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzc = zzcnqVar.zzc();
        zzcze zzczeVarZza = zzdokVarZza.zza();
        zzcyp zzcypVar = new zzcyp(zzhcpVarZzc, scheduledExecutorServiceZzc, zzczeVarZza.zzc(zzczeVarZza.zzb()));
        this.zzf = zzcypVar;
        zzcypVar.zza(new zzeue(this, zzetzVar, zzfqqVarZzc, zzfqgVarB, zzdokVarZza));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        zzcyp zzcypVar = this.zzf;
        return zzcypVar != null && zzcypVar.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zze().zzdJ(zzfmi.zzd(4, null, null));
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zze().zzdJ(zzfmi.zzd(6, null, null));
    }

    public final /* synthetic */ zzcnq zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzetx zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfqt zzg() {
        return this.zze;
    }
}
