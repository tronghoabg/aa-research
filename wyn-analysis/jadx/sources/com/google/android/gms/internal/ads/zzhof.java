package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzhof {
    private final Class zza;
    private final zzibk zzb;

    public /* synthetic */ zzhof(Class cls, zzibk zzibkVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzibkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhof)) {
            return false;
        }
        zzhof zzhofVar = (zzhof) obj;
        return zzhofVar.zza.equals(this.zza) && zzhofVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzibk zzibkVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzibkVar);
        return M6.t(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
