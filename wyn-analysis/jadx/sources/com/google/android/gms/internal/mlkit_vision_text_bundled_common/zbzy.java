package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbzy extends zbub implements zbvn {
    private static final zbzy zbd;
    private int zbe;
    private double zbf;
    private int zbg;
    private int zbh;
    private double zbi;
    private double zbj;
    private byte zbk = 2;

    static {
        zbzy zbzyVar = new zbzy();
        zbd = zbzyVar;
        zbuf.zbD(zbzy.class, zbzyVar);
    }

    private zbzy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbk);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbd, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i10 == 3) {
            return new zbzy();
        }
        zbzw zbzwVar = null;
        if (i10 == 4) {
            return new zbzx(zbzwVar);
        }
        if (i10 == 5) {
            return zbd;
        }
        this.zbk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
