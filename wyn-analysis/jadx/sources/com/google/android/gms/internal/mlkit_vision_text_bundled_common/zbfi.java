package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbfi extends zbuf implements zbvn {
    private static final zbfi zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";
    private String zbg = "";

    static {
        zbfi zbfiVar = new zbfi();
        zbb = zbfiVar;
        zbuf.zbD(zbfi.class, zbfiVar);
    }

    private zbfi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbfi();
        }
        zbfg zbfgVar = null;
        if (i10 == 4) {
            return new zbfh(zbfgVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
