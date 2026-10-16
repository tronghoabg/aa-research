package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zznh {
    private final String zza;
    private final zznf zzc;
    private final String zze;
    private final zzne zzf;
    private final String zzb = null;
    private final String zzd = null;
    private final Long zzg = null;
    private final Boolean zzh = null;
    private final Boolean zzi = null;

    public /* synthetic */ zznh(zznd zzndVar, zzng zzngVar) {
        this.zza = zzndVar.zza;
        this.zzc = zzndVar.zzb;
        this.zze = zzndVar.zzc;
        this.zzf = zzndVar.zzd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznhVar = (zznh) obj;
        return AbstractC1732v.m(this.zza, zznhVar.zza) && AbstractC1732v.m(null, null) && AbstractC1732v.m(this.zzc, zznhVar.zzc) && AbstractC1732v.m(null, null) && AbstractC1732v.m(this.zze, zznhVar.zze) && AbstractC1732v.m(this.zzf, zznhVar.zzf) && AbstractC1732v.m(null, null) && AbstractC1732v.m(null, null) && AbstractC1732v.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null});
    }

    @zzbc(zza = 6)
    public final zzne zza() {
        return this.zzf;
    }

    @zzbc(zza = 3)
    public final zznf zzb() {
        return this.zzc;
    }

    @zzbc(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @zzbc(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}
