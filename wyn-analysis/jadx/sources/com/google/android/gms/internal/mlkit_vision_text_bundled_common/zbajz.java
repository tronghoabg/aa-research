package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbajz extends zbuf implements zbvn {
    private static final zbajz zbb;
    private zbuk zbd = zbuf.zbv();

    static {
        zbajz zbajzVar = new zbajz();
        zbb = zbajzVar;
        zbuf.zbD(zbajz.class, zbajzVar);
    }

    private zbajz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i10 == 3) {
            return new zbajz();
        }
        zbajx zbajxVar = null;
        if (i10 == 4) {
            return new zbajy(zbajxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
