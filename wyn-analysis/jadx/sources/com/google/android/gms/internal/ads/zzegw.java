package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzegw implements zzegy {
    private final Map zza;
    private final zzhcp zzb;
    private final zzdgd zzc;

    public zzegw(Map map, zzhcp zzhcpVar, zzdgd zzdgdVar) {
        this.zza = map;
        this.zzb = zzhcpVar;
        this.zzc = zzdgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegy
    public final p8.p zza(final zzcbk zzcbkVar) {
        this.zzc.zzdP(zzcbkVar);
        p8.p pVarZzc = zzhcf.zzc(new zzeel(3));
        for (String str : ((String) C0395s.f2489e.f2492c.zzd(zzbix.zzjD)).split(",")) {
            final zzino zzinoVar = (zzino) this.zza.get(str.trim());
            if (zzinoVar != null) {
                pVarZzc = zzhcf.zzh(pVarZzc, zzeel.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzegv
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ p8.p zza(Object obj) {
                        return ((zzegy) zzinoVar.zzb()).zza(zzcbkVar);
                    }
                }, this.zzb);
            }
        }
        zzhcf.zzr(pVarZzc, new zzegu(this), zzcfy.zzh);
        return pVarZzc;
    }

    public final /* synthetic */ zzdgd zzb() {
        return this.zzc;
    }
}
