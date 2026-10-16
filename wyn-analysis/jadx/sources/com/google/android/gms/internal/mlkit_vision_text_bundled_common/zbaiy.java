package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaiy extends zbuf implements zbvn {
    private static final zbaiy zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        zbaiy zbaiyVar = new zbaiy();
        zbb = zbaiyVar;
        zbuf.zbD(zbaiy.class, zbaiyVar);
    }

    private zbaiy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zbe", "zbd", zbakr.class, zbakc.class, zbalm.class});
        }
        if (i10 == 3) {
            return new zbaiy();
        }
        zbaiw zbaiwVar = null;
        if (i10 == 4) {
            return new zbaix(zbaiwVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
