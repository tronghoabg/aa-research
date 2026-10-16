package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbia extends zbuf implements zbvn {
    private static final zbia zbb;
    private int zbd;
    private Object zbf;
    private int zbg;
    private int zbh;
    private int zbe = 0;
    private zbun zbi = zbuf.zby();

    static {
        zbia zbiaVar = new zbia();
        zbb = zbiaVar;
        zbuf.zbD(zbia.class, zbiaVar);
    }

    private zbia() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001=\u0000\u0002င\u0000\u0003င\u0001\u0004<\u0000\u0005\u001b", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", zbhz.class, "zbi", zbhv.class});
        }
        if (i10 == 3) {
            return new zbia();
        }
        zbhs zbhsVar = null;
        if (i10 == 4) {
            return new zbht(zbhsVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
