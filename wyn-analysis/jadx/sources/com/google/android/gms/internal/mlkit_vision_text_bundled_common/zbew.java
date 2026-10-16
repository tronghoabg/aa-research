package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbew extends zbuf implements zbvn {
    private static final zbew zbb;
    private int zbd;
    private boolean zbe;
    private float zbf = 0.2f;
    private zbun zbg = zbuf.zby();

    static {
        zbew zbewVar = new zbew();
        zbb = zbewVar;
        zbuf.zbD(zbew.class, zbewVar);
    }

    private zbew() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0004\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", zbez.class});
        }
        if (i10 == 3) {
            return new zbew();
        }
        zbeu zbeuVar = null;
        if (i10 == 4) {
            return new zbev(zbeuVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
