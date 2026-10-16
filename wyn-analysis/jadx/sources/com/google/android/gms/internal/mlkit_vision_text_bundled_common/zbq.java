package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbq extends zbuf implements zbvn {
    private static final zbq zbb;
    private zbun zbd = zbuf.zby();
    private int zbe;

    static {
        zbq zbqVar = new zbq();
        zbb = zbqVar;
        zbuf.zbD(zbq.class, zbqVar);
    }

    private zbq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"zbd", zbn.class, "zbe"});
        }
        if (i10 == 3) {
            return new zbq();
        }
        zbo zboVar = null;
        if (i10 == 4) {
            return new zbp(zboVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
