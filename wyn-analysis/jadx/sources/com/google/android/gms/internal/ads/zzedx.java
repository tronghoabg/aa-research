package com.google.android.gms.internal.ads;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import ka.AbstractC3256n;
import x6.C4476g;

/* loaded from: classes3.dex */
public final class zzedx {
    private com.google.android.gms.ads.nativead.g zzb;
    private x6.w zzc;
    private AdSize zzd = AdSize.f26288i;
    private String zze = "";
    private String zzf = "";
    private boolean zzg = false;
    private C4476g zza = new C4476g((AdRequest$Builder) new AdRequest$Builder(14).x(AdMobAdapter.class, AbstractC3256n.b("request_origin", "inspector_ooct")));

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final C4476g zzc() {
        return this.zza;
    }

    public final AdSize zzd() {
        return this.zzd;
    }

    public final com.google.android.gms.ads.nativead.g zze() {
        return this.zzb;
    }

    public final x6.w zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final void zzh(String str) {
        this.zze = str;
    }

    public final void zzi(String str) {
        this.zzf = str;
    }

    public final void zzj(C4476g c4476g) {
        this.zza = c4476g;
    }

    public final void zzk(AdSize adSize) {
        this.zzd = adSize;
    }

    public final void zzl(com.google.android.gms.ads.nativead.g gVar) {
        this.zzb = gVar;
    }

    public final void zzm(x6.w wVar) {
        this.zzc = wVar;
    }

    public final void zzn(boolean z2) {
        this.zzg = z2;
    }
}
