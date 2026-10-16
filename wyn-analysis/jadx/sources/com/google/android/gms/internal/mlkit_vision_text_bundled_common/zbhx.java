package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbhx extends zbuf implements zbvn {
    private static final zbhx zbb;
    private zbuk zbd = zbuf.zbv();

    static {
        zbhx zbhxVar = new zbhx();
        zbb = zbhxVar;
        zbuf.zbD(zbhx.class, zbhxVar);
    }

    private zbhx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i10 == 3) {
            return new zbhx();
        }
        zbhs zbhsVar = null;
        if (i10 == 4) {
            return new zbhw(zbhsVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
