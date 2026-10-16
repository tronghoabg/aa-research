package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbhc extends zbuf implements zbvn {
    private static final zbhc zbb;
    private int zbd;
    private String zbe = "";
    private float zbf;

    static {
        zbhc zbhcVar = new zbhc();
        zbb = zbhcVar;
        zbuf.zbD(zbhc.class, zbhcVar);
    }

    private zbhc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbhc();
        }
        zbha zbhaVar = null;
        if (i10 == 4) {
            return new zbhb(zbhaVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
