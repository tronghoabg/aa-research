package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.common.api.f;

/* loaded from: classes4.dex */
final class zbte extends zbtg {
    private int zbb;
    private int zbc;
    private int zbd;

    public /* synthetic */ zbte(byte[] bArr, int i5, int i10, boolean z2, zbtd zbtdVar) {
        super(null);
        this.zbd = f.API_PRIORITY_OTHER;
        this.zbb = 0;
    }

    public final int zba(int i5) throws zbuq {
        int i10 = this.zbd;
        this.zbd = 0;
        int i11 = this.zbb + this.zbc;
        this.zbb = i11;
        if (i11 <= 0) {
            this.zbc = 0;
            return i10;
        }
        this.zbc = i11;
        this.zbb = 0;
        return i10;
    }
}
