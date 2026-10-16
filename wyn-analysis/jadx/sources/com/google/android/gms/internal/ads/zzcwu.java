package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.view.ViewParent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzcwu implements zzddt {
    private final zzclb zza;
    private final zzdzt zzb;
    private final zzfkn zzc;

    public zzcwu(zzclb zzclbVar, zzdzt zzdztVar, zzfkn zzfknVar) {
        this.zza = zzclbVar;
        this.zzb = zzdztVar;
        this.zzc = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzclb zzclbVar;
        String str;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoE)).booleanValue() || (zzclbVar = this.zza) == null) {
            return;
        }
        ViewParent parent = zzclbVar.zzE().getParent();
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
        zzdzs zzdzsVarZza = this.zzb.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "hcp");
        zzdzsVarZza.zzc("hcp", str);
        zzdzsVarZza.zzb(this.zzc);
        zzdzsVarZza.zzd();
    }
}
