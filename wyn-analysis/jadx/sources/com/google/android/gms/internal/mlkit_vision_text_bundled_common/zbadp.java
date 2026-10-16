package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbadp extends zbuf implements zbvn {
    private static final zbadp zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private String zbf = "";
    private float zbg;

    static {
        zbadp zbadpVar = new zbadp();
        zbb = zbadpVar;
        zbuf.zbD(zbadp.class, zbadpVar);
    }

    private zbadp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ခ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbadp();
        }
        zbadn zbadnVar = null;
        if (i10 == 4) {
            return new zbado(zbadnVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
