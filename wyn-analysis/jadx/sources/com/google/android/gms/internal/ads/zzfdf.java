package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzfdf implements zzfcq {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzfdf(String str, int i5, int i10, int i11, boolean z2, int i12) {
        this.zza = str;
        this.zzb = i5;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = z2;
        this.zzf = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflv.zzb(bundle, "carrier", this.zza, !TextUtils.isEmpty(r0));
        int i5 = this.zzb;
        zzflv.zzc(bundle, "cnt", i5, i5 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle bundleZza = zzflv.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        Bundle bundleZza2 = zzflv.zza(bundleZza, "network");
        bundleZza.putBundle("network", bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }
}
