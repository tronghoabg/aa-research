package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbgc extends zbuf implements zbvn {
    private static final zbgc zbb;
    private int zbd;
    private int zbe;
    private int zbf;

    static {
        zbgc zbgcVar = new zbgc();
        zbb = zbgcVar;
        zbuf.zbD(zbgc.class, zbgcVar);
    }

    private zbgc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbgc();
        }
        zbfy zbfyVar = null;
        if (i10 == 4) {
            return new zbgb(zbfyVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
