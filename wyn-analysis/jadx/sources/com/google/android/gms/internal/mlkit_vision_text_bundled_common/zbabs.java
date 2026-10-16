package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbabs extends zbuf implements zbvn {
    private static final zbabs zbb;
    private int zbd;
    private zbuk zbe = zbuf.zbv();
    private zbuk zbf = zbuf.zbv();
    private int zbg;
    private int zbh;
    private int zbi;
    private int zbj;

    static {
        zbabs zbabsVar = new zbabs();
        zbb = zbabsVar;
        zbuf.zbD(zbabs.class, zbabsVar);
    }

    private zbabs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i10 == 3) {
            return new zbabs();
        }
        zbabq zbabqVar = null;
        if (i10 == 4) {
            return new zbabr(zbabqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
