package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzajj extends zzajs {
    public final byte[] zza;

    public zzajj(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajj.class == obj.getClass()) {
            zzajj zzajjVar = (zzajj) obj;
            if (this.zzf.equals(zzajjVar.zzf) && Arrays.equals(this.zza, zzajjVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }
}
