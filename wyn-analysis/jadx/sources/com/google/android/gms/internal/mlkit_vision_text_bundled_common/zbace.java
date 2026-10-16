package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbace extends zbuf implements zbvn {
    private static final zbace zbb;
    private int zbd;
    private int zbe;
    private zbtc zbf = zbtc.zbb;
    private String zbg = "";
    private float zbh;

    static {
        zbace zbaceVar = new zbace();
        zbb = zbaceVar;
        zbuf.zbD(zbace.class, zbaceVar);
    }

    private zbace() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new zbace();
        }
        zbabw zbabwVar = null;
        if (i10 == 4) {
            return new zbacd(zbabwVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
