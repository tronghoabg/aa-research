package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;

/* loaded from: classes3.dex */
public final class zzfe extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzfe(int i5, int i10) {
        super(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? AbstractC0279p0.o(new StringBuilder(String.valueOf(i10).length() + 31), "Player stuck suppressed for ", i10, " ms") : AbstractC0279p0.o(new StringBuilder(String.valueOf(i10).length() + 43), "Player stuck playing without ending for ", i10, " ms") : AbstractC0279p0.o(new StringBuilder(String.valueOf(i10).length() + 45), "Player stuck playing with no progress for ", i10, " ms") : AbstractC0279p0.o(new StringBuilder(String.valueOf(i10).length() + 47), "Player stuck buffering with no progress for ", i10, " ms") : AbstractC0279p0.o(new StringBuilder(String.valueOf(i10).length() + 46), "Player stuck buffering and not loading for ", i10, " ms"));
        this.zza = i5;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfe.class == obj.getClass()) {
            zzfe zzfeVar = (zzfe) obj;
            if (this.zza == zzfeVar.zza && this.zzb == zzfeVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + 527) * 31) + this.zzb;
    }
}
