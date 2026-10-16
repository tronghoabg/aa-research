package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhvz extends zzhxt {
    private final zzhvx zza;
    private final zzhvy zzb;

    private zzhvz(zzhvx zzhvxVar, zzhvy zzhvyVar) {
        this.zza = zzhvxVar;
        this.zzb = zzhvyVar;
    }

    public static zzhvz zzb(zzhvx zzhvxVar, zzhvy zzhvyVar) {
        return new zzhvz(zzhvxVar, zzhvyVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvz)) {
            return false;
        }
        zzhvz zzhvzVar = (zzhvz) obj;
        return zzhvzVar.zza == this.zza && zzhvzVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhvz.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 1);
        AbstractC3256n.p(sb2, "ML-DSA Parameters (ML-DSA instance: ", string, ", variant: ", string2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzb != zzhvy.zzb;
    }
}
