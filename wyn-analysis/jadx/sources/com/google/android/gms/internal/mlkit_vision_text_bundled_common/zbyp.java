package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbyp extends zbuf implements zbvn {
    private static final zbyp zbb;
    private int zbd;
    private boolean zbf;
    private int zbg;
    private boolean zbj;
    private int zbm;
    private int zbn;
    private boolean zbo;
    private int zbe = -1;
    private zbtc zbh = zbtc.zbb;
    private String zbi = "";
    private boolean zbk = true;
    private boolean zbl = true;

    static {
        zbyp zbypVar = new zbyp();
        zbb = zbypVar;
        zbuf.zbD(zbyp.class, zbypVar);
    }

    private zbyp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            zbuj zbujVar = zbyo.zba;
            return zbuf.zbA(zbb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zbd", "zbe", "zbf", "zbg", zbyn.zba, "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", zbujVar, "zbn", zbujVar, "zbo"});
        }
        if (i10 == 3) {
            return new zbyp();
        }
        zbwz zbwzVar = null;
        if (i10 == 4) {
            return new zbym(zbwzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
