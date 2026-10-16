package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public final class zzcbt extends zzcbv {
    private final String zza;
    private final int zzb;

    public zzcbt(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcbt)) {
            return false;
        }
        zzcbt zzcbtVar = (zzcbt) obj;
        if (AbstractC1732v.m(this.zza, zzcbtVar.zza)) {
            if (AbstractC1732v.m(Integer.valueOf(this.zzb), Integer.valueOf(zzcbtVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int zzc() {
        return this.zzb;
    }
}
