package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbahp extends zbuf implements zbvn {
    private static final zbahp zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        zbahp zbahpVar = new zbahp();
        zbb = zbahpVar;
        zbuf.zbD(zbahp.class, zbahpVar);
    }

    private zbahp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003\u0001", new Object[]{"zbe", "zbd", "zbf"});
        }
        if (i10 == 3) {
            return new zbahp();
        }
        zbagx zbagxVar = null;
        if (i10 == 4) {
            return new zbaho(zbagxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
