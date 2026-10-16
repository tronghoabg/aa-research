package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzhog {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhog(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhog)) {
            return false;
        }
        zzhog zzhogVar = (zzhog) obj;
        return zzhogVar.zza.equals(this.zza) && zzhogVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        return M6.t(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
