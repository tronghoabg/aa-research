package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbcc extends zbuf implements zbvn {
    private static final zbcc zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        zbcc zbccVar = new zbcc();
        zbb = zbccVar;
        zbuf.zbD(zbcc.class, zbccVar);
    }

    private zbcc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbcc();
        }
        zbca zbcaVar = null;
        if (i10 == 4) {
            return new zbcb(zbcaVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
