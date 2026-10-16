package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbpf implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ((zzclb) obj).zzaj(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("custom_close")));
    }
}
