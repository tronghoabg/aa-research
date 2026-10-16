package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhmn extends zzheq {
    private final zzhoa zza;

    public zzhmn(zzhoa zzhoaVar) {
        this.zza = zzhoaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmn)) {
            return false;
        }
        zzhoa zzhoaVar = ((zzhmn) obj).zza;
        zzhoa zzhoaVar2 = this.zza;
        return zzhoaVar2.zzc().zzc().equals(zzhoaVar.zzc().zzc()) && zzhoaVar2.zzc().zza().equals(zzhoaVar.zzc().zza()) && zzhoaVar2.zzc().zzb().equals(zzhoaVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhoa zzhoaVar = this.zza;
        return Objects.hash(zzhoaVar.zzc(), zzhoaVar.zzf());
    }

    public final String toString() {
        zzhoa zzhoaVar = this.zza;
        String strZza = zzhoaVar.zzc().zza();
        int iOrdinal = zzhoaVar.zzc().zzc().ordinal();
        return R8.v.g("(typeUrl=", strZza, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhtx.RAW;
    }

    public final zzhoa zzb() {
        return this.zza;
    }
}
