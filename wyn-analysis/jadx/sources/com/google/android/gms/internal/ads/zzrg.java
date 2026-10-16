package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzrg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    public /* synthetic */ zzrg(zzrf zzrfVar, byte[] bArr) {
        this.zza = zzrfVar.zzi();
        this.zzb = zzrfVar.zzj();
        this.zzc = zzrfVar.zzk();
        this.zze = zzrfVar.zzl();
        this.zzf = zzrfVar.zzm();
        this.zzg = zzrfVar.zzn();
        this.zzh = zzrfVar.zzo();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrg.class == obj.getClass()) {
            zzrg zzrgVar = (zzrg) obj;
            if (this.zza == zzrgVar.zza && this.zzb == zzrgVar.zzb && this.zzc == zzrgVar.zzc && this.zze == zzrgVar.zze && this.zzg == zzrgVar.zzg && this.zzh == zzrgVar.zzh && this.zzf.equals(zzrgVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.zza);
        Integer numValueOf2 = Integer.valueOf(this.zzb);
        Integer numValueOf3 = Integer.valueOf(this.zzc);
        Integer numValueOf4 = Integer.valueOf(this.zze);
        zzd zzdVar = this.zzf;
        Integer numValueOf5 = Integer.valueOf(this.zzg);
        Integer numValueOf6 = Integer.valueOf(this.zzh);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, numValueOf4, zzdVar, numValueOf5, numValueOf6, bool, bool);
    }
}
