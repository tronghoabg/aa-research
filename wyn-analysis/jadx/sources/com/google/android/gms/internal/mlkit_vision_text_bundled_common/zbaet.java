package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaet extends zbuf implements zbvn {
    private static final zbaet zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private float zbi;
    private float zbj;
    private zbuk zbk = zbuf.zbv();
    private zbul zbl = zbuf.zbw();
    private zbul zbm = zbuf.zbw();

    static {
        zbaet zbaetVar = new zbaet();
        zbb = zbaetVar;
        zbuf.zbD(zbaet.class, zbaetVar);
    }

    private zbaet() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007$\b'\t'", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm"});
        }
        if (i10 == 3) {
            return new zbaet();
        }
        zbaer zbaerVar = null;
        if (i10 == 4) {
            return new zbaes(zbaerVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
