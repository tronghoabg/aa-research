package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzajv extends zzajs {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzajv(int i5, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajv.class == obj.getClass()) {
            zzajv zzajvVar = (zzajv) obj;
            if (this.zza == zzajvVar.zza && this.zzb == zzajvVar.zzb && this.zzc == zzajvVar.zzc && Arrays.equals(this.zzd, zzajvVar.zzd) && Arrays.equals(this.zze, zzajvVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zza + 527;
        int[] iArr = this.zzd;
        int iHashCode = Arrays.hashCode(iArr) + (((((i5 * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode * 31);
    }
}
