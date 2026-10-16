package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzfcm implements zzfcq {
    private final Bundle zza;

    public zzfcm(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        Bundle bundle2 = (Bundle) obj;
        if (bundle.isEmpty()) {
            return;
        }
        bundle2.putBundle("shared_pref", bundle);
    }
}
