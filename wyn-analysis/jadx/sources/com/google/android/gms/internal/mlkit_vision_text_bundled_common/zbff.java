package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbff extends zbuf implements zbvn {
    private static final zbff zbb;
    private int zbd;
    private float zbe;

    static {
        zbff zbffVar = new zbff();
        zbb = zbffVar;
        zbuf.zbD(zbff.class, zbffVar);
    }

    private zbff() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i10 == 3) {
            return new zbff();
        }
        zbfd zbfdVar = null;
        if (i10 == 4) {
            return new zbfe(zbfdVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
