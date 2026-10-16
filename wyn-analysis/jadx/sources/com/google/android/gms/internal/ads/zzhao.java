package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zzhao implements Serializable {
    private static final zzhao zza = new zzhao(new long[0], 0, 0);
    private final long[] zzb;
    private final int zzc;

    private zzhao(long[] jArr, int i5, int i10) {
        this.zzb = jArr;
        this.zzc = i10;
    }

    public static zzhan zza(int i5) {
        return new zzhan(i5);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhao)) {
            return false;
        }
        zzhao zzhaoVar = (zzhao) obj;
        int i5 = this.zzc;
        if (i5 != zzhaoVar.zzc) {
            return false;
        }
        for (int i10 = 0; i10 < i5; i10++) {
            if (zzc(i10) != zzhaoVar.zzc(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long j8 = this.zzb[i10];
            i5 = (i5 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i5;
    }

    public final String toString() {
        int i5 = this.zzc;
        if (i5 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i5 * 5);
        sb2.append('[');
        long[] jArr = this.zzb;
        sb2.append(jArr[0]);
        for (int i10 = 1; i10 < i5; i10++) {
            sb2.append(", ");
            sb2.append(jArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final long zzc(int i5) {
        zzgtr.zzm(i5, this.zzc, "index");
        return this.zzb[i5];
    }

    public /* synthetic */ zzhao(long[] jArr, int i5, int i10, byte[] bArr) {
        this(jArr, 0, i10);
    }
}
