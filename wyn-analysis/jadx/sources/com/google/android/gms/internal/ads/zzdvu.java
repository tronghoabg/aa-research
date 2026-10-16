package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzdvu extends zzcya {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdnw zze;
    private final zzdkk zzf;
    private final zzddm zzg;
    private final zzdet zzh;
    private final zzcyv zzi;
    private final zzccm zzj;
    private final zzfya zzk;
    private final zzfla zzl;
    private final zzdzt zzm;
    private boolean zzn;

    public zzdvu(zzcxz zzcxzVar, Context context, zzclb zzclbVar, zzdnw zzdnwVar, zzdkk zzdkkVar, zzddm zzddmVar, zzdet zzdetVar, zzcyv zzcyvVar, zzfkn zzfknVar, zzfya zzfyaVar, zzfla zzflaVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdnwVar;
        this.zzd = new WeakReference(zzclbVar);
        this.zzf = zzdkkVar;
        this.zzg = zzddmVar;
        this.zzh = zzdetVar;
        this.zzi = zzcyvVar;
        this.zzk = zzfyaVar;
        zzcci zzcciVar = zzfknVar.zzl;
        this.zzj = new zzcdg(zzcciVar != null ? zzcciVar.zza : "", zzcciVar != null ? zzcciVar.zzb : 1);
        this.zzl = zzflaVar;
        this.zzm = zzdztVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzclb zzclbVar = (zzclb) this.zzd.get();
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhM)).booleanValue()) {
                if (!this.zzn && zzclbVar != null) {
                    zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvt
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclbVar.destroy();
                        }
                    });
                }
            } else if (zzclbVar != null) {
                zzclbVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.Context] */
    public final boolean zza(boolean z2, Activity activity) {
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        zzdnw zzdnwVar = this.zze;
        if (!U.m(zzdnwVar.zzb())) {
            zzbio zzbioVar = zzbix.zzpn;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                U u11 = nVar.f1863c;
                U.l(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzbs)).booleanValue()) {
                U u12 = nVar.f1863c;
                if (U.g(this.zzc)) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) c0395s.f2492c.zzd(zzbix.zzbt)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i10 = G6.L.f4523b;
            H6.l.f("The rewarded ad have been showed.");
            this.zzg.zzc(zzfmi.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdkk zzdkkVar = this.zzf;
        zzdkkVar.zza();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            zzdnwVar.zza(z2, activity2, this.zzg);
            zzdkkVar.zzb();
            return true;
        } catch (zzdnv e7) {
            this.zzg.zzd(e7);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzccm zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzclb zzclbVar = (zzclb) this.zzd.get();
        return (zzclbVar == null || zzclbVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfla zzh() {
        return this.zzl;
    }
}
