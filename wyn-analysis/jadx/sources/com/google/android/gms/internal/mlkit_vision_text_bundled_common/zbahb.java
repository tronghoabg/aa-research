package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbahb extends zbuf implements zbvn {
    private static final zbahb zbb;
    private Object zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbd = 0;
    private zbun zbi = zbuf.zby();

    static {
        zbahb zbahbVar = new zbahb();
        zbb = zbahbVar;
        zbuf.zbD(zbahb.class, zbahbVar);
    }

    private zbahb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003\u0004\u0004\u001b\u00057\u0000\u0006\u0004", new Object[]{"zbe", "zbd", "zbf", zbaha.class, "zbg", "zbi", zbsp.class, "zbh"});
        }
        if (i10 == 3) {
            return new zbahb();
        }
        zbagx zbagxVar = null;
        if (i10 == 4) {
            return new zbagy(zbagxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
