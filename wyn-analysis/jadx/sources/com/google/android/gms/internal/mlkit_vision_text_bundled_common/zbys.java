package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbys extends zbuf implements zbvn {
    private static final zbys zbb;
    private int zbd;
    private int zbe;
    private int zbf = 100;
    private int zbg;

    static {
        zbys zbysVar = new zbys();
        zbb = zbysVar;
        zbuf.zbD(zbys.class, zbysVar);
    }

    private zbys() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zbd", "zbe", zbyq.zba, "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbys();
        }
        zbwz zbwzVar = null;
        if (i10 == 4) {
            return new zbyr(zbwzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
