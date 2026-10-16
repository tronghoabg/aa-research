package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaq extends zbuf implements zbvn {
    private static final zbaq zbb;
    private int zbd;
    private double zbe;
    private double zbf;

    static {
        zbaq zbaqVar = new zbaq();
        zbb = zbaqVar;
        zbuf.zbD(zbaq.class, zbaqVar);
    }

    private zbaq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbaq();
        }
        zbao zbaoVar = null;
        if (i10 == 4) {
            return new zbap(zbaoVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
