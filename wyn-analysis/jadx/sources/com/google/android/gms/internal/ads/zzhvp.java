package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhvp extends zzhxt {
    private final zzhvo zza;

    private zzhvp(zzhvo zzhvoVar) {
        this.zza = zzhvoVar;
    }

    public static zzhvp zzb(zzhvo zzhvoVar) {
        return new zzhvp(zzhvoVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhvp) && ((zzhvp) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhvp.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return M6.t(new StringBuilder(string.length() + 30), "Ed25519 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhvo.zzd;
    }

    public final zzhvo zzc() {
        return this.zza;
    }
}
