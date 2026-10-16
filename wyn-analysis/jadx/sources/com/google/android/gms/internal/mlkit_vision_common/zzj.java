package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* loaded from: classes4.dex */
class zzj extends zzk {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzj(int i5) {
    }

    private final void zzb(int i5) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i5) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i10 = length + (length >> 1) + 1;
        if (i10 < i5) {
            int iHighestOneBit = Integer.highestOneBit(i5 - 1);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        if (i10 < 0) {
            i10 = f.API_PRIORITY_OTHER;
        }
        this.zza = Arrays.copyOf(objArr, i10);
        this.zzc = false;
    }

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        objArr[i5] = obj;
        return this;
    }
}
