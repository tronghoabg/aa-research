package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzyp {
    public final int zza;
    public final boolean zzb;

    public zzyp(int i5, boolean z2) {
        this.zza = i5;
        this.zzb = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyp.class == obj.getClass()) {
            zzyp zzypVar = (zzyp) obj;
            if (this.zza == zzypVar.zza && this.zzb == zzypVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
