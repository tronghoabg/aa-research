package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbacr extends zbuf implements zbvn {
    private static final zbacr zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private float zbg;
    private float zbh;

    static {
        zbacr zbacrVar = new zbacr();
        zbb = zbacrVar;
        zbuf.zbD(zbacr.class, zbacrVar);
    }

    private zbacr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0000", new Object[]{"zbd", "zbf", "zbg", "zbh", "zbe", zbadc.zba});
        }
        if (i10 == 3) {
            return new zbacr();
        }
        zbacp zbacpVar = null;
        if (i10 == 4) {
            return new zbacq(zbacpVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
