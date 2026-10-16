package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zznl {
    private final zznh zza;
    private final zznj zzb = null;
    private final zznj zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        this.zza = zzniVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznl) && AbstractC1732v.m(this.zza, ((zznl) obj).zza) && AbstractC1732v.m(null, null) && AbstractC1732v.m(null, null) && AbstractC1732v.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, null, null});
    }

    @zzbc(zza = 1)
    public final zznh zza() {
        return this.zza;
    }
}
