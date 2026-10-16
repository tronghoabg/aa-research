package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdtv {
    private final Executor zza;
    private final zzcux zzb;
    private final zzdla zzc;
    private final zzctq zzd;
    private final zzdbv zze;

    public zzdtv(Executor executor, zzcux zzcuxVar, zzdla zzdlaVar, zzctq zzctqVar, zzdbv zzdbvVar) {
        this.zza = executor;
        this.zzc = zzdlaVar;
        this.zzb = zzcuxVar;
        this.zzd = zzctqVar;
        this.zze = zzdbvVar;
    }

    public final void zza(final zzclb zzclbVar) {
        if (zzclbVar == null) {
            return;
        }
        zzdla zzdlaVar = this.zzc;
        zzdlaVar.zza(zzclbVar.zzE());
        zzbex zzbexVar = new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtu
            @Override // com.google.android.gms.internal.ads.zzbex
            public final /* synthetic */ void zzdj(zzbew zzbewVar) {
                Rect rect = zzbewVar.zzd;
                zzclbVar.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdlaVar.zzq(zzbexVar, executor);
        zzdlaVar.zzq(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtr
            @Override // com.google.android.gms.internal.ads.zzbex
            public final /* synthetic */ void zzdj(zzbew zzbewVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzbewVar.zzj ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                zzclbVar.zze("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcux zzcuxVar = this.zzb;
        zzdlaVar.zzq(zzcuxVar, executor);
        zzcuxVar.zza(zzclbVar);
        zzcmz zzcmzVarZzP = zzclbVar.zzP();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlM)).booleanValue() && zzcmzVarZzP != null) {
            zzctq zzctqVar = this.zzd;
            zzcmzVarZzP.zzc(zzctqVar);
            zzcmzVarZzP.zze(zzctqVar, null, null);
        }
        zzclbVar.zzab("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdts
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzclb) obj, map);
            }
        });
        zzclbVar.zzab("/untrackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdtt
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzclb) obj, map);
            }
        });
        zzclbVar.zzP().zzJ(this.zze);
    }

    public final /* synthetic */ void zzb(zzclb zzclbVar, Map map) {
        this.zzb.zzd();
    }

    public final /* synthetic */ void zzc(zzclb zzclbVar, Map map) {
        this.zzb.zzb();
    }
}
