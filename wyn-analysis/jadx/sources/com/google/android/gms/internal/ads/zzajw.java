package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzajw extends zzajs {
    public final String zza;
    public final byte[] zzb;

    public zzajw(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajw.class == obj.getClass()) {
            zzajw zzajwVar = (zzajw) obj;
            if (Objects.equals(this.zza, zzajwVar.zza) && Arrays.equals(this.zzb, zzajwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return Arrays.hashCode(this.zzb) + (iHashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        return M6.t(new StringBuilder(str2.length() + length + 8), str, ": owner=", str2);
    }
}
