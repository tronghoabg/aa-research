package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzsd {
    private final zzsb zza;
    private final Boolean zzb = null;
    private final String zzc = null;

    public /* synthetic */ zzsd(zzsa zzsaVar, zzsc zzscVar) {
        this.zza = zzsaVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzsd) && AbstractC1732v.m(this.zza, ((zzsd) obj).zza) && AbstractC1732v.m(null, null) && AbstractC1732v.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, null});
    }

    @zzcx(zza = 3)
    public final zzsb zza() {
        return this.zza;
    }
}
