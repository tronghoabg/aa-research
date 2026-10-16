package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcvm extends zzcya {
    private final zzclb zzc;
    private final int zzd;
    private final Context zze;
    private final zzcva zzf;
    private final zzdnw zzg;
    private final zzdkk zzh;
    private final zzddm zzi;
    private final boolean zzj;
    private final zzcfp zzk;
    private final zzdzt zzl;
    private boolean zzm;

    public zzcvm(zzcxz zzcxzVar, Context context, zzclb zzclbVar, int i5, zzcva zzcvaVar, zzdnw zzdnwVar, zzdkk zzdkkVar, zzddm zzddmVar, zzcfp zzcfpVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.zzm = false;
        this.zzc = zzclbVar;
        this.zze = context;
        this.zzd = i5;
        this.zzf = zzcvaVar;
        this.zzg = zzdnwVar;
        this.zzh = zzdkkVar;
        this.zzi = zzddmVar;
        this.zzj = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgB)).booleanValue();
        this.zzk = zzcfpVar;
        this.zzl = zzdztVar;
    }

    public final void zza(zzbgk zzbgkVar) {
        zzclb zzclbVar = this.zzc;
        if (zzclbVar != null) {
            zzclbVar.zzay(zzbgkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.content.Context] */
    public final void zzb(Activity activity, zzbgx zzbgxVar, boolean z2) throws RemoteException {
        zzclb zzclbVar;
        zzfkn zzfknVarZzC;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        boolean z10 = this.zzj;
        if (z10) {
            this.zzh.zza();
        }
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        zzdnw zzdnwVar = this.zzg;
        if (!U.m(zzdnwVar.zzb())) {
            zzbio zzbioVar = zzbix.zzpn;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                U u11 = nVar.f1863c;
                U.l(activity2, this.zzb, this.zzl);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzbs)).booleanValue()) {
                U u12 = nVar.f1863c;
                if (U.g(activity2)) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) c0395s.f2492c.zzd(zzbix.zzbt)).booleanValue()) {
                        new zzfya(activity2.getApplicationContext(), nVar.f1879t.j()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznC)).booleanValue() && (zzclbVar = this.zzc) != null && (zzfknVarZzC = zzclbVar.zzC()) != null && zzfknVarZzC.zzar && zzfknVarZzC.zzas != this.zzk.zzj()) {
            int i10 = G6.L.f4523b;
            H6.l.f("The app open consent form has been shown.");
            this.zzi.zzc(zzfmi.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i11 = G6.L.f4523b;
            H6.l.f("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfmi.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdnwVar.zza(z2, activity2, this.zzi);
            if (z10) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdnv e7) {
            this.zzi.zzd(e7);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzd() {
        super.zzd();
        zzclb zzclbVar = this.zzc;
        if (zzclbVar != null) {
            zzclbVar.destroy();
        }
    }

    public final void zze(long j8, int i5) {
        this.zzf.zza(j8, i5);
    }
}
