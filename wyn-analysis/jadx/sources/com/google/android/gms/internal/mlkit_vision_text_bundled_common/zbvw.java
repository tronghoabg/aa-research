package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
final class zbvw implements zbvj {
    private final zbvm zba;
    private final String zbb;
    private final Object[] zbc;
    private final int zbd;

    public zbvw(zbvm zbvmVar, String str, Object[] objArr) {
        this.zba = zbvmVar;
        this.zbb = str;
        this.zbc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zbd = cCharAt;
            return;
        }
        int i5 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.zbd = i5 | (cCharAt2 << i11);
                return;
            } else {
                i5 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final zbvm zba() {
        return this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final boolean zbb() {
        return (this.zbd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final int zbc() {
        int i5 = this.zbd;
        if ((i5 & 1) != 0) {
            return 1;
        }
        return (i5 & 4) == 4 ? 3 : 2;
    }

    public final String zbd() {
        return this.zbb;
    }

    public final Object[] zbe() {
        return this.zbc;
    }
}
