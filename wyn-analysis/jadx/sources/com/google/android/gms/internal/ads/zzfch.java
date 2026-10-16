package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzfch implements zzfcq {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    public zzfch(boolean z2, boolean z10, String str, boolean z11, int i5, int i10, int i11, String str2) {
        this.zza = z2;
        this.zzb = z10;
        this.zzc = str;
        this.zzd = z11;
        this.zze = i5;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        zzbio zzbioVar = zzbix.zzeM;
        C0395s c0395s = C0395s.f2489e;
        bundle.putString("extra_caps", (String) c0395s.f2492c.zzd(zzbioVar));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgZ)).booleanValue()) {
            String str = this.zzh;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleZza = zzflv.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((Boolean) zzbkx.zzg.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = zzflv.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "910357297");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}
