package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzfcj implements zzfcq {
    private final boolean zza;

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza) {
            bundle.putBoolean("sdk_prefetch", true);
        }
    }
}
