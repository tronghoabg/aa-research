package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbadb extends zbub implements zbvn {
    private static final zbadb zbd;
    private int zbe;
    private zbact zbf;
    private float zbh;
    private float zbi;
    private zbact zbl;
    private zbacl zbm;
    private byte zbo = 2;
    private zbun zbg = zbuf.zby();
    private zbun zbj = zbuf.zby();
    private zbtc zbk = zbtc.zbb;
    private zbun zbn = zbuf.zby();

    static {
        zbadb zbadbVar = new zbadb();
        zbd = zbadbVar;
        zbuf.zbD(zbadb.class, zbadbVar);
    }

    private zbadb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbo);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbd, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zbe", "zbf", "zbg", zbada.class, "zbh", "zbj", zbacw.class, "zbm", "zbn", zbacr.class, "zbk", "zbl", "zbi"});
        }
        if (i10 == 3) {
            return new zbadb();
        }
        zbacp zbacpVar = null;
        if (i10 == 4) {
            return new zbacu(zbacpVar);
        }
        if (i10 == 5) {
            return zbd;
        }
        this.zbo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
