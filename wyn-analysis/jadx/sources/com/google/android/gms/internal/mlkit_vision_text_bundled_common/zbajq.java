package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbajq extends zbuf implements zbvn {
    private static final zbajq zbb;
    private zbun zbd = zbuf.zby();
    private zbun zbe = zbuf.zby();

    static {
        zbajq zbajqVar = new zbajq();
        zbb = zbajqVar;
        zbuf.zbD(zbajq.class, zbajqVar);
    }

    private zbajq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zbd", zbajk.class, "zbe", zbajn.class});
        }
        if (i10 == 3) {
            return new zbajq();
        }
        zbajo zbajoVar = null;
        if (i10 == 4) {
            return new zbajp(zbajoVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
