package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzajk extends zzajs implements zzaiz {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzajs[] zzg;

    public zzajk(String str, int i5, int i10, long j8, long j10, zzajs[] zzajsVarArr) {
        String str2;
        super("CHAP");
        zzgtr.zza(i5 <= i10);
        this.zza = str;
        this.zzb = i5;
        this.zzc = i10;
        int length = zzajsVarArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str2 = null;
                break;
            }
            zzajs zzajsVar = zzajsVarArr[i11];
            if (zzajsVar instanceof zzajx) {
                zzajx zzajxVar = (zzajx) zzajsVar;
                if (zzajxVar.zzf.equals("TIT2") && !zzajxVar.zzb.isEmpty()) {
                    str2 = (String) zzajxVar.zzb.get(0);
                    break;
                }
            }
            i11++;
        }
        if (str2 != null) {
            new zzx(null, str2);
        }
        this.zzd = j8;
        this.zze = j10;
        this.zzg = zzajsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajk.class == obj.getClass()) {
            zzajk zzajkVar = (zzajk) obj;
            if (this.zzb == zzajkVar.zzb && this.zzc == zzajkVar.zzc && this.zzd == zzajkVar.zzd && this.zze == zzajkVar.zze && Objects.equals(this.zza, zzajkVar.zza) && Arrays.equals(this.zzg, zzajkVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb + 527;
        String str = this.zza;
        long j8 = this.zze;
        return str.hashCode() + (((((((i5 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j8)) * 31);
    }
}
