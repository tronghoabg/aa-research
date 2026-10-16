package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbyu extends zbuf implements zbvn {
    private static final zbyu zbb;
    private int zbd;
    private int zbe;

    static {
        zbyu zbyuVar = new zbyu();
        zbb = zbyuVar;
        zbuf.zbD(zbyu.class, zbyuVar);
    }

    private zbyu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i10 == 3) {
            return new zbyu();
        }
        zbwz zbwzVar = null;
        if (i10 == 4) {
            return new zbyt(zbwzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
