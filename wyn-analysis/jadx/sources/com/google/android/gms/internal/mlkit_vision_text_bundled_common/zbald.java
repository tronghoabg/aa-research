package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbald extends zbuf implements zbvn {
    private static final zbald zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbald zbaldVar = new zbald();
        zbb = zbaldVar;
        zbuf.zbD(zbald.class, zbaldVar);
    }

    private zbald() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbala.class});
        }
        if (i10 == 3) {
            return new zbald();
        }
        zbalb zbalbVar = null;
        if (i10 == 4) {
            return new zbalc(zbalbVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
