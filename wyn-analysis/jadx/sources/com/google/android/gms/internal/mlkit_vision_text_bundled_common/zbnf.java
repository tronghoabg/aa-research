package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbnf extends zbuf implements zbvn {
    private static final zbnf zbb;
    private int zbd;
    private int zbe;
    private zbgo zbf;
    private String zbg = "";

    static {
        zbnf zbnfVar = new zbnf();
        zbb = zbnfVar;
        zbuf.zbD(zbnf.class, zbnfVar);
    }

    private zbnf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbnf();
        }
        zbnd zbndVar = null;
        if (i10 == 4) {
            return new zbne(zbndVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
