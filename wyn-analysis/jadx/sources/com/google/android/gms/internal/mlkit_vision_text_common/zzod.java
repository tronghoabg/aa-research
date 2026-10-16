package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzod {
    private final zzob zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzod(zzoa zzoaVar, zzoc zzocVar) {
        this.zza = zzoaVar.zza;
        this.zzb = zzoaVar.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzod)) {
            return false;
        }
        zzod zzodVar = (zzod) obj;
        return AbstractC1732v.m(this.zza, zzodVar.zza) && AbstractC1732v.m(this.zzb, zzodVar.zzb) && AbstractC1732v.m(null, null) && AbstractC1732v.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, null});
    }

    @zzcx(zza = 1)
    public final zzob zza() {
        return this.zza;
    }

    @zzcx(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
