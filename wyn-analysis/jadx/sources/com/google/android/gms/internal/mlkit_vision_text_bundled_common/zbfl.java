package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbfl extends zbuf implements zbvn {
    private static final zbfl zbb;
    private int zbd;
    private float zbe;
    private boolean zbf;
    private zbtc zbg = zbtc.zbb;

    static {
        zbfl zbflVar = new zbfl();
        zbb = zbflVar;
        zbuf.zbD(zbfl.class, zbflVar);
    }

    private zbfl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001\u0003ည\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbfl();
        }
        zbfj zbfjVar = null;
        if (i10 == 4) {
            return new zbfk(zbfjVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
