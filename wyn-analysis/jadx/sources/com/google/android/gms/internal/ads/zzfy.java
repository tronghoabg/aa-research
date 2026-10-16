package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfy implements zzao {
    public final int zza;

    public zzfy(int i5) {
        this.zza = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfy) && this.zza == ((zzfy) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i5 = this.zza;
        return N0.a.d(i5, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i5).length() + 19));
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
