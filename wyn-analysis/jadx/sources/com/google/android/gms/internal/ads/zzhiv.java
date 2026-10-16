package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhiv extends zzhfh {
    private final zzhiu zza;

    private zzhiv(zzhiu zzhiuVar) {
        this.zza = zzhiuVar;
    }

    public static zzhiv zzb(zzhiu zzhiuVar) {
        return new zzhiv(zzhiuVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhiv) && ((zzhiv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhiv.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return M6.t(new StringBuilder(string.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhiu.zzc;
    }

    public final zzhiu zzc() {
        return this.zza;
    }
}
