package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbgl extends zbuf implements zbvn {
    private static final zbgl zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbgl zbglVar = new zbgl();
        zbb = zbglVar;
        zbuf.zbD(zbgl.class, zbglVar);
    }

    private zbgl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbgd.class});
        }
        if (i10 == 3) {
            return new zbgl();
        }
        zbgj zbgjVar = null;
        if (i10 == 4) {
            return new zbgk(zbgjVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
