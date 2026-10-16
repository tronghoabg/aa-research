package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzezp implements zzfcq {
    public final String zza;
    public final boolean zzb;

    public zzezp(String str, boolean z2) {
        this.zza = str;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
    }
}
