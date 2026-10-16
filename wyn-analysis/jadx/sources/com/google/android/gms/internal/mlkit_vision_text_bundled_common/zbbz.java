package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbbz extends zbuf implements zbvn {
    private static final zbbz zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private zbbw zbf;

    static {
        zbbz zbbzVar = new zbbz();
        zbb = zbbzVar;
        zbuf.zbD(zbbz.class, zbbzVar);
    }

    private zbbz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zbd", "zbe", zbgr.class, "zbf"});
        }
        if (i10 == 3) {
            return new zbbz();
        }
        zbbx zbbxVar = null;
        if (i10 == 4) {
            return new zbby(zbbxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
