package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* loaded from: classes3.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i5) {
    }

    public final zzaa zza(Object obj) {
        int i5;
        obj.getClass();
        int length = this.zza.length;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i11 <= length) {
            i5 = length;
        } else {
            i5 = (length >> 1) + length + 1;
            if (i5 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                i5 = iHighestOneBit + iHighestOneBit;
            }
            if (i5 < 0) {
                i5 = f.API_PRIORITY_OTHER;
            }
        }
        if (i5 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i5);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        objArr[i12] = obj;
        return this;
    }
}
