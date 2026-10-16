package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzham implements Serializable {
    private static final zzham zza = new zzham(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzham(int[] iArr, int i5, int i10) {
        this.zzb = iArr;
        this.zzc = i10;
    }

    public static zzham zza() {
        return zza;
    }

    public static zzham zzb(int i5, int i10, int i11) {
        return new zzham(new int[]{0, 2, 1}, 0, 3);
    }

    public static zzham zzc(int i5, int i10, int i11, int i12, int i13) {
        return new zzham(new int[]{0, 2, 1, 3, 4}, 0, 5);
    }

    public static zzham zzd(int i5, int i10, int i11, int i12, int i13, int i14) {
        return new zzham(new int[]{0, 2, 1, 5, 3, 4}, 0, 6);
    }

    public static zzham zze(int i5, int... iArr) {
        int length = iArr.length;
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new zzham(iArr2, 0, i10);
    }

    public static zzham zzf(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzham(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public static zzhal zzg(int i5) {
        zzgtr.zzd(i5 >= 0, "Invalid initialCapacity: %s", i5);
        return new zzhal(i5);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzham)) {
            return false;
        }
        zzham zzhamVar = (zzham) obj;
        int i5 = this.zzc;
        if (i5 != zzhamVar.zzc) {
            return false;
        }
        for (int i10 = 0; i10 < i5; i10++) {
            if (zzi(i10) != zzhamVar.zzi(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i5 = (i5 * 31) + this.zzb[i10];
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
        int[] iArr = this.zzb;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i5; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zzh() {
        return this.zzc;
    }

    public final int zzi(int i5) {
        zzgtr.zzm(i5, this.zzc, "index");
        return this.zzb[i5];
    }

    public /* synthetic */ zzham(int[] iArr, int i5, int i10, byte[] bArr) {
        this(iArr, 0, i10);
    }
}
