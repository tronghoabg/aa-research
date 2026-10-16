package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzeuj implements zzfcq {
    private final boolean zza;

    public zzeuj(boolean z2) {
        this.zza = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }
}
