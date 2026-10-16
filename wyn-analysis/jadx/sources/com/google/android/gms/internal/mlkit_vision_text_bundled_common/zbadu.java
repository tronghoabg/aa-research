package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbadu extends zbuf implements zbvn {
    private static final zbadu zbb;
    private int zbd;
    private String zbe = "";
    private zbuk zbf = zbuf.zbv();
    private zbuk zbg = zbuf.zbv();
    private zbun zbh = zbuf.zby();

    static {
        zbadu zbaduVar = new zbadu();
        zbb = zbaduVar;
        zbuf.zbD(zbadu.class, zbaduVar);
    }

    private zbadu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002$\u0003$\u0004\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new zbadu();
        }
        zbadn zbadnVar = null;
        if (i10 == 4) {
            return new zbadt(zbadnVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
