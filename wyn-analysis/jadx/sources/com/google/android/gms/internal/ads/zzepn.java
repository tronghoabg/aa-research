package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzepn {
    private final zzflz zza;
    private final zzdxh zzb;
    private final zzdzt zzc;

    public zzepn(zzflz zzflzVar, zzdxh zzdxhVar, zzdzt zzdztVar) {
        this.zza = zzflzVar;
        this.zzb = zzdxhVar;
        this.zzc = zzdztVar;
    }

    public final void zza(zzfkq zzfkqVar, zzfkn zzfknVar, int i5, zzeme zzemeVar, long j8) {
        zzdxg zzdxgVarZzc;
        zzdzs zzdzsVarZza = this.zzc.zza();
        zzdzsVarZza.zza(zzfkqVar);
        zzdzsVarZza.zzb(zzfknVar);
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_status");
        zzdzsVarZza.zzc("adapter_l", String.valueOf(j8));
        zzdzsVarZza.zzc("sc", Integer.toString(i5));
        if (zzemeVar != null) {
            zzdzsVarZza.zzc("arec", Integer.toString(zzemeVar.zzb().f2338a));
            String strZza = this.zza.zza(zzemeVar.getMessage());
            if (strZza != null) {
                zzdzsVarZza.zzc("areec", strZza);
            }
        }
        zzdxh zzdxhVar = this.zzb;
        Iterator it = zzfknVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdxgVarZzc = null;
                break;
            } else {
                zzdxgVarZzc = zzdxhVar.zzc((String) it.next());
                if (zzdxgVarZzc != null) {
                    break;
                }
            }
        }
        if (zzdxgVarZzc != null) {
            zzdzsVarZza.zzc("ancn", zzdxgVarZzc.zza);
            zzbxx zzbxxVar = zzdxgVarZzc.zzb;
            if (zzbxxVar != null) {
                zzdzsVarZza.zzc("adapter_v", zzbxxVar.toString());
            }
            zzbxx zzbxxVar2 = zzdxgVarZzc.zzc;
            if (zzbxxVar2 != null) {
                zzdzsVarZza.zzc("adapter_sv", zzbxxVar2.toString());
            }
        }
        zzdzsVarZza.zzd();
    }
}
