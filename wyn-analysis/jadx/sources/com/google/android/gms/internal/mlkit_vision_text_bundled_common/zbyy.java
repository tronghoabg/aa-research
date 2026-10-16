package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbyy extends zbuf implements zbvn {
    private static final zbyy zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private zbza zbf;
    private zbxh zbg;

    static {
        zbyy zbyyVar = new zbyy();
        zbb = zbyyVar;
        zbuf.zbD(zbyy.class, zbyyVar);
    }

    private zbyy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zbd", "zbe", zbzo.class, "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbyy();
        }
        zbwz zbwzVar = null;
        if (i10 == 4) {
            return new zbyx(zbwzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
