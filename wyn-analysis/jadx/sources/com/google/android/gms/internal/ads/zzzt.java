package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzzt {
    public final long zza;
    public final long zzb;

    public zzzt(long j8, long j10) {
        this.zza = j8;
        this.zzb = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzt)) {
            return false;
        }
        zzzt zzztVar = (zzzt) obj;
        return this.zza == zzztVar.zza && this.zzb == zzztVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
