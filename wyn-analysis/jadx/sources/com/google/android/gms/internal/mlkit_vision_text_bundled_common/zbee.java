package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbee extends zbuf implements zbvn {
    private static final zbee zbb;
    private int zbd;
    private int zbe = 3;
    private float zbf = 100000.0f;
    private float zbg;

    static {
        zbee zbeeVar = new zbee();
        zbb = zbeeVar;
        zbuf.zbD(zbee.class, zbeeVar);
    }

    private zbee() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zbd", "zbe", zbec.zba, "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbee();
        }
        zbeb zbebVar = null;
        if (i10 == 4) {
            return new zbed(zbebVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
