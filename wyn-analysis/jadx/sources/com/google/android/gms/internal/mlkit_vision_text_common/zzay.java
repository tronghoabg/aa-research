package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;

/* loaded from: classes4.dex */
final class zzay extends zzam {
    final /* synthetic */ zzba zza;
    private final Object zzb;
    private int zzc;

    public zzay(zzba zzbaVar, int i5) {
        this.zza = zzbaVar;
        this.zzb = zzba.zzg(zzbaVar, i5);
        this.zzc = i5;
    }

    private final void zza() {
        int i5 = this.zzc;
        if (i5 == -1 || i5 >= this.zza.size() || !zzw.zza(this.zzb, zzba.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i5 = this.zzc;
        if (i5 == -1) {
            return null;
        }
        return zzba.zzj(this.zza, i5);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i5 = this.zzc;
        if (i5 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzba zzbaVar = this.zza;
        Object objZzj = zzba.zzj(zzbaVar, i5);
        zzba.zzn(zzbaVar, this.zzc, obj);
        return objZzj;
    }
}
