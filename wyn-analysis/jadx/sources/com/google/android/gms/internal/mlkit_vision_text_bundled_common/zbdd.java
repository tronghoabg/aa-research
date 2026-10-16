package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbdd extends zbuf implements zbvn {
    private static final zbdd zbb;
    private int zbd;
    private zbhl zbe;

    static {
        zbdd zbddVar = new zbdd();
        zbb = zbddVar;
        zbuf.zbD(zbdd.class, zbddVar);
    }

    private zbdd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i10 == 3) {
            return new zbdd();
        }
        zbda zbdaVar = null;
        if (i10 == 4) {
            return new zbdc(zbdaVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
