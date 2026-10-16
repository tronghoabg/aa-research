package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhgz extends zzhfh {
    private final zzhgy zza;

    private zzhgz(zzhgy zzhgyVar) {
        this.zza = zzhgyVar;
    }

    public static zzhgz zzb(zzhgy zzhgyVar) {
        return new zzhgz(zzhgyVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhgz) && ((zzhgz) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhgz.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return M6.t(new StringBuilder(string.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhgy.zzc;
    }

    public final zzhgy zzc() {
        return this.zza;
    }
}
