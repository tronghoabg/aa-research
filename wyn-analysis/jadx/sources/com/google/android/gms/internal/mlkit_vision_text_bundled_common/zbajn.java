package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbajn extends zbuf implements zbvn {
    private static final zbajn zbb;
    private String zbd = "";
    private zbun zbe = zbuf.zby();
    private String zbf = "";

    static {
        zbajn zbajnVar = new zbajn();
        zbb = zbajnVar;
        zbuf.zbD(zbajn.class, zbajnVar);
    }

    private zbajn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"zbd", "zbe", zbajk.class, "zbf"});
        }
        if (i10 == 3) {
            return new zbajn();
        }
        zbajl zbajlVar = null;
        if (i10 == 4) {
            return new zbajm(zbajlVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
