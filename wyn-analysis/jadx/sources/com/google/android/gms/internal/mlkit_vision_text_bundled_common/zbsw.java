package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import R8.v;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
final class zbsw extends zbtb {
    private final int zbc;

    public zbsw(byte[] bArr, int i5, int i10) {
        super(bArr);
        zbtc.zbh(0, i10, bArr.length);
        this.zbc = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zba(int i5) {
        int i10 = this.zbc;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return ((zbtb) this).zba[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC3256n.g(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(v.e(i5, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zbb(int i5) {
        return ((zbtb) this).zba[i5];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
    public final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final int zbd() {
        return this.zbc;
    }
}
