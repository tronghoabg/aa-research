package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzes {
    private final zzou zza;
    private final Boolean zzc;
    private final zzsd zze;
    private final Boolean zzb = null;
    private final zzod zzd = null;

    public /* synthetic */ zzes(zzeq zzeqVar, zzer zzerVar) {
        this.zza = zzeqVar.zza;
        this.zzc = zzeqVar.zzb;
        this.zze = zzeqVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj;
        return AbstractC1732v.m(this.zza, zzesVar.zza) && AbstractC1732v.m(null, null) && AbstractC1732v.m(this.zzc, zzesVar.zzc) && AbstractC1732v.m(null, null) && AbstractC1732v.m(this.zze, zzesVar.zze);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze});
    }

    @zzcx(zza = 1)
    public final zzou zza() {
        return this.zza;
    }

    @zzcx(zza = 5)
    public final zzsd zzb() {
        return this.zze;
    }

    @zzcx(zza = 3)
    public final Boolean zzc() {
        return this.zzc;
    }
}
