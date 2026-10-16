package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbada extends zbuf implements zbvn {
    private static final zbada zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private float zbj;
    private zbact zbk;
    private int zbl;
    private int zbm;
    private float zbn;

    static {
        zbada zbadaVar = new zbada();
        zbb = zbadaVar;
        zbuf.zbD(zbada.class, zbadaVar);
    }

    private zbada() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0007\u0005᠌\b\u0006ခ\t\u0007ဉ\u0006\tခ\u0003\nခ\u0004\u000bခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbl", zbacy.zba, "zbm", zbacz.zba, "zbn", "zbk", "zbh", "zbi", "zbj"});
        }
        if (i10 == 3) {
            return new zbada();
        }
        zbacp zbacpVar = null;
        if (i10 == 4) {
            return new zbacx(zbacpVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
