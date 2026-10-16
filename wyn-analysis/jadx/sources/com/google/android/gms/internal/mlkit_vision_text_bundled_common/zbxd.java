package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbxd extends zbuf implements zbvn {
    private static final zbxd zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbxd zbxdVar = new zbxd();
        zbb = zbxdVar;
        zbuf.zbD(zbxd.class, zbxdVar);
    }

    private zbxd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbxf.class});
        }
        if (i10 == 3) {
            return new zbxd();
        }
        zbwz zbwzVar = null;
        if (i10 == 4) {
            return new zbxc(zbwzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
