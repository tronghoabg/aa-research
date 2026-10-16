package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zbku extends zbkr {
    public zbku() {
        super(4);
    }

    public final zbku zba(Object obj) {
        int i5 = this.zbb;
        int i10 = i5 + 1;
        Object[] objArr = this.zba;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int iHighestOneBit = Integer.highestOneBit(i5);
                i11 = iHighestOneBit + iHighestOneBit;
            }
            if (i11 < 0) {
                i11 = f.API_PRIORITY_OTHER;
            }
            this.zba = Arrays.copyOf(objArr, i11);
            this.zbc = false;
        } else if (this.zbc) {
            this.zba = (Object[]) objArr.clone();
            this.zbc = false;
        }
        Object[] objArr2 = this.zba;
        int i12 = this.zbb;
        this.zbb = i12 + 1;
        objArr2[i12] = obj;
        return this;
    }

    public final zbkx zbb() {
        this.zbc = true;
        return zbkx.zbg(this.zba, this.zbb);
    }
}
