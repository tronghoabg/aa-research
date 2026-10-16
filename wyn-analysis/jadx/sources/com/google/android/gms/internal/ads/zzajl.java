package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzajl extends zzajs {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzajs[] zze;

    public zzajl(String str, boolean z2, boolean z10, String[] strArr, zzajs[] zzajsVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = strArr;
        this.zze = zzajsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajl.class == obj.getClass()) {
            zzajl zzajlVar = (zzajl) obj;
            if (this.zzb == zzajlVar.zzb && this.zzc == zzajlVar.zzc && Objects.equals(this.zza, zzajlVar.zza) && Arrays.equals(this.zzd, zzajlVar.zzd) && Arrays.equals(this.zze, zzajlVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (this.zzb ? 1 : 0) + 527;
        String str = this.zza;
        return str.hashCode() + (((i5 * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
