package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzhnu {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhnu(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnu)) {
            return false;
        }
        zzhnu zzhnuVar = (zzhnu) obj;
        return zzhnuVar.zza.equals(this.zza) && zzhnuVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        return M6.t(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
