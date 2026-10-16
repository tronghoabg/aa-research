package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbabi extends zbuf implements zbvn {
    private static final zbabi zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg = 1;
    private int zbh = 1;

    static {
        zbabi zbabiVar = new zbabi();
        zbb = zbabiVar;
        zbuf.zbD(zbabi.class, zbabiVar);
    }

    private zbabi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new zbabi();
        }
        zbaad zbaadVar = null;
        if (i10 == 4) {
            return new zbabh(zbaadVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
