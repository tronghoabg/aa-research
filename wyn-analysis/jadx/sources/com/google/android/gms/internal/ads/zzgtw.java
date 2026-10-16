package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
final class zzgtw extends zzgtp {
    private final Object zza;

    public zzgtw(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtw) {
            return this.zza.equals(((zzgtw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        return M6.t(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgtp
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtp
    public final zzgtp zzb(zzgti zzgtiVar) {
        Object objApply = zzgtiVar.apply(this.zza);
        zzgtr.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgtw(objApply);
    }
}
