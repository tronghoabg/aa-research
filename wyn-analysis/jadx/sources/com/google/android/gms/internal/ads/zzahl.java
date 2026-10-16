package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzahl {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzahl(int i5, byte[] bArr, int i10, int i11) {
        this.zza = i5;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahl.class == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.zza == zzahlVar.zza && this.zzc == zzahlVar.zzc && this.zzd == zzahlVar.zzd && Arrays.equals(this.zzb, zzahlVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i5 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
