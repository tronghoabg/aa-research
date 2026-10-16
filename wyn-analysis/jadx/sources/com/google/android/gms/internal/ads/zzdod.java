package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzdod implements zzcyd {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzino zzd;
    private final zzdql zze;

    public zzdod(Map map, Map map2, Map map3, zzino zzinoVar, zzdql zzdqlVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzinoVar;
        this.zze = zzdqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final zzema zza(int i5, String str) {
        zzema zzemaVarZza;
        zzema zzemaVar = (zzema) this.zza.get(str);
        if (zzemaVar != null) {
            return zzemaVar;
        }
        if (i5 != 1) {
            if (i5 != 4) {
                return null;
            }
            zzeog zzeogVar = (zzeog) this.zzc.get(str);
            if (zzeogVar != null) {
                return zzcyi.zza(zzeogVar);
            }
            zzemaVarZza = (zzema) this.zzb.get(str);
            if (zzemaVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzemaVarZza = ((zzcyd) this.zzd.zzb()).zza(i5, str)) == null) {
            return null;
        }
        return zzcyi.zzb(zzemaVarZza);
    }
}
