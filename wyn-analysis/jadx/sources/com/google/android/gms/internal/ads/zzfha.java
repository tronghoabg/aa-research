package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.InterfaceC0401v;
import D6.K0;
import D6.v1;
import D6.x1;
import G6.U;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzfha implements zzeua {
    private final Context zza;
    private final Executor zzb;
    private final zzcnq zzc;
    private final zzetk zzd;
    private final zzeto zze;
    private final ViewGroup zzf;
    private zzbjs zzg;
    private final zzdga zzh;
    private final zzfqt zzi;
    private final zzdif zzj;
    private final zzflf zzk;
    private p8.p zzl;
    private boolean zzm;
    private K0 zzn;
    private zzetz zzo;

    public zzfha(Context context, Executor executor, x1 x1Var, zzcnq zzcnqVar, zzetk zzetkVar, zzeto zzetoVar, zzflf zzflfVar, zzdif zzdifVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnqVar;
        this.zzd = zzetkVar;
        this.zze = zzetoVar;
        this.zzk = zzflfVar;
        this.zzh = zzcnqVar.zzd();
        this.zzi = zzcnqVar.zzx();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdifVar;
        zzflfVar.zzc(x1Var);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final K0 k02 = this.zzn;
        this.zzn = null;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjA)).booleanValue() && k02 != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(k02);
                }
            });
        }
        zzetz zzetzVar = this.zzo;
        if (zzetzVar != null) {
            zzetzVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zza(v1 v1Var, String str, zzety zzetyVar, zzetz zzetzVar) throws JSONException, RemoteException {
        zzcwx zzcwxVarZza;
        if (str == null) {
            int i5 = G6.L.f4523b;
            H6.l.c("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
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
            Pair pair = new Pair(zzdzc.PUBLIC_API_CALL.zza(), Long.valueOf(v1Var.f2528z));
            String strZza = zzdzc.DYNAMITE_ENTER.zza();
            C6.n.f1857D.k.getClass();
            Bundle bundleZza = zzdze.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
            zzflf zzflfVar = this.zzk;
            zzflfVar.zzg(str);
            zzflfVar.zza(v1Var);
            zzflfVar.zzv(bundleZza);
            Context context = this.zza;
            zzflg zzflgVarZzB = zzflfVar.zzB();
            zzfqg zzfqgVarB = u.b(context, zzfqp.zzg(zzflgVarZzB), 3, v1Var);
            zzfqq zzfqqVarZze = null;
            if (!((Boolean) zzbld.zzf.zze()).booleanValue() || !zzflfVar.zzf().k) {
                if (((Boolean) zzbivVar.zzd(zzbix.zzjA)).booleanValue()) {
                    zzcww zzcwwVarZzi = this.zzc.zzi();
                    zzdci zzdciVar = new zzdci();
                    zzdciVar.zza(context);
                    zzdciVar.zzb(zzflgVarZzB);
                    zzcwwVarZzi.zzl(zzdciVar.zze());
                    zzdiy zzdiyVar = new zzdiy();
                    zzetk zzetkVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdiyVar.zzm(zzetkVar, executor);
                    zzdiyVar.zze(zzetkVar, executor);
                    zzcwwVarZzi.zzm(zzdiyVar.zzn());
                    zzcwwVarZzi.zzk(new zzerq(this.zzg));
                    zzcwwVarZzi.zzd(new zzdof(zzdql.zza, null));
                    zzcwwVarZzi.zzg(new zzcxs(this.zzh, this.zzj));
                    zzcwwVarZzi.zze(new zzcvp(this.zzf));
                    zzcwxVarZza = zzcwwVarZzi.zzh();
                } else {
                    zzcww zzcwwVarZzi2 = this.zzc.zzi();
                    zzdci zzdciVar2 = new zzdci();
                    zzdciVar2.zza(context);
                    zzdciVar2.zzb(zzflgVarZzB);
                    zzcwwVarZzi2.zzl(zzdciVar2.zze());
                    zzdiy zzdiyVar2 = new zzdiy();
                    zzetk zzetkVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdiyVar2.zzm(zzetkVar2, executor2);
                    zzdiyVar2.zzf(zzetkVar2, executor2);
                    zzdiyVar2.zzf(this.zze, executor2);
                    zzdiyVar2.zzg(zzetkVar2, executor2);
                    zzdiyVar2.zzh(zzetkVar2, executor2);
                    zzdiyVar2.zza(zzetkVar2, executor2);
                    zzdiyVar2.zzb(zzetkVar2, executor2);
                    zzdiyVar2.zzc(zzetkVar2, executor2);
                    zzdiyVar2.zze(zzetkVar2, executor2);
                    zzdiyVar2.zzk(zzetkVar2, executor2);
                    zzcwwVarZzi2.zzm(zzdiyVar2.zzn());
                    zzcwwVarZzi2.zzk(new zzerq(this.zzg));
                    zzcwwVarZzi2.zzd(new zzdof(zzdql.zza, null));
                    zzcwwVarZzi2.zzg(new zzcxs(this.zzh, this.zzj));
                    zzcwwVarZzi2.zze(new zzcvp(this.zzf));
                    zzcwxVarZza = zzcwwVarZzi2.zzh();
                }
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqqVarZze = zzcwxVarZza.zze();
                    zzfqqVarZze.zzi(3);
                    zzfqqVarZze.zzc(v1Var.f2518p);
                    zzfqqVarZze.zzd(v1Var.f2515m);
                }
                this.zzo = zzetzVar;
                zzcze zzczeVarZzc = zzcwxVarZza.zzc();
                p8.p pVarZzc = zzczeVarZzc.zzc(zzczeVarZzc.zzb());
                this.zzl = pVarZzc;
                zzhcf.zzr(pVarZzc, new zzfgw(this, zzfqqVarZze, zzfqgVarB, zzcwxVarZza), this.zzb);
                return true;
            }
            zzetk zzetkVar3 = this.zzd;
            if (zzetkVar3 != null) {
                zzetkVar3.zzdJ(zzfmi.zzd(7, null, null));
            }
        } else if (!this.zzk.zzC()) {
            this.zzm = true;
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        p8.p pVar = this.zzl;
        return (pVar == null || pVar.isDone()) ? false : true;
    }

    public final void zzc() {
        synchronized (this) {
            try {
                p8.p pVar = this.zzl;
                if (pVar != null && pVar.isDone()) {
                    try {
                        zzcvs zzcvsVar = (zzcvs) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzcvsVar.zza();
                        ViewParent parent = zzcvsVar.zza().getParent();
                        if (parent instanceof ViewGroup) {
                            String strZze = zzcvsVar.zzn() != null ? zzcvsVar.zzn().zze() : "";
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strZze).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(strZze);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            String string = sb2.toString();
                            int i5 = G6.L.f4523b;
                            H6.l.f(string);
                            ((ViewGroup) parent).removeView(zzcvsVar.zza());
                        }
                        zzbio zzbioVar = zzbix.zzjA;
                        C0395s c0395s = C0395s.f2489e;
                        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                            zzdgp zzdgpVarZzq = zzcvsVar.zzq();
                            zzdgpVarZzq.zza(this.zzd);
                            zzdgpVarZzq.zzb(this.zze);
                        }
                        viewGroup.addView(zzcvsVar.zza());
                        zzetz zzetzVar = this.zzo;
                        if (zzetzVar != null) {
                            zzetzVar.zzb(zzcvsVar);
                        }
                        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzetk zzetkVar = this.zzd;
                            Objects.requireNonNull(zzetkVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgz
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzetkVar.zzg();
                                }
                            });
                        }
                        if (zzcvsVar.zzh() >= 0) {
                            this.zzm = false;
                            zzdga zzdgaVar = this.zzh;
                            zzdgaVar.zzd(zzcvsVar.zzh());
                            zzdgaVar.zze(zzcvsVar.zzg());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzcvsVar.zzg());
                        }
                    } catch (InterruptedException e7) {
                        e = e7;
                        zzn();
                        G6.L.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    } catch (ExecutionException e10) {
                        e = e10;
                        zzn();
                        G6.L.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    }
                } else if (this.zzl != null) {
                    G6.L.k("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    G6.L.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbjs zzbjsVar) {
        this.zzg = zzbjsVar;
    }

    public final void zzf(InterfaceC0401v interfaceC0401v) {
        this.zze.zza(interfaceC0401v);
    }

    public final zzflf zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        U u10 = C6.n.f1857D.f1863c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return U.r(view, powerManager, keyguardManager);
    }

    public final void zzi(zzdfv zzdfvVar) {
        this.zzh.zzq(zzdfvVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    public final /* synthetic */ void zzm(K0 k02) {
        this.zzd.zzdJ(k02);
    }

    public final /* synthetic */ zzdga zzo() {
        return this.zzh;
    }

    public final /* synthetic */ zzfqt zzp() {
        return this.zzi;
    }

    public final /* synthetic */ zzdif zzq() {
        return this.zzj;
    }

    public final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    public final /* synthetic */ void zzs(K0 k02) {
        this.zzn = k02;
    }
}
