package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzewg implements zzfcq {
    final String zza;
    final int zzb;

    public zzewg(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i5;
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(str) || (i5 = this.zzb) == -1) {
            return;
        }
        Bundle bundleZza = zzflv.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", str);
        bundleZza.putInt("pvid_s", i5);
    }
}
