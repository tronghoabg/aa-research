package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhhj extends zzhfh {
    private final String zza;
    private final zzhhi zzb;

    private zzhhj(String str, zzhhi zzhhiVar) {
        this.zza = str;
        this.zzb = zzhhiVar;
    }

    public static zzhhj zzb(String str, zzhhi zzhhiVar) {
        return new zzhhj(str, zzhhiVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhj)) {
            return false;
        }
        zzhhj zzhhjVar = (zzhhj) obj;
        return zzhhjVar.zza.equals(this.zza) && zzhhjVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhhj.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        AbstractC3256n.p(sb2, "LegacyKmsAead Parameters (keyUri: ", str, ", variant: ", string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzb != zzhhi.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhhi zzd() {
        return this.zzb;
    }
}
