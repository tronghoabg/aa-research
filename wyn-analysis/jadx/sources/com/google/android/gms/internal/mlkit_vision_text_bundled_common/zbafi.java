package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbafi extends zbuf implements zbvn {
    private static final zbafi zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        zbafi zbafiVar = new zbafi();
        zbb = zbafiVar;
        zbuf.zbD(zbafi.class, zbafiVar);
    }

    private zbafi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zbe", "zbd", zbafa.class, zbaew.class});
        }
        if (i10 == 3) {
            return new zbafi();
        }
        zbafg zbafgVar = null;
        if (i10 == 4) {
            return new zbafh(zbafgVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
