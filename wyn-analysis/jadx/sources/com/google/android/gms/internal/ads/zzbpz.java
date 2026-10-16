package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbpz implements zzbpx {
    private final zzbqa zza;

    public zzbpz(zzbqa zzbqaVar) {
        this.zza = zzbqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzclb zzclbVar = (zzclb) obj;
        boolean zEquals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("transparentBackground"));
        boolean zEquals2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("blur"));
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Fail to parse float", e7);
        }
        zzbqa zzbqaVar = this.zza;
        zzbqaVar.zza(zEquals);
        zzbqaVar.zzb(zEquals2, f10);
        zzclbVar.zzaE(zEquals, (int) f10);
    }
}
