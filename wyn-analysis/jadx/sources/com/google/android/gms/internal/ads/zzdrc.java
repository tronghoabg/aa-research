package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.view.View;
import android.view.ViewParent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzdrc {
    private final zzdzt zza;

    public zzdrc(zzdzt zzdztVar) {
        this.zza = zzdztVar;
    }

    public final void zza(View view, zzfkn zzfknVar) {
        String str;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoE)).booleanValue() || view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                    break;
                }
                parent = parent.getParent();
            }
        }
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "hcp");
        zzdzsVarZza.zzc("hcp", str);
        zzdzsVarZza.zzb(zzfknVar);
        zzdzsVarZza.zzd();
    }
}
