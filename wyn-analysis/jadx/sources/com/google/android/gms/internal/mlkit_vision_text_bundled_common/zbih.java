package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbih extends zbuf implements zbvn {
    private static final zbih zbb;
    private int zbd;
    private zbhl zbe;
    private zbhl zbf;

    static {
        zbih zbihVar = new zbih();
        zbb = zbihVar;
        zbuf.zbD(zbih.class, zbihVar);
    }

    private zbih() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbih();
        }
        zbie zbieVar = null;
        if (i10 == 4) {
            return new zbig(zbieVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
