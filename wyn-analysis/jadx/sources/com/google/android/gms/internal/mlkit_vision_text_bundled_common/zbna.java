package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbna extends zbuf implements zbvn {
    private static final zbna zbb;
    private int zbd;
    private zbmd zbf;
    private byte zbg = 2;
    private String zbe = "DefaultInputStreamHandler";

    static {
        zbna zbnaVar = new zbna();
        zbb = zbnaVar;
        zbuf.zbD(zbna.class, zbnaVar);
    }

    private zbna() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbna();
        }
        zbmy zbmyVar = null;
        if (i10 == 4) {
            return new zbmz(zbmyVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
