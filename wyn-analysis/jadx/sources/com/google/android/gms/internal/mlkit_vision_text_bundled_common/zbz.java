package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbz extends zbuf implements zbvn {
    private static final zbz zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbz zbzVar = new zbz();
        zbb = zbzVar;
        zbuf.zbD(zbz.class, zbzVar);
    }

    private zbz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbac.class});
        }
        if (i10 == 3) {
            return new zbz();
        }
        zbx zbxVar = null;
        if (i10 == 4) {
            return new zby(zbxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
