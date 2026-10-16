package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbyj extends zbuf implements zbvn {
    private static final zbyj zbb;
    private int zbd;
    private boolean zbe;
    private int zbf;
    private int zbh;
    private int zbi;
    private int zbj;
    private int zbk;
    private boolean zbg = true;
    private String zbl = "";
    private String zbm = "";

    static {
        zbyj zbyjVar = new zbyj();
        zbb = zbyjVar;
        zbuf.zbD(zbyj.class, zbyjVar);
    }

    private zbyj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            zbuj zbujVar = zbyk.zba;
            return zbuf.zbA(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zbd", "zbe", "zbf", zbyl.zba, "zbg", "zbh", zbyh.zba, "zbi", zbujVar, "zbj", zbujVar, "zbk", zbujVar, "zbl", "zbm"});
        }
        if (i10 == 3) {
            return new zbyj();
        }
        zbwz zbwzVar = null;
        if (i10 == 4) {
            return new zbyi(zbwzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
